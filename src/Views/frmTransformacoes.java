/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

/**
 *
 * @author coron
 */
public class frmTransformacoes extends javax.swing.JFrame {

    private frmPrincipal framePrincipal;

    /**
     * Creates new form frmTransformacoes
     */
    public frmTransformacoes(frmPrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
        initComponents();
        setLocationRelativeTo(null);
        jRadioButton4.setSelected(true);
        jRadioButton1.setSelected(true);
    }

    
    // CHAMAR ESSA FUNÇÃO NO EVENTO KEYTYPED DE TODOS OS TEXTFELD PARA N DEIXAR IR LETRAS.
    public void permitirSomenteNumeros(java.awt.event.KeyEvent evt) {
        String caracteres = "0987654321-.";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        painelGuias = new javax.swing.JTabbedPane();
        painelTranslatar = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tx = new javax.swing.JTextField();
        ty = new javax.swing.JTextField();
        painelEscalonar = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sx = new javax.swing.JTextField();
        sy = new javax.swing.JTextField();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        painelRotacionar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        angulo = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        btconfirmatranslação = new javax.swing.JButton();
        btcancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Transformações");
        setMaximumSize(new java.awt.Dimension(340, 350));
        setMinimumSize(new java.awt.Dimension(340, 350));
        setPreferredSize(new java.awt.Dimension(340, 350));
        setResizable(false);
        setSize(new java.awt.Dimension(340, 350));

        painelGuias.setName("Translatar"); // NOI18N

        painelTranslatar.setMaximumSize(new java.awt.Dimension(304, 216));
        painelTranslatar.setMinimumSize(new java.awt.Dimension(304, 216));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Coordenadas"));

        jLabel2.setText("Ty");

        jLabel1.setText("Tx");

        tx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txActionPerformed(evt);
            }
        });
        tx.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txKeyTyped(evt);
            }
        });

        ty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tyKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ty, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tx, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout painelTranslatarLayout = new javax.swing.GroupLayout(painelTranslatar);
        painelTranslatar.setLayout(painelTranslatarLayout);
        painelTranslatarLayout.setHorizontalGroup(
            painelTranslatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTranslatarLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        painelTranslatarLayout.setVerticalGroup(
            painelTranslatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTranslatarLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );

        painelGuias.addTab("Translatar", painelTranslatar);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Coordenadas"));

        jLabel3.setText("Sy");

        jLabel4.setText("Sx");

        sx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sxActionPerformed(evt);
            }
        });
        sx.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sxKeyTyped(evt);
            }
        });

        sy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                syKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sy, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sx, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Escalonamento em relação a origem");
        jRadioButton4.setActionCommand("r1");

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("Escalonamento apartir de um ponto");
        jRadioButton5.setActionCommand("r2");

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setText("Escalonamento natural ");
        jRadioButton6.setActionCommand("r3");

        javax.swing.GroupLayout painelEscalonarLayout = new javax.swing.GroupLayout(painelEscalonar);
        painelEscalonar.setLayout(painelEscalonarLayout);
        painelEscalonarLayout.setHorizontalGroup(
            painelEscalonarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEscalonarLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(painelEscalonarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton6)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        painelEscalonarLayout.setVerticalGroup(
            painelEscalonarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelEscalonarLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton6)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        painelGuias.addTab("Escalonar", painelEscalonar);

        jLabel5.setText("Angulo");

        angulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anguloActionPerformed(evt);
            }
        });
        angulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                anguloKeyTyped(evt);
            }
        });

        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setText("Rotação em relação a origem");
        jRadioButton1.setActionCommand("r1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setText("Rotação em relação a um ponto");
        jRadioButton2.setActionCommand("r2");

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("Rotação natural");
        jRadioButton3.setActionCommand("r3");

        javax.swing.GroupLayout painelRotacionarLayout = new javax.swing.GroupLayout(painelRotacionar);
        painelRotacionar.setLayout(painelRotacionarLayout);
        painelRotacionarLayout.setHorizontalGroup(
            painelRotacionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRotacionarLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(painelRotacionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelRotacionarLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(angulo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        painelRotacionarLayout.setVerticalGroup(
            painelRotacionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelRotacionarLayout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(painelRotacionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(angulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28)
                .addComponent(jRadioButton1)
                .addGap(15, 15, 15)
                .addComponent(jRadioButton2)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton3)
                .addGap(39, 39, 39))
        );

        painelGuias.addTab("Rotacionar", painelRotacionar);

        btconfirmatranslação.setText("Confirmar");
        btconfirmatranslação.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btconfirmatranslaçãoActionPerformed(evt);
            }
        });

        btcancelar.setText("Cancelar");
        btcancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelGuias)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btconfirmatranslação)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btcancelar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelGuias)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btconfirmatranslação)
                    .addComponent(btcancelar))
                .addGap(23, 23, 23))
        );

        painelGuias.getAccessibleContext().setAccessibleName("Translatar");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txActionPerformed

    private void btconfirmatranslaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btconfirmatranslaçãoActionPerformed
        switch (painelGuias.getSelectedIndex()) {
            // index 0 primeiro painel = translação.
            case 0:
                framePrincipal.transformacoes(Double.parseDouble(tx.getText()), Double.parseDouble(ty.getText()),0);
                break;
            case 1:
                switch(buttonGroup1.getSelection().getActionCommand()){
                    case "r1":
                        framePrincipal.transformacoes(Double.parseDouble(sx.getText()), Double.parseDouble(sy.getText()),1);
                        
                        break;
                    case "r2":
                        framePrincipal.transformacoes(Double.parseDouble(sx.getText()), Double.parseDouble(sy.getText()),2);
                        break;
                    case "r3":
                        framePrincipal.transformacoes(Double.parseDouble(sx.getText()), Double.parseDouble(sy.getText()),3);
                        break;
                }
                
                break;
            case 2:
                switch(buttonGroup2.getSelection().getActionCommand()){
                    case "r1":
                        framePrincipal.transformacoes(Double.parseDouble(angulo.getText()),0,4);
                        
                        break;
                    case "r2":
                        framePrincipal.transformacoes(Double.parseDouble(angulo.getText()),0,5);
                        break;
                    case "r3":
                        framePrincipal.transformacoes(Double.parseDouble(angulo.getText()),0,6);
                        break;
                }
                
                break;
            }
        dispose();
    }//GEN-LAST:event_btconfirmatranslaçãoActionPerformed

    private void btcancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btcancelarActionPerformed

    private void txKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txKeyTyped
        // TODO add your handling code here:
        permitirSomenteNumeros(evt);
    }//GEN-LAST:event_txKeyTyped

    private void tyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tyKeyTyped
        // TODO add your handling code here:
        permitirSomenteNumeros(evt);
    }//GEN-LAST:event_tyKeyTyped

    private void sxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sxActionPerformed

    private void sxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sxKeyTyped
        // TODO add your handling code here:
        permitirSomenteNumeros(evt);
    }//GEN-LAST:event_sxKeyTyped

    private void syKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_syKeyTyped
        // TODO add your handling code here:
        permitirSomenteNumeros(evt);
    }//GEN-LAST:event_syKeyTyped

    private void anguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anguloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anguloActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void anguloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_anguloKeyTyped
        // TODO add your handling code here:
        permitirSomenteNumeros(evt);
    }//GEN-LAST:event_anguloKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField angulo;
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton btconfirmatranslação;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JPanel painelEscalonar;
    private javax.swing.JTabbedPane painelGuias;
    private javax.swing.JPanel painelRotacionar;
    private javax.swing.JPanel painelTranslatar;
    private javax.swing.JTextField sx;
    private javax.swing.JTextField sy;
    private javax.swing.JTextField tx;
    private javax.swing.JTextField ty;
    // End of variables declaration//GEN-END:variables
}
