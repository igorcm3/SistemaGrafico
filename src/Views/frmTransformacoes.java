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

    /**
     * Creates new form frmTransformacoes
     */
    public frmTransformacoes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guia1 = new javax.swing.JTabbedPane();
        painelTranslatar = new javax.swing.JPanel();
        painelEscalonar = new javax.swing.JPanel();
        painelRotacionar = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        guia1.setName("Translatar"); // NOI18N

        javax.swing.GroupLayout painelTranslatarLayout = new javax.swing.GroupLayout(painelTranslatar);
        painelTranslatar.setLayout(painelTranslatarLayout);
        painelTranslatarLayout.setHorizontalGroup(
            painelTranslatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 549, Short.MAX_VALUE)
        );
        painelTranslatarLayout.setVerticalGroup(
            painelTranslatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );

        guia1.addTab("Translatar", painelTranslatar);

        javax.swing.GroupLayout painelEscalonarLayout = new javax.swing.GroupLayout(painelEscalonar);
        painelEscalonar.setLayout(painelEscalonarLayout);
        painelEscalonarLayout.setHorizontalGroup(
            painelEscalonarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 549, Short.MAX_VALUE)
        );
        painelEscalonarLayout.setVerticalGroup(
            painelEscalonarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );

        guia1.addTab("Escalonar", painelEscalonar);

        javax.swing.GroupLayout painelRotacionarLayout = new javax.swing.GroupLayout(painelRotacionar);
        painelRotacionar.setLayout(painelRotacionarLayout);
        painelRotacionarLayout.setHorizontalGroup(
            painelRotacionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 549, Short.MAX_VALUE)
        );
        painelRotacionarLayout.setVerticalGroup(
            painelRotacionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 272, Short.MAX_VALUE)
        );

        guia1.addTab("Rotacionar", painelRotacionar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(guia1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(guia1)
        );

        guia1.getAccessibleContext().setAccessibleName("Translatar");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmTransformacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTransformacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTransformacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTransformacoes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTransformacoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane guia1;
    private javax.swing.JPanel painelEscalonar;
    private javax.swing.JPanel painelRotacionar;
    private javax.swing.JPanel painelTranslatar;
    // End of variables declaration//GEN-END:variables
}
