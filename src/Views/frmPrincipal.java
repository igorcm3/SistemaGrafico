/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Primitivas2D.Reta;
import java.awt.Color;
import java.awt.List;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;
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
    DefaultListModel listaModel;   // model para adicionar a Jlist
    List listaPropriedades;

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
        X0 = Math.round(painelWindow.getWidth() / 2);
        Y0 = Math.round(painelWindow.getHeight() / 2);
        
        desenhaPlanoCartesiano();
        centralizaViewPort();
        
        listaModel = new DefaultListModel();
        listaPropriedades = new List();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelFundo = new javax.swing.JPanel();
        spViewport = new javax.swing.JScrollPane();
        painelWindow = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        painelOpcoes = new javax.swing.JPanel();
        listaObjetosDesenhados = new javax.swing.JScrollPane();
        listaObjetos = new javax.swing.JList<>();
        btnSetaEsquerda = new javax.swing.JButton();
        btnSetaCima = new javax.swing.JButton();
        btnSetaDireita = new javax.swing.JButton();
        btnSetaBaixo = new javax.swing.JButton();
        btnZoomOut = new javax.swing.JButton();
        btnZoomIn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnPrimitivas = new javax.swing.JButton();
        painelAcessoTransformacoes = new javax.swing.JPanel();
        btnTransformacoes = new javax.swing.JButton();
        btnLimparViewPort = new javax.swing.JButton();
        btnCentralizaViewport = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        sldPasso = new javax.swing.JSlider();
        jLabel5 = new javax.swing.JLabel();
        btnExcluirObjeto = new javax.swing.JButton();
        lblPasso = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

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
        spViewport.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        spViewport.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        spViewport.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        spViewport.setMaximumSize(new java.awt.Dimension(250, 250));
        spViewport.setMinimumSize(new java.awt.Dimension(250, 250));
        spViewport.setPreferredSize(new java.awt.Dimension(250, 250));

        painelWindow.setBackground(new java.awt.Color(255, 255, 255));
        painelWindow.setPreferredSize(new java.awt.Dimension(1000, 1000));

        javax.swing.GroupLayout painelWindowLayout = new javax.swing.GroupLayout(painelWindow);
        painelWindow.setLayout(painelWindowLayout);
        painelWindowLayout.setHorizontalGroup(
            painelWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        painelWindowLayout.setVerticalGroup(
            painelWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );

        spViewport.setViewportView(painelWindow);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Viewport");

        painelOpcoes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu de opções", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        listaObjetosDesenhados.setViewportView(listaObjetos);

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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Primitivas"));

        btnPrimitivas.setText("Novo objeto");
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
                .addGap(55, 55, 55)
                .addComponent(btnPrimitivas, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(btnPrimitivas)
                .addContainerGap())
        );

        painelAcessoTransformacoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Transformaões"));

        btnTransformacoes.setText("Transformar objeto");
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
                .addGap(57, 57, 57)
                .addComponent(btnTransformacoes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelAcessoTransformacoesLayout.setVerticalGroup(
            painelAcessoTransformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAcessoTransformacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTransformacoes)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btnLimparViewPort.setText("Limpar");
        btnLimparViewPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparViewPortActionPerformed(evt);
            }
        });

        btnCentralizaViewport.setText("Centralizar");
        btnCentralizaViewport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCentralizaViewportActionPerformed(evt);
            }
        });

        jLabel2.setText("Zoom");

        jLabel3.setText("Movimentar viewport");

        jLabel4.setText("Passo");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        sldPasso.setMaximum(50);
        sldPasso.setMinimum(1);
        sldPasso.setValue(5);
        sldPasso.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldPassoStateChanged(evt);
            }
        });

        jLabel5.setText("Lista de objetos");

        btnExcluirObjeto.setText("Excluir");
        btnExcluirObjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirObjetoActionPerformed(evt);
            }
        });

        lblPasso.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        lblPasso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPasso.setText("5");

        javax.swing.GroupLayout painelOpcoesLayout = new javax.swing.GroupLayout(painelOpcoes);
        painelOpcoes.setLayout(painelOpcoesLayout);
        painelOpcoesLayout.setHorizontalGroup(
            painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelOpcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listaObjetosDesenhados, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelAcessoTransformacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelOpcoesLayout.createSequentialGroup()
                        .addGroup(painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(painelOpcoesLayout.createSequentialGroup()
                                .addComponent(btnSetaEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSetaBaixo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSetaDireita, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelOpcoesLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(btnSetaCima, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelOpcoesLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sldPasso, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPasso, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCentralizaViewport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelOpcoesLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(painelOpcoesLayout.createSequentialGroup()
                                        .addComponent(btnZoomIn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnZoomOut, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jSeparator2)
                            .addComponent(btnExcluirObjeto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimparViewPort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(painelOpcoesLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelOpcoesLayout.setVerticalGroup(
            painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelOpcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaObjetosDesenhados, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelOpcoesLayout.createSequentialGroup()
                        .addGroup(painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGroup(painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelOpcoesLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnZoomIn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnZoomOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(painelOpcoesLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sldPasso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPasso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(20, 20, 20)
                        .addGroup(painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelOpcoesLayout.createSequentialGroup()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCentralizaViewport)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimparViewPort)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluirObjeto))
                            .addGroup(painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(painelOpcoesLayout.createSequentialGroup()
                                    .addGap(37, 37, 37)
                                    .addGroup(painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnSetaDireita, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSetaEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(painelOpcoesLayout.createSequentialGroup()
                                    .addComponent(btnSetaCima, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnSetaBaixo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelAcessoTransformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton1.setText("Acidionar a lista");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelFundoLayout = new javax.swing.GroupLayout(painelFundo);
        painelFundo.setLayout(painelFundoLayout);
        painelFundoLayout.setHorizontalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addComponent(spViewport, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        painelFundoLayout.setVerticalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spViewport, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFundoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(155, 155, 155))))
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelOpcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        alteraLabelPasso();
    }//GEN-LAST:event_btnSetaEsquerdaActionPerformed
    
    private void moveEsquerda() {
        spViewport.getHorizontalScrollBar().setValue(spViewport.getHorizontalScrollBar().getValue() - sldPasso.getValue());
        desenhaPlanoCartesiano();
    }

    private void btnSetaCimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetaCimaActionPerformed
        moveCima();
        alteraLabelPasso();
    }//GEN-LAST:event_btnSetaCimaActionPerformed
    
    private void moveCima() {
        // TODO add your handling code here:
        spViewport.getVerticalScrollBar().setValue(spViewport.getVerticalScrollBar().getValue() - sldPasso.getValue());
        desenhaPlanoCartesiano();
    }

    private void btnSetaDireitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetaDireitaActionPerformed

        moveDireita();
        alteraLabelPasso();
    }//GEN-LAST:event_btnSetaDireitaActionPerformed
    
    private void moveDireita() {
        spViewport.getHorizontalScrollBar().setValue(spViewport.getHorizontalScrollBar().getValue() + sldPasso.getValue());
        desenhaPlanoCartesiano();
    }

    private void btnSetaBaixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetaBaixoActionPerformed
        moveBaixo();
        alteraLabelPasso();
    }//GEN-LAST:event_btnSetaBaixoActionPerformed
    
    private void moveBaixo() {
        spViewport.getVerticalScrollBar().setValue(spViewport.getVerticalScrollBar().getValue() + sldPasso.getValue());
        desenhaPlanoCartesiano();
    }

    private void btnZoomOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZoomOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnZoomOutActionPerformed

    private void btnZoomInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZoomInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnZoomInActionPerformed

    private void btnLimparViewPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparViewPortActionPerformed
        // TODO add your handling code here:
        painelWindow.removeAll();
        painelWindow.repaint();
        desenhaPlanoCartesiano();
    }//GEN-LAST:event_btnLimparViewPortActionPerformed

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        // evento para se as setas forem acionadas movimetnar a tela.
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_UP:
                moveCima();
                break;
            case KeyEvent.VK_DOWN:
                moveBaixo();
                break;
            case KeyEvent.VK_LEFT:
                moveEsquerda();
                break;
            case KeyEvent.VK_RIGHT:
                moveDireita();
                break;
        }
    }//GEN-LAST:event_formKeyTyped

    private void btnPrimitivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimitivasActionPerformed
        frmPrimitivas reta = new frmPrimitivas(this);
        setFrame(reta);
        reta.setVisible(true);

    }//GEN-LAST:event_btnPrimitivasActionPerformed

    private void btnTransformacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransformacoesActionPerformed
        // TODO add your handling code here:
        frmTransformacoes frmT = new frmTransformacoes();
        frmT.setVisible(true); // abre a tela de transformações
    }//GEN-LAST:event_btnTransformacoesActionPerformed

    private void btnCentralizaViewportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentralizaViewportActionPerformed
        // TODO add your handling code here:
        centralizaViewPort();
        repaint();
    }//GEN-LAST:event_btnCentralizaViewportActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        adicionaDesenhoALista("Reta", painelWindow);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnExcluirObjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirObjetoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirObjetoActionPerformed

    private void sldPassoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldPassoStateChanged
        // TODO add your handling code here:
        alteraLabelPasso();
    }//GEN-LAST:event_sldPassoStateChanged
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
    
    public void desenhaReta(int xi, int yi, int xf, int yf, float espessura, Color cor) {
        Reta lp = new Reta(cor, espessura);
        lp.setBounds(1, 1, painelWindow.getWidth(), painelWindow.getHeight());  // tamanbo do jpanel
        //lp.setEspessura(espessura);
        lp.setxI(xi);
        lp.setyI(yi);
        lp.setxF(xf);
        lp.setyF(yf);
        painelWindow.add(lp);
        painelWindow.setComponentZOrder(lp, 0);
        repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCentralizaViewport;
    private javax.swing.JButton btnExcluirObjeto;
    private javax.swing.JButton btnLimparViewPort;
    private javax.swing.JButton btnPrimitivas;
    private javax.swing.JButton btnSetaBaixo;
    private javax.swing.JButton btnSetaCima;
    private javax.swing.JButton btnSetaDireita;
    private javax.swing.JButton btnSetaEsquerda;
    private javax.swing.JButton btnTransformacoes;
    private javax.swing.JButton btnZoomIn;
    private javax.swing.JButton btnZoomOut;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblPasso;
    private javax.swing.JList<String> listaObjetos;
    private javax.swing.JScrollPane listaObjetosDesenhados;
    private javax.swing.JPanel painelAcessoTransformacoes;
    private javax.swing.JPanel painelFundo;
    private javax.swing.JPanel painelOpcoes;
    private javax.swing.JPanel painelWindow;
    private javax.swing.JSlider sldPasso;
    private javax.swing.JScrollPane spViewport;
    // End of variables declaration//GEN-END:variables

    public void desenhaPlanoCartesiano() {
        // desenha duas retas que se cruzam para o plano cartesiano.  
        desenhaReta(0, Math.round(painelWindow.getHeight() / 2), Math.round(painelWindow.getWidth()), Math.round(painelWindow.getHeight() / 2), 1.0f, Color.BLACK);
        desenhaReta(Math.round(painelWindow.getWidth() / 2), 0, Math.round(painelWindow.getWidth() / 2), Math.round(painelWindow.getHeight()), 1.0f, Color.BLACK);
        painelWindow.repaint();
    }

    /*
     CASO O PLAANO CARTESIANO TENHA QUE FiCAR FIXO E MOVER SOMENTE OS DESENHOS NO PAINEL VIEW, USAR ESSE METODO
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
        // usa a diferença do tamamnho dos componentes para posicionar o maior no centro do menor.
        int difX = painelWindow.getWidth() - spViewport.getWidth();
        int difY = painelWindow.getHeight() - spViewport.getHeight();
        
        Point p = new Point(Math.round(spViewport.getViewport().getX() + (difX / 2)), Math.round(spViewport.getViewport().getY() + (difY / 2)));
        spViewport.getViewport().setViewPosition(p);
    }
    
    public void adicionaDesenhoALista(String nome, JPanel    tamanho) {
        // a ideia é receber o painel desenhado e guardar ele na lista
        // armazenar seus dados em uma matriz.
        //painelWindow.getComponent(painelWindow.getComponentZOrder(this)).get;
        String elemento = nome+" (largura- "+tamanho.getWidth() + "/altura -"+tamanho.getHeight()+")";
        listaModel.addElement(elemento);
        listaObjetos.setModel(listaModel);
    }
    
    public void alteraLabelPasso(){
        lblPasso.setText(String.valueOf(sldPasso.getValue()));
    }
}
