/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import javax.swing.JOptionPane;

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
    }

    
    // CHAMAR ESSA FUNÇÃO NO EVENTO KEYTYPED DE TODOS OS TEXTFELD PARA N DEIXAR IR LETRAS.
    public void permitirSomenteNumeros(java.awt.event.KeyEvent evt) {
        String caracteres = "0987654321";
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

        painelGuias = new javax.swing.JTabbedPane();
        painelTranslatar = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tx = new javax.swing.JTextField();
        ty = new javax.swing.JTextField();
        painelEscalonar = new javax.swing.JPanel();
        painelRotacionar = new javax.swing.JPanel();
        btconfirmatranslação = new javax.swing.JButton();
        btcancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Transformações");
        setPreferredSize(new java.awt.Dimension(550, 300));
        setResizable(false);

        painelGuias.setName("Translatar"); // NOI18N

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
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ty, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tx, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout painelTranslatarLayout = new javax.swing.GroupLayout(painelTranslatar);
        painelTranslatar.setLayout(painelTranslatarLayout);
        painelTranslatarLayout.setHorizontalGroup(
            painelTranslatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTranslatarLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        painelTranslatarLayout.setVerticalGroup(
            painelTranslatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTranslatarLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        painelGuias.addTab("Translatar", painelTranslatar);

        javax.swing.GroupLayout painelEscalonarLayout = new javax.swing.GroupLayout(painelEscalonar);
        painelEscalonar.setLayout(painelEscalonarLayout);
        painelEscalonarLayout.setHorizontalGroup(
            painelEscalonarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 301, Short.MAX_VALUE)
        );
        painelEscalonarLayout.setVerticalGroup(
            painelEscalonarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 214, Short.MAX_VALUE)
        );

        painelGuias.addTab("Escalonar", painelEscalonar);

        javax.swing.GroupLayout painelRotacionarLayout = new javax.swing.GroupLayout(painelRotacionar);
        painelRotacionar.setLayout(painelRotacionarLayout);
        painelRotacionarLayout.setHorizontalGroup(
            painelRotacionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 301, Short.MAX_VALUE)
        );
        painelRotacionarLayout.setVerticalGroup(
            painelRotacionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 214, Short.MAX_VALUE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btconfirmatranslação)
                .addGap(132, 132, 132)
                .addComponent(btcancelar)
                .addContainerGap())
            .addComponent(painelGuias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelGuias, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btconfirmatranslação)
                    .addComponent(btcancelar))
                .addGap(0, 23, Short.MAX_VALUE))
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
                framePrincipal.translada(Integer.parseInt(tx.getText()), Integer.parseInt(ty.getText()));
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton btconfirmatranslação;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel painelEscalonar;
    private javax.swing.JTabbedPane painelGuias;
    private javax.swing.JPanel painelRotacionar;
    private javax.swing.JPanel painelTranslatar;
    private javax.swing.JTextField tx;
    private javax.swing.JTextField ty;
    // End of variables declaration//GEN-END:variables
}
