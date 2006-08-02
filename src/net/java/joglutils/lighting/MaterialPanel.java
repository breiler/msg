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
public class MaterialPanel extends javax.swing.JPanel {
    
    /** Creates new form MaterialPanel */
    public MaterialPanel() {
        initComponents();
        matToPanel(new Material());
    }
    public MaterialPanel(Material m) {
        initComponents();
        matToPanel(m);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        shininessField = new javax.swing.JFormattedTextField(java.text.NumberFormat.getInstance());
        jLabel1 = new javax.swing.JLabel();
        specularButton = new javax.swing.JButton();
        diffuseButton = new javax.swing.JButton();
        ambientButton = new javax.swing.JButton();
        emissiveButton = new javax.swing.JButton();

        shininessField.setText("num");

        jLabel1.setText("Shininess");

        specularButton.setText("Specular");
        specularButton.addActionListener(new java.awt.event.ActionListener() {
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

        ambientButton.setText("Ambient");
        ambientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorAction(evt);
            }
        });

        emissiveButton.setText("Emissive");
        emissiveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorAction(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                            .add(layout.createSequentialGroup()
                                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(diffuseButton))
                            .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                .add(23, 23, 23)
                                .add(ambientButton)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(specularButton)
                            .add(emissiveButton)))
                    .add(layout.createSequentialGroup()
                        .add(56, 56, 56)
                        .add(jLabel1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(shininessField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(ambientButton)
                    .add(specularButton))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(diffuseButton)
                    .add(emissiveButton))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(shininessField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    private javax.swing.JButton diffuseButton;
    private javax.swing.JButton emissiveButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JFormattedTextField shininessField;
    private javax.swing.JButton specularButton;
    // End of variables declaration//GEN-END:variables
    public void matToPanel(Material m) {
        this.shininessField.setValue(m.getShininess());
        this.ambientButton.setForeground(m.getAmbient());
        this.diffuseButton.setForeground(m.getDiffuse());
        this.specularButton.setForeground(m.getSpecular());
        this.emissiveButton.setForeground(m.getEmissive());
        
    }
    public void panelToMat(Material m) {
        m.setShininess(((Number)this.shininessField.getValue()).floatValue());
        m.setAmbient(this.ambientButton.getForeground());
        m.setDiffuse(this.diffuseButton.getForeground());
        m.setSpecular(this.specularButton.getForeground());
        m.setEmissive(this.emissiveButton.getForeground());
    }
    public static void main(String[] args) {
        Material m = new Material();
        MaterialPanel mp = new MaterialPanel(m);
        net.java.joglutils.JPanelDialog jdp = new net.java.joglutils.JPanelDialog(mp);
        jdp.setTitle("the new title");
        System.err.println("bf modal show");
        boolean accept = jdp.showAsModal();
        System.err.println("after modal show");
        if (accept) {
            mp.panelToMat(m);
            System.err.println("shininess:"+m.getShininess()+" Emissive color:"+m.getEmissive());
        } else
            System.err.println("cancelled");
    }
            
}
