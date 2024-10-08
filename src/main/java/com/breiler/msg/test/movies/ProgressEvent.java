/*
 * Copyright 2007 Sun Microsystems, Inc., 4150 Network Circle,
 * Santa Clara, California 95054, U.S.A. All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of Sun Microsystems nor the names of its contributors
 *       may be used to endorse or promote products derived from this software
 *       without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.breiler.msg.test.movies;

import java.util.EventObject;

/**
 * Represents a progress event during downloading or uploading of an
 * image.
 *
 * @author Kenneth Russell
 */

public class ProgressEvent<IDENT> extends EventObject {
    private final Object  imageDescriptor;
    private final IDENT   clientIdentifier;
    private final float   fractionCompleted;
    private final boolean isDownload;

    public ProgressEvent(Fetcher<IDENT> source,
                         Object imageDescriptor,
                         IDENT clientIdentifier,
                         float fractionCompleted,
                         boolean isDownload) {
        super(source);
        this.imageDescriptor = imageDescriptor;
        this.clientIdentifier = clientIdentifier;
        this.fractionCompleted = fractionCompleted;
        this.isDownload = isDownload;
    }

    public Object getImageDescriptor() {
        return imageDescriptor;
    }

    public IDENT getClientIdentifier() {
        return clientIdentifier;
    }

    /** Returns a fraction between 0.0f and 1.0f, or a negative number
        if we weren't able to make a determination of the estimated
        image size. */
    public float getFractionCompleted() {
        return fractionCompleted;
    }

    public boolean isDownload() {
        return isDownload;
    }
}
