/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Primitivas2D.Reta;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.KeyEvent;
import javax.swing.JViewport;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;
import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER;
import javax.swing.UIManager;

/**
 *
 * @author coron
 */
public class frmPrincipal extends javax.swing.JFrame {

    public javax.swing.JFrame frameAtivo;
    public int X0; //metade X e y do painel mundo, serao pontos iniciais de deseneho no viewport 
    public int Y0;

    public void setFrame(javax.swing.JFrame frame) {
        this.frameAtivo = frame;
    }

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        setLookAndFeel();
        initComponents();
        setLocationRelativeTo(null); // faz o frame iniciar centralizado na tela

        // desenhos vao ter o ponto (0,0) de origem a partir desses valores 
        X0 = Math.round(painelMundo.getWidth() / 2);
        Y0 = Math.round(painelMundo.getHeight() / 2);

        desenhaPlanoCartesiano();
        centralizaViewPort();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelFundo = new javax.swing.JPanel();
        spViewport = new javax.swing.JScrollPane();
        painelMundo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        painelOpcoes = new javax.swing.JPanel();
        listaObjetosDesenhados = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btnSetaEsquerda = new javax.swing.JButton();
        btnSetaCima = new javax.swing.JButton();
        btnSetaDireita = new javax.swing.JButton();
        btnSetaBaixo = new javax.swing.JButton();
        btnZoomOut = new javax.swing.JButton();
        btnZoomIn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnPrimitivas = new javax.swing.JToggleButton();
        painelAcessoTransformacoes = new javax.swing.JPanel();
        btnTransformacoes = new javax.swing.JButton();
        btnLimparViewPort = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sismeta gráfico");
        setBackground(new java.awt.Color(240, 238, 238));
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        spViewport.setBackground(new java.awt.Color(255, 255, 255));
        spViewport.setBorder(null);
        spViewport.setMaximumSize(new java.awt.Dimension(250, 250));
        spViewport.setMinimumSize(new java.awt.Dimension(250, 250));
        spViewport.setPreferredSize(new java.awt.Dimension(250, 250));

        painelMundo.setBackground(new java.awt.Color(255, 255, 255));
        painelMundo.setPreferredSize(new java.awt.Dimension(1000, 1000));

        javax.swing.GroupLayout painelMundoLayout = new javax.swing.GroupLayout(painelMundo);
        painelMundo.setLayout(painelMundoLayout);
        painelMundoLayout.setHorizontalGroup(
            painelMundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        painelMundoLayout.setVerticalGroup(
            painelMundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );

        spViewport.setViewportView(painelMundo);

        jLabel1.setText("Viewport");

        painelOpcoes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "teste", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaObjetosDesenhados.setViewportView(jList1);

        btnSetaEsquerda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/seta_esquerda.png"))); // NOI18N
        btnSetaEsquerda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetaEsquerdaActionPerformed(evt);
            }
        });

        btnSetaCima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/seta_cima.png"))); // NOI18N
        btnSetaCima.setMaximumSize(new java.awt.Dimension(63, 39));
        btnSetaCima.setMinimumSize(new java.awt.Dimension(63, 39));
        btnSetaCima.setPreferredSize(new java.awt.Dimension(63, 39));
        btnSetaCima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetaCimaActionPerformed(evt);
            }
        });

        btnSetaDireita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/seta_direita.png"))); // NOI18N
        btnSetaDireita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetaDireitaActionPerformed(evt);
            }
        });

        btnSetaBaixo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/seta_baixo.png"))); // NOI18N
        btnSetaBaixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetaBaixoActionPerformed(evt);
            }
        });

        btnZoomOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/zoom-out_icon-icons.com_72256 (1).png"))); // NOI18N
        btnZoomOut.setMaximumSize(new java.awt.Dimension(63, 39));
        btnZoomOut.setMinimumSize(new java.awt.Dimension(63, 39));
        btnZoomOut.setPreferredSize(new java.awt.Dimension(63, 39));
        btnZoomOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZoomOutActionPerformed(evt);
            }
        });

        btnZoomIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/zoom-in_icon-icons.com_72257.png"))); // NOI18N
        btnZoomIn.setMaximumSize(new java.awt.Dimension(63, 39));
        btnZoomIn.setMinimumSize(new java.awt.Dimension(63, 39));
        btnZoomIn.setPreferredSize(new java.awt.Dimension(63, 39));
        btnZoomIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZoomInActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Opções"));

        btnPrimitivas.setText("Primitivas");
        btnPrimitivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimitivasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPrimitivas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPrimitivas)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        painelAcessoTransformacoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Opções"));

        btnTransformacoes.setText("Transformações");
        btnTransformacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransformacoesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAcessoTransformacoesLayout = new javax.swing.GroupLayout(painelAcessoTransformacoes);
        painelAcessoTransformacoes.setLayout(painelAcessoTransformacoesLayout);
        painelAcessoTransformacoesLayout.setHorizontalGroup(
            painelAcessoTransformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAcessoTransformacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTransformacoes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelAcessoTransformacoesLayout.setVerticalGroup(
            painelAcessoTransformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAcessoTransformacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTransformacoes)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        btnLimparViewPort.setText("Limp");
        btnLimparViewPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparViewPortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelOpcoesLayout = new javax.swing.GroupLayout(painelOpcoes);
        painelOpcoes.setLayout(painelOpcoesLayout);
        painelOpcoesLayout.setHorizontalGroup(
            painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelOpcoesLayout.createSequentialGroup()
                .addGroup(painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelOpcoesLayout.createSequentialGroup()
                        .addGroup(painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelOpcoesLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(listaObjetosDesenhados, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelOpcoesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnSetaEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSetaCima, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSetaBaixo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSetaDireita, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addGroup(painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelOpcoesLayout.createSequentialGroup()
                                        .addComponent(btnZoomIn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnZoomOut, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelOpcoesLayout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(btnLimparViewPort, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(14, 14, 14))
                    .addGroup(painelOpcoesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelAcessoTransformacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelOpcoesLayout.setVerticalGroup(
            painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelOpcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listaObjetosDesenhados, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelOpcoesLayout.createSequentialGroup()
                        .addGroup(painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnSetaEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSetaDireita, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelOpcoesLayout.createSequentialGroup()
                                .addGroup(painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnZoomIn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnZoomOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimparViewPort, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelOpcoesLayout.createSequentialGroup()
                        .addComponent(btnSetaCima, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSetaBaixo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelAcessoTransformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout painelFundoLayout = new javax.swing.GroupLayout(painelFundo);
        painelFundo.setLayout(painelFundoLayout);
        painelFundoLayout.setHorizontalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spViewport, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97))
        );
        painelFundoLayout.setVerticalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spViewport, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(painelOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSetaEsquerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetaEsquerdaActionPerformed
        moveEsquerda();
    }//GEN-LAST:event_btnSetaEsquerdaActionPerformed

    private void moveEsquerda() {
        spViewport.getHorizontalScrollBar().setValue(spViewport.getHorizontalScrollBar().getValue() - 10);
        desenhaPlanoCartesiano();
    }

    private void btnSetaCimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetaCimaActionPerformed
        moveCima();
    }//GEN-LAST:event_btnSetaCimaActionPerformed

    private void moveCima() {
        // TODO add your handling code here:
        spViewport.getVerticalScrollBar().setValue(spViewport.getVerticalScrollBar().getValue() - 10);
        desenhaPlanoCartesiano();
    }

    private void btnSetaDireitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetaDireitaActionPerformed

        moveDireita();
    }//GEN-LAST:event_btnSetaDireitaActionPerformed

    private void moveDireita() {
        spViewport.getHorizontalScrollBar().setValue(spViewport.getHorizontalScrollBar().getValue() + 10);
        desenhaPlanoCartesiano();
    }

    private void btnSetaBaixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetaBaixoActionPerformed
        moveBaixo();
    }//GEN-LAST:event_btnSetaBaixoActionPerformed

    private void moveBaixo() {
        spViewport.getVerticalScrollBar().setValue(spViewport.getVerticalScrollBar().getValue() + 10);
        desenhaPlanoCartesiano();
    }

    private void btnZoomOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZoomOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnZoomOutActionPerformed

    private void btnZoomInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZoomInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnZoomInActionPerformed

    private void btnTransformacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransformacoesActionPerformed
        // TODO add your handling code here:
        frmTransformacoes frmT = new frmTransformacoes();
        frmT.setVisible(true); // abre a tela de transformações
    }//GEN-LAST:event_btnTransformacoesActionPerformed

    private void btnPrimitivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimitivasActionPerformed
        // TODO add your handling code here:
        frmPrimitivas reta = new frmPrimitivas(this);
        setFrame(reta);
        reta.setVisible(true);
    }//GEN-LAST:event_btnPrimitivasActionPerformed

    private void btnLimparViewPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparViewPortActionPerformed
        // TODO add your handling code here:
        painelMundo.removeAll();
        painelMundo.repaint();
        desenhaPlanoCartesiano();
    }//GEN-LAST:event_btnLimparViewPortActionPerformed

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        // evento para se as setas forem acionadas movimetnar a tela.
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_UP: moveCima();
                break;
            case KeyEvent.VK_DOWN: moveBaixo();
                break;
            case KeyEvent.VK_LEFT: moveEsquerda();
                break;
            case KeyEvent.VK_RIGHT: moveDireita();
                break;
        }
    }//GEN-LAST:event_formKeyTyped
    public void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    public void desenhaReta(int xi, int yi, int xf, int yf) {
        Reta lp = new Reta(Color.black, 1.0f);
        lp.setBackground(Color.white);
        lp.setBounds(1, 1, painelMundo.getWidth(), painelMundo.getHeight());  // tamanbo do jpanel
        lp.setxI(xi);
        lp.setyI(yi);
        lp.setxF(xf);
        lp.setyF(yf);
        painelMundo.add(lp);
        painelMundo.setComponentZOrder(lp, 0);
        repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimparViewPort;
    private javax.swing.JToggleButton btnPrimitivas;
    private javax.swing.JButton btnSetaBaixo;
    private javax.swing.JButton btnSetaCima;
    private javax.swing.JButton btnSetaDireita;
    private javax.swing.JButton btnSetaEsquerda;
    private javax.swing.JButton btnTransformacoes;
    private javax.swing.JButton btnZoomIn;
    private javax.swing.JButton btnZoomOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane listaObjetosDesenhados;
    private javax.swing.JPanel painelAcessoTransformacoes;
    private javax.swing.JPanel painelFundo;
    private javax.swing.JPanel painelMundo;
    private javax.swing.JPanel painelOpcoes;
    private javax.swing.JScrollPane spViewport;
    // End of variables declaration//GEN-END:variables

    public void desenhaPlanoCartesiano() {
        // desenha duas retas que se cruzam para o plano cartesiano.  
        //  desenhaReta(0, Math.round(painelMundo.getHeight() / 2), Math.round(painelMundo.getWidth()), Math.round(painelMundo.getHeight() / 2));
        // desenhaReta(Math.round(painelMundo.getWidth() / 2), 0, Math.round(painelMundo.getWidth() / 2), Math.round(painelMundo.getHeight()));

        desenhaReta(0, Math.round(painelMundo.getHeight() / 2), Math.round(painelMundo.getWidth()), Math.round(painelMundo.getHeight() / 2));
        desenhaReta(Math.round(painelMundo.getWidth() / 2), 0, Math.round(painelMundo.getWidth() / 2), Math.round(painelMundo.getHeight()));

        painelMundo.repaint();
        painelMundo.setBackground(Color.white);
        spViewport.repaint();
    }

    /*
     CASO O PLAANO CARTESIANO TENHA QUE FiCAR FIXO E MOVER SOMENTE OS DESENHOS NO PAINEL MUNDO 
    public void desenhaPlanoCartesiano() {

        // primeiraa reta
        Reta lp = new Reta(Color.black, 1.0f);
        lp.setBackground(Color.white);
        lp.setBounds(1, 1, spViewport.getWidth(), spViewport.getHeight());  // tamanbo do jpanel
        lp.setxI(0);
        lp.setyI(Math.round(spViewport.getHeight() / 2));
        lp.setxF(Math.round(spViewport.getWidth()));
        lp.setyF(Math.round(spViewport.getHeight() / 2));
        spViewport.add(lp);
        spViewport.setComponentZOrder(lp, 0);
        repaint();

        // segunda reta
        Reta lp2 = new Reta(Color.black, 1.0f);
        lp2.setBackground(Color.white);
        lp2.setBounds(1, 1, spViewport.getWidth(), spViewport.getHeight());  // tamanbo do jpanel
        lp2.setxI(Math.round(spViewport.getWidth() / 2));
        lp2.setyI(0);
        lp2.setxF(Math.round(spViewport.getWidth() / 2));
        lp2.setyF(Math.round(spViewport.getHeight()));
        spViewport.add(lp2);
        spViewport.setComponentZOrder(lp2, 0);
        repaint();

    }

     */

    public void centralizaViewPort() {

        // ENQUADRAR VIEWPORT NO CENTRO DO PAINEL COM O PLANO CARTESIANO
        //(forma usada andes, n deu certo)
        // spViewport.getVerticalScrollBar().setValue((painelMundo.getWidth()/2)-125);
        // spViewport.getHorizontalScrollBar().setValue((painelMundo.getHeight()/2)-125);
        // usa a diferença do tamamnho dos componentes para posicionar o maior no centro do menor.
        int difX = painelMundo.getWidth() - spViewport.getWidth();
        int difY = painelMundo.getHeight() - spViewport.getHeight();

        Point p = new Point(Math.round(spViewport.getViewport().getX() + (difX / 2)), Math.round(spViewport.getViewport().getY() + (difY / 2)));
        spViewport.getViewport().setViewPosition(p);

        // esconde as barras de rolagem
        spViewport.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_NEVER);
        //spViewport.getHorizontalScrollBar().setVisible(false);
        spViewport.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
        //  spViewport.getVerticalScrollBar().setVisible(false);
        spViewport.setBackground(Color.white);
    }
}
