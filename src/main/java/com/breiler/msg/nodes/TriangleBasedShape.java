/*
 * Copyright (c) 2007 Sun Microsystems, Inc. All Rights Reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 * 
 * - Redistribution of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 * 
 * - Redistribution in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in the
 *   documentation and/or other materials provided with the distribution.
 * 
 * Neither the name of Sun Microsystems, Inc. or the names of
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * 
 * This software is provided "AS IS," without a warranty of any kind. ALL
 * EXPRESS OR IMPLIED CONDITIONS, REPRESENTATIONS AND WARRANTIES,
 * INCLUDING ANY IMPLIED WARRANTY OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE OR NON-INFRINGEMENT, ARE HEREBY EXCLUDED. SUN
 * MICROSYSTEMS, INC. ("SUN") AND ITS LICENSORS SHALL NOT BE LIABLE FOR
 * ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR
 * DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES. IN NO EVENT WILL SUN OR
 * ITS LICENSORS BE LIABLE FOR ANY LOST REVENUE, PROFIT OR DATA, OR FOR
 * DIRECT, INDIRECT, SPECIAL, CONSEQUENTIAL, INCIDENTAL OR PUNITIVE
 * DAMAGES, HOWEVER CAUSED AND REGARDLESS OF THE THEORY OF LIABILITY,
 * ARISING OUT OF THE USE OF OR INABILITY TO USE THIS SOFTWARE, EVEN IF
 * SUN HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGES.
 * 
 * You acknowledge that this software is not designed or intended for use
 * in the design, construction, operation or maintenance of any nuclear
 * facility.
 * 
 */

package com.breiler.msg.nodes;

import com.breiler.msg.actions.Action;
import com.breiler.msg.actions.RayPickAction;
import com.breiler.msg.elements.ModelMatrixElement;
import com.breiler.msg.impl.RayTriangleIntersection;
import com.breiler.msg.math.Line;
import com.breiler.msg.math.MathUtils;
import static com.breiler.msg.math.MathUtils.plus;
import static com.breiler.msg.math.MathUtils.times;
import com.breiler.msg.misc.PickedPoint;
import com.breiler.msg.misc.PrimitiveVertex;
import com.breiler.msg.misc.TriangleCallback;

import javax.vecmath.Matrix4f;
import javax.vecmath.Vector3f;

/** The abstract base class for all shapes in the scene graph which
    render themselves as a collection of triangles. */

public abstract class TriangleBasedShape extends Shape {
  /** Based on the state in the given Action, calls the specified
      triangle callback for each triangle in the shape. Coordinates
      are specified in the local coordinate system of this shape; the
      caller must transform them into the world coordinate system if
      necessary. */
  public abstract void generateTriangles(Action action,
                                         TriangleCallback cb);

  public void rayPick(final RayPickAction action) {
    // The RayPickAction holds the picking ray in world coordinates.
    // Transform this ray into local coordinates to do intersection testing
    // Fetch the current local-to-world matrix
    Matrix4f mat = new Matrix4f(ModelMatrixElement.getInstance(action.getState()).getMatrix());
    // Invert it to get the world-to-local matrix
    mat.invert();
    // Transform the RayPickAction's ray by this matrix
    final Line ray = MathUtils.xformLine(mat, action.getComputedRay());

    // Temporaries
    final RayTriangleIntersection rti = new RayTriangleIntersection();
    final Vector3f tuv = new Vector3f();

    // OK, ready to test
    generateTriangles(action, new TriangleCallback() {
        public void triangleCB(int triangleIndex,
                               PrimitiveVertex v0,
                               int i0,
                               PrimitiveVertex v1,
                               int i1,
                               PrimitiveVertex v2,
                               int i2) {
          if (rti.intersectTriangle(ray,
                                    v0.getCoord(),
                                    v1.getCoord(),
                                    v2.getCoord(),
                                    tuv)) {
            // Compute at least the 3D coordinate of the intersection
            // point for now
            // FIXME: need to compute other things such as the texture
            // coordinates
            PickedPoint p = new PickedPoint();
            // Compute weights of three vertices
            float a = 1.0f - tuv.getY() - tuv.getZ();
            float b = tuv.getY();
            float c = tuv.getZ();
            Vector3f loc = plus(plus(times(v0.getCoord(), a), times(v1.getCoord(), b)), times(v2.getCoord(), c));
            p.setCoord(loc);
            p.setPath(action.getPath().copy());
            action.addPickedPoint(p, tuv.getX());
          }
        }
      });
  }
}
