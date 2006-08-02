/*
 * Copyright (c) 2006 Erik Tollerud (erik.tollerud@gmail.com) All Rights Reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *   
 * - Redistribution of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *    
 * - Redistribution in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 *   
 * The names of Erik Tollerud, Sun Microsystems, Inc. or the names of
 * contributors may not be used to endorse or promote products derived from
 * this software without specific prior written permission.
 *    
 * This software is provided "AS IS," without a warranty of any kind. ALL
 * EXPRESS OR IMPLIED CONDITIONS, REPRESENTATIONS AND WARRANTIES,
 * INCLUDING ANY IMPLIED WARRANTY OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE OR NON-INFRINGEMENT, ARE HEREBY EXCLUDED. ERIK TOLLERUD,
 * SUN MICROSYSTEMS, INC. ("SUN"), AND SUN'S LICENSORS SHALL NOT BE LIABLE FOR
 * ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR
 * DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES. IN NO EVENT WILL BEN
 * CHAPPELL, SUN, OR SUN'S LICENSORS BE LIABLE FOR ANY LOST REVENUE, PROFIT 
 * OR DATA, OR FOR DIRECT, INDIRECT, SPECIAL, CONSEQUENTIAL, INCIDENTAL OR
 * PUNITIVE DAMAGES, HOWEVER CAUSED AND REGARDLESS OF THE THEORY OF LIABILITY,
 * ARISING OUT OF THE USE OF OR INABILITY TO USE THIS SOFTWARE, EVEN IF BEN
 * CHAPPELL OR SUN HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGES.
 *   
 * You acknowledge that this software is not designed or intended for use
 * in the design, construction, operation or maintenance of any nuclear
 * facility.
 */

package net.java.joglutils.lighting;

/**
 *
 * @author  Erik J. Tollerud
 */
public class LightPanel extends javax.swing.JPanel {
    
    /** Creates new form LightPanel */
    public LightPanel() {
        initComponents();
        lightToPanel(new Light());
    }
    public LightPanel(Light l) {
        initComponents();
        lightToPanel(l);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        lightNumField = new javax.swing.JTextField();
        ambientButton = new javax.swing.JButton();
        diffuseButton = new javax.swing.JButton();
        specularButton = new javax.swing.JButton();
        posXField = new javax.swing.JFormattedTextField(java.text.NumberFormat.getInstance());
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        posYField = new javax.swing.JFormattedTextField(java.text.NumberFormat.getInstance());
        posZField = new javax.swing.JFormattedTextField(java.text.NumberFormat.getInstance());
        posWField = new javax.swing.JFormattedTextField(java.text.NumberFormat.getInstance());
        jLabel7 = new javax.swing.JLabel();
        spotXField = new javax.swing.JFormattedTextField(java.text.NumberFormat.getInstance());
        spotYField = new javax.swing.JFormattedTextField(java.text.NumberFormat.getInstance());
        spotZField = new javax.swing.JFormattedTextField(java.text.NumberFormat.getInstance());
        spotCutoffField = new javax.swing.JFormattedTextField(java.text.NumberFormat.getInstance());
        spotExponentField = new javax.swing.JFormattedTextField(java.text.NumberFormat.getInstance());
        conCoeffField = new javax.swing.JFormattedTextField(java.text.NumberFormat.getInstance());
        linCoeffField = new javax.swing.JFormattedTextField(java.text.NumberFormat.getInstance());
        quadCoeffField = new javax.swing.JFormattedTextField(java.text.NumberFormat.getInstance());
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        jLabel1.setText("Light Number:");

        lightNumField.setEditable(false);
        lightNumField.setText("0");

        ambientButton.setText("Ambient");
        ambientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorAction(evt);
            }
        });

        diffuseButton.setText("Diffuse");
        diffuseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorAction(evt);
            }
        });

        specularButton.setText("Specular");
        specularButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorAction(evt);
            }
        });

        posXField.setText("num");

        jLabel2.setText("Postition");

        jLabel3.setText("x");

        jLabel4.setText("y");

        jLabel5.setText("z");

        jLabel6.setText("w");

        posYField.setText("num");

        posZField.setText("num");

        posWField.setText("num");

        jLabel7.setText("Spot Direction");

        spotXField.setText("num");

        spotYField.setText("num");

        spotZField.setText("num");

        spotCutoffField.setText("num");

        spotExponentField.setText("num");

        conCoeffField.setText("num");

        linCoeffField.setText("num");

        quadCoeffField.setText("num");

        jLabel8.setText("Spotlight Cutoff");

        jLabel9.setText("Spotlight Exponent");

        jLabel10.setText("Attenuation:");

        jLabel11.setText("Constant");

        jLabel12.setText("Linear");

        jLabel13.setText("Quadratic");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(10, 10, 10)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(11, 11, 11)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(ambientButton)
                                    .add(diffuseButton)
                                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                        .add(jLabel10)
                                        .add(specularButton))))
                            .add(layout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(layout.createSequentialGroup()
                                        .add(10, 10, 10)
                                        .add(spotCutoffField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(jLabel8))))
                        .add(27, 27, 27))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(lightNumField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(jLabel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(jLabel3))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel2)
                                    .add(posXField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(posYField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(layout.createSequentialGroup()
                                        .add(jLabel5)
                                        .add(7, 7, 7))
                                    .add(layout.createSequentialGroup()
                                        .add(jLabel6)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)))
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(posWField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(posZField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                        .add(8, 8, 8)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel7)
                            .add(spotYField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(spotXField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(spotZField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel9)
                            .add(layout.createSequentialGroup()
                                .add(10, 10, 10)
                                .add(spotExponentField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel11)
                            .add(conCoeffField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(linCoeffField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel12))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel13)
                            .add(quadCoeffField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .add(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(ambientButton)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(specularButton)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(diffuseButton))
                            .add(layout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(spotXField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(layout.createSequentialGroup()
                                        .add(jLabel7)
                                        .add(29, 29, 29)))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(spotYField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(spotZField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel8)
                            .add(jLabel9)))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                .add(posXField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jLabel3))
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jLabel2)
                                    .add(lightNumField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabel1))
                                .add(29, 29, 29)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel4)
                            .add(posYField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel5)
                            .add(layout.createSequentialGroup()
                                .add(posZField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(posWField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabel6))))
                        .add(21, 21, 21)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(spotCutoffField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createSequentialGroup()
                        .add(spotExponentField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(5, 5, 5)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(layout.createSequentialGroup()
                            .add(jLabel12)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(linCoeffField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(layout.createSequentialGroup()
                            .add(jLabel11)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(jLabel10)
                                .add(conCoeffField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(layout.createSequentialGroup()
                        .add(jLabel13)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(quadCoeffField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void colorAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorAction
        javax.swing.JButton src = (javax.swing.JButton)evt.getSource();
        
        java.awt.Color c = javax.swing.JColorChooser.showDialog(this,src.getText()+" Color",src.getForeground());
        if (c != null)
            src.setForeground(c);
    }//GEN-LAST:event_colorAction
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ambientButton;
    private javax.swing.JFormattedTextField conCoeffField;
    private javax.swing.JButton diffuseButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lightNumField;
    private javax.swing.JFormattedTextField linCoeffField;
    private javax.swing.JFormattedTextField posWField;
    private javax.swing.JFormattedTextField posXField;
    private javax.swing.JFormattedTextField posYField;
    private javax.swing.JFormattedTextField posZField;
    private javax.swing.JFormattedTextField quadCoeffField;
    private javax.swing.JButton specularButton;
    private javax.swing.JFormattedTextField spotCutoffField;
    private javax.swing.JFormattedTextField spotExponentField;
    private javax.swing.JFormattedTextField spotXField;
    private javax.swing.JFormattedTextField spotYField;
    private javax.swing.JFormattedTextField spotZField;
    // End of variables declaration//GEN-END:variables

    public void panelToLight(Light l) {
        l.setAmbient(this.ambientButton.getForeground());
        l.setDiffuse(this.diffuseButton.getForeground());
        l.setSpecular(this.specularButton.getForeground());
        float[] vec = new float[3];
        vec[0] = ((Number)this.posXField.getValue()).floatValue();
        vec[1] = ((Number)this.posYField.getValue()).floatValue();
        vec[2] = ((Number)this.posZField.getValue()).floatValue();
        l.setLightPosition(vec);
        l.setLightW(((Number)this.posWField.getValue()).floatValue());
        vec[0] = ((Number)this.spotXField.getValue()).floatValue();
        vec[1] = ((Number)this.spotYField.getValue()).floatValue();
        vec[2] = ((Number)this.spotZField.getValue()).floatValue();
        l.setSpotDirection(vec);
        l.setSpotCutoff(((Number)this.spotCutoffField.getValue()).floatValue());
        l.setSpotExponent(((Number)this.spotExponentField.getValue()).floatValue());
        l.setConstantAttenuation(((Number)this.conCoeffField.getValue()).floatValue());
        l.setLinearAttenuation(((Number)this.linCoeffField.getValue()).floatValue());
        l.setQuadraticAttenuation(((Number)this.quadCoeffField.getValue()).floatValue());
        
    }
    public void lightToPanel(Light l) {
        this.lightNumField.setText(new Integer(l.getLightNumber()).toString());
        this.ambientButton.setForeground(l.getAmbient());
        this.diffuseButton.setForeground(l.getDiffuse());
        this.specularButton.setForeground(l.getSpecular());
        float[] pos = l.getLightPosition();
        this.posXField.setValue(pos[0]);
        this.posYField.setValue(pos[1]);
        this.posZField.setValue(pos[2]);
        this.posWField.setValue(l.getLightW());
        float[] spot = l.getSpotDirection();
        this.spotXField.setValue(spot[0]);
        this.spotYField.setValue(spot[1]);
        this.spotZField.setValue(spot[2]);
        this.spotCutoffField.setValue(l.getSpotCutoff());
        this.spotExponentField.setValue(l.getSpotExponent());
        this.conCoeffField.setValue(l.getConstantAttenuation());
        this.linCoeffField.setValue(l.getLinearAttenuation());
        this.quadCoeffField.setValue(l.getQuadraticAttenuation());
        
        
    }
    public static void main(String args[]) {
        Light l = new Light();
        LightPanel lp = new LightPanel(l);
        net.java.joglutils.JPanelDialog jdp = new net.java.joglutils.JPanelDialog(lp);
        jdp.setTitle("the new title");
        System.err.println("bf modal show");
        boolean accept = jdp.showAsModal();
        System.err.println("after modal show");
        if (accept) {
            lp.panelToLight(l);
            System.err.println("Light Number:"+l.getLightNumber()+" const atten:"+l.getConstantAttenuation());
        } else
            System.err.println("cancelled");
        
    }
}
