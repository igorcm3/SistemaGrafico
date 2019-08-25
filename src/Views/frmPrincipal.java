/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Primitivas2D.DrawFactory;
import Primitivas2D.Points;
import Primitivas2D.TransladaReta;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author coron
 */
public class frmPrincipal extends javax.swing.JFrame {

    // Atributos de controle para o projeto.
    public javax.swing.JFrame frameAtivo;
    public int X0; //metade X e y do painel mundo, serao pontos iniciais de deseneho no viewport 
    public int Y0;
    public DefaultListModel listaModel;   // model para adicionar a Jlist
    public int countCartesianos, countRetas;   // usado apra saber qtos planos cartesianos desenhou para descontar do total de objetos e sincronziar com a Jlist.
    public TransladaReta treta = new TransladaReta();
    public ArrayList<Points> pontosTransladados = new ArrayList<>();
    //constantes 
    protected final int PONTO = 0, RETA = 1, POLILINHA = 2, POLIGONO = 3;

    //  Construtor, iniciar as variaveis que náo sáo atualziadas em tempo de execu;áo aqui.
    public frmPrincipal() {
        setLookAndFeel();
        initComponents();
        setIconApp();
        setLocationRelativeTo(null); // faz o frame iniciar centralizado na tela

        // desenhos vao ter o ponto (0,0) de origem a partir desses valores 
        X0 = Math.round(painelWindow.getWidth() / 2);
        Y0 = Math.round(painelWindow.getHeight() / 2);
        countCartesianos = 0;
        countRetas = 0;

        desenhaPlanoCartesiano();
        centralizaViewPort();
        listaModel = new DefaultListModel();
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
        painelInfos = new javax.swing.JPanel();
        lblInfo1 = new javax.swing.JLabel();
        lblInfo2 = new javax.swing.JLabel();
        lblInfo3 = new javax.swing.JLabel();
        lblInfo4 = new javax.swing.JLabel();
        lblObjInfo = new javax.swing.JLabel();
        lblObjSelLista = new javax.swing.JLabel();
        lblObjSelPontos = new javax.swing.JLabel();
        lblTotalObj = new javax.swing.JLabel();
        lblInfo5 = new javax.swing.JLabel();
        lblObjSelTipo = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema gráfico");
        setBackground(new java.awt.Color(240, 238, 238));
        setMaximumSize(new java.awt.Dimension(1028, 650));
        setMinimumSize(new java.awt.Dimension(1028, 650));
        setResizable(false);

        painelFundo.setMaximumSize(null);

        spViewport.setBackground(new java.awt.Color(255, 255, 255));
        spViewport.setBorder(null);
        spViewport.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        spViewport.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        spViewport.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        spViewport.setMaximumSize(new java.awt.Dimension(250, 250));
        spViewport.setMinimumSize(new java.awt.Dimension(250, 250));
        spViewport.setPreferredSize(new java.awt.Dimension(250, 250));

        painelWindow.setBackground(new java.awt.Color(255, 255, 255));
        painelWindow.setMaximumSize(new java.awt.Dimension(1000, 1000));
        painelWindow.setMinimumSize(new java.awt.Dimension(1000, 1000));
        painelWindow.setName("Window"); // NOI18N
        painelWindow.setPreferredSize(new java.awt.Dimension(1000, 1000));
        painelWindow.setLayout(null);
        spViewport.setViewportView(painelWindow);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Viewport");

        painelOpcoes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu de opções", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        listaObjetosDesenhados.setMaximumSize(new java.awt.Dimension(258, 130));
        listaObjetosDesenhados.setMinimumSize(new java.awt.Dimension(258, 130));
        listaObjetosDesenhados.setVerifyInputWhenFocusTarget(false);

        listaObjetos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        listaObjetos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        listaObjetos.setAutoscrolls(false);
        listaObjetos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaObjetosMouseClicked(evt);
            }
        });
        listaObjetos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listaObjetosValueChanged(evt);
            }
        });
        listaObjetosDesenhados.setViewportView(listaObjetos);

        btnSetaEsquerda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/left_30px.png"))); // NOI18N
        btnSetaEsquerda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetaEsquerdaActionPerformed(evt);
            }
        });

        btnSetaCima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/up_30px.png"))); // NOI18N
        btnSetaCima.setOpaque(false);
        btnSetaCima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetaCimaActionPerformed(evt);
            }
        });

        btnSetaDireita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/right_30px.png"))); // NOI18N
        btnSetaDireita.setOpaque(false);
        btnSetaDireita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetaDireitaActionPerformed(evt);
            }
        });

        btnSetaBaixo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/down_30px.png"))); // NOI18N
        btnSetaBaixo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetaBaixoActionPerformed(evt);
            }
        });

        btnZoomOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/zoom_out_30px.png"))); // NOI18N
        btnZoomOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZoomOutActionPerformed(evt);
            }
        });

        btnZoomIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/zoom_in_30px.png"))); // NOI18N
        btnZoomIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZoomInActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Primitivas"));

        btnPrimitivas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/add_30px.png"))); // NOI18N
        btnPrimitivas.setText("Novo");
        btnPrimitivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimitivasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPrimitivas)
                .addGap(76, 76, 76))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPrimitivas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        painelAcessoTransformacoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Transformaões"));

        btnTransformacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/alter_1.png"))); // NOI18N
        btnTransformacoes.setText("Aplicar");
        btnTransformacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransformacoesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelAcessoTransformacoesLayout = new javax.swing.GroupLayout(painelAcessoTransformacoes);
        painelAcessoTransformacoes.setLayout(painelAcessoTransformacoesLayout);
        painelAcessoTransformacoesLayout.setHorizontalGroup(
            painelAcessoTransformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelAcessoTransformacoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTransformacoes)
                .addGap(78, 78, 78))
        );
        painelAcessoTransformacoesLayout.setVerticalGroup(
            painelAcessoTransformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelAcessoTransformacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTransformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnLimparViewPort.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/clear_26px.png"))); // NOI18N
        btnLimparViewPort.setText("Limpar     ");
        btnLimparViewPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparViewPortActionPerformed(evt);
            }
        });

        btnCentralizaViewport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/center_diretion_2_24px.png"))); // NOI18N
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

        btnExcluirObjeto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/delete_trash_24px.png"))); // NOI18N
        btnExcluirObjeto.setText("Excluir   ");
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
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelAcessoTransformacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelOpcoesLayout.createSequentialGroup()
                        .addGroup(painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelOpcoesLayout.createSequentialGroup()
                                .addGroup(painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(painelOpcoesLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sldPasso, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblPasso, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelOpcoesLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnSetaEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSetaBaixo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSetaCima, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSetaDireita, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelOpcoesLayout.createSequentialGroup()
                                .addComponent(btnZoomIn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnZoomOut, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btnCentralizaViewport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelOpcoesLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(82, 82, 82))
                            .addComponent(jSeparator2)
                            .addComponent(btnExcluirObjeto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimparViewPort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(painelOpcoesLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(listaObjetosDesenhados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        painelOpcoesLayout.setVerticalGroup(
            painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelOpcoesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaObjetosDesenhados, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelOpcoesLayout.createSequentialGroup()
                        .addGroup(painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGroup(painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelOpcoesLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sldPasso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPasso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelOpcoesLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnZoomIn))
                                .addGroup(painelOpcoesLayout.createSequentialGroup()
                                    .addGap(16, 16, 16)
                                    .addComponent(btnZoomOut))))
                        .addGroup(painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelOpcoesLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(btnCentralizaViewport, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimparViewPort, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExcluirObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelOpcoesLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelOpcoesLayout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addGroup(painelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnSetaDireita, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnSetaEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(painelOpcoesLayout.createSequentialGroup()
                                        .addComponent(btnSetaCima, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSetaBaixo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(11, 11, 11))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelAcessoTransformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        painelInfos.setBackground(new java.awt.Color(223, 229, 243));
        painelInfos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 122, 217), 2, true));

        lblInfo1.setText("Objeto selecionado index lista: ");

        lblInfo2.setText("Número de pontos do objeto");

        lblInfo3.setText("Total objetos: ");

        lblInfo4.setText("Objeto selecionado informações:");

        lblObjInfo.setForeground(new java.awt.Color(0, 0, 160));
        lblObjInfo.setText("'");

        lblObjSelLista.setForeground(new java.awt.Color(0, 0, 160));
        lblObjSelLista.setText("0");

        lblObjSelPontos.setForeground(new java.awt.Color(0, 0, 160));
        lblObjSelPontos.setText("0");

        lblTotalObj.setForeground(new java.awt.Color(0, 0, 160));
        lblTotalObj.setText("0");

        lblInfo5.setText("Objeto selecionado tipo:");

        lblObjSelTipo.setForeground(new java.awt.Color(0, 0, 160));
        lblObjSelTipo.setText("'");

        jSeparator3.setForeground(new java.awt.Color(0, 122, 250));

        javax.swing.GroupLayout painelInfosLayout = new javax.swing.GroupLayout(painelInfos);
        painelInfos.setLayout(painelInfosLayout);
        painelInfosLayout.setHorizontalGroup(
            painelInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInfosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addGroup(painelInfosLayout.createSequentialGroup()
                        .addGroup(painelInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelInfosLayout.createSequentialGroup()
                                .addComponent(lblInfo4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblObjInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelInfosLayout.createSequentialGroup()
                                .addComponent(lblInfo5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblObjSelTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelInfosLayout.createSequentialGroup()
                        .addComponent(lblInfo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblObjSelLista, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblInfo2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblObjSelPontos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblInfo3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotalObj, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        painelInfosLayout.setVerticalGroup(
            painelInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelInfosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(painelInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInfo1)
                    .addComponent(lblInfo2)
                    .addComponent(lblInfo3)
                    .addComponent(lblObjSelLista)
                    .addComponent(lblObjSelPontos)
                    .addComponent(lblTotalObj))
                .addGap(3, 3, 3)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblObjSelTipo)
                    .addComponent(lblInfo5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(painelInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInfo4)
                    .addComponent(lblObjInfo))
                .addContainerGap())
        );

        javax.swing.GroupLayout painelFundoLayout = new javax.swing.GroupLayout(painelFundo);
        painelFundo.setLayout(painelFundoLayout);
        painelFundoLayout.setHorizontalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(painelInfos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spViewport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(124, Short.MAX_VALUE))
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(261, 261, 261))))
        );
        painelFundoLayout.setVerticalGroup(
            painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFundoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(painelFundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addComponent(painelOpcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(painelFundoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)
                        .addComponent(spViewport, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(painelInfos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSetaEsquerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetaEsquerdaActionPerformed
        moveEsquerda();
        alteraLabelPasso();
    }//GEN-LAST:event_btnSetaEsquerdaActionPerformed

    private void moveEsquerda() {
        spViewport.getHorizontalScrollBar().setValue(spViewport.getHorizontalScrollBar().getValue() - sldPasso.getValue());
        painelWindow.repaint();
        spViewport.repaint();
    }

    private void btnSetaCimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetaCimaActionPerformed
        moveCima();
        alteraLabelPasso();
    }//GEN-LAST:event_btnSetaCimaActionPerformed

    private void moveCima() {
        // TODO add your handling code here:
        spViewport.getVerticalScrollBar().setValue(spViewport.getVerticalScrollBar().getValue() - sldPasso.getValue());
        painelWindow.repaint();
        spViewport.repaint();

    }

    private void btnSetaDireitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetaDireitaActionPerformed

        moveDireita();
        alteraLabelPasso();
    }//GEN-LAST:event_btnSetaDireitaActionPerformed

    private void moveDireita() {
        spViewport.getHorizontalScrollBar().setValue(spViewport.getHorizontalScrollBar().getValue() + sldPasso.getValue());
        painelWindow.repaint();
        spViewport.repaint();
    }

    private void btnSetaBaixoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetaBaixoActionPerformed
        moveBaixo();
        alteraLabelPasso();
    }//GEN-LAST:event_btnSetaBaixoActionPerformed

    private void moveBaixo() {
        spViewport.getVerticalScrollBar().setValue(spViewport.getVerticalScrollBar().getValue() + sldPasso.getValue());
        painelWindow.repaint();
        spViewport.repaint();

    }

    private void btnZoomOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZoomOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnZoomOutActionPerformed

    private void btnZoomInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZoomInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnZoomInActionPerformed

    private void btnLimparViewPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparViewPortActionPerformed
        // TODO add your handling code her
        countCartesianos =0;
        countRetas =0;
        painelWindow.removeAll();
        desenhaPlanoCartesiano();
        listaModel.removeAllElements();
        painelWindow.repaint();
        // desenhaPlanoCartesiano();
        imprimeIndicesPainelWindow();

    }//GEN-LAST:event_btnLimparViewPortActionPerformed

    private void btnPrimitivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimitivasActionPerformed
        frmPrimitivas reta = new frmPrimitivas(this);
        setFrame(reta);
        reta.setVisible(true);
    }//GEN-LAST:event_btnPrimitivasActionPerformed

    private void btnTransformacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransformacoesActionPerformed
        // TODO add your handling code here:
        if (listaObjetos.getSelectedIndex() > -1) {
            frmTransformacoes frmT = new frmTransformacoes(this);
            frmT.setVisible(true); // abre a tela de transformações    
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um objeto na lista para fazer a transformação!", "Transformação de objetos", 1);
        }
    }//GEN-LAST:event_btnTransformacoesActionPerformed

    private void btnCentralizaViewportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCentralizaViewportActionPerformed
        // TODO add your handling code here:
        centralizaViewPort();
        repaint();
    }//GEN-LAST:event_btnCentralizaViewportActionPerformed

    private void btnExcluirObjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirObjetoActionPerformed
        // TODO add your handling code here:
        if (listaObjetos.getSelectedIndex() > -1) {
            Object[] options = {"Confirmar", "Cancelar"};  // 0 = confirmar
            int resp = JOptionPane.showOptionDialog(null, "Deseja excluir o objeto - " + painelWindow.getComponent(getObjSelecionadoNaListaDoPainelWindow()).toString() + " ?", "Exclusão de objetos", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
            // caso seja 0 (escolheu confirmar) entao exclui o objeto da lista e do painelWindow
            if (resp == 0) {
                System.out.println("obj excluido: " + painelWindow.getComponent(getObjSelecionadoNaListaDoPainelWindow()).toString());
                painelWindow.remove(painelWindow.getComponent(getObjSelecionadoNaListaDoPainelWindow()));
                listaModel.remove(listaObjetos.getSelectedIndex());
                painelWindow.repaint();
                spViewport.repaint();
            }
        }
        // printa como ficaram os indices
        imprimeIndicesPainelWindow();
    }//GEN-LAST:event_btnExcluirObjetoActionPerformed

    private void sldPassoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldPassoStateChanged
        // TODO add your handling code here:
        alteraLabelPasso();
    }//GEN-LAST:event_sldPassoStateChanged


    private void listaObjetosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaObjetosMouseClicked
        // TODO add your handling code here:
        atualizaLabelsInfo();
    }//GEN-LAST:event_listaObjetosMouseClicked

    private void listaObjetosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listaObjetosValueChanged
        // TODO add your handling code here:
        atualizaLabelsInfo();
    }//GEN-LAST:event_listaObjetosValueChanged

    public void setFrame(javax.swing.JFrame frame) {
        this.frameAtivo = frame;
    }

    public void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setIconApp() {
        URL url = this.getClass().getResource("/Img/AppIcon.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
    }

    public void atualizaLabelsInfo() {
        DrawFactory tipObj = (DrawFactory) painelWindow.getComponent(getObjSelecionadoNaListaDoPainelWindow());
        
        lblObjSelLista.setText(String.valueOf((listaObjetos.getSelectedIndex() + 1)));
        lblObjSelPontos.setText(String.valueOf(tipObj.getNumeroDePontos()));
        lblTotalObj.setText(String.valueOf(getTotalObjetosDesenhadosWindow()));
        
        switch (tipObj.getTipoObj()) {
            case RETA:
                lblObjSelTipo.setText("Reta");
                break;
            case POLILINHA:
                lblObjSelTipo.setText("Polilinha");
                break;
            case POLIGONO:
                lblObjSelTipo.setText("Poligono");
                break;
            default:
                lblObjSelTipo.setText("Tipo não reconhecido!");
        }

        lblObjInfo.setText(painelWindow.getComponent(getObjSelecionadoNaListaDoPainelWindow()).toString());

    }

    public int getObjSelecionadoNaListaDoPainelWindow() {
        int countObjsValidos, indexDoComponent;
        countObjsValidos = 0;
        indexDoComponent = 0;
        for (Component c : painelWindow.getComponents()) {
            indexDoComponent++;
            if (!c.getName().equals("PC")) {
                countObjsValidos++;
                if (countObjsValidos == (listaObjetos.getModel().getSize() - (listaObjetos.getSelectedIndex() + 1))) {
                    return indexDoComponent;
                }
            }
        }
        // caso n ache o index do componente, retorna um valor invalido para conferencia.
        return 0;
    }

    //public void desenhaObjeto(int xi, int yi, int xf, int yf, float espessura, Color cor, boolean ehPlanoCartesiano, String nomeObjeto) {
    public void desenhaObjeto(ArrayList<Points> pointsParam, Color cor, boolean ehPlanoCartesiano, String nomeObjeto, int tipo) {
        DrawFactory objeto2D = new DrawFactory();
        // Coloca o nome padrão de objetos de reta com R+numero da reda + nome do objeto por param.
        if (!ehPlanoCartesiano) {
            countRetas++;
        }
        objeto2D.setName(nomeObjeto);
        objeto2D.setBounds(1, 1, painelWindow.getWidth(), painelWindow.getHeight());
        objeto2D.setCor(cor);
        objeto2D.setPoints(pointsParam);
        objeto2D.setTipoObj(tipo);
        painelWindow.add(objeto2D);
        painelWindow.setComponentZOrder(objeto2D, 0);
        if (!ehPlanoCartesiano) {
            adicionaDesenhoALista(painelWindow.getComponent(0));
        }
        repaint();
        System.out.println("desenhou objeto:");
    }

    public void desenhaPlanoCartesiano() {
        // desenha duas retas que se cruzam para o plano cartesiano. 
        //xi yi xf yf, um array para cada desenho, nesse caso um desenho para plano X e um plano Y
        Points p1 = new Points();
        Points p2 = new Points();
        ArrayList<Points> p1Array = new ArrayList<Points>();
        ArrayList<Points> p2Array = new ArrayList<Points>();

        p1.setXi(0);
        p1.setYi(Math.round(painelWindow.getHeight() / 2));
        p1.setXf(Math.round(painelWindow.getWidth()));
        p1.setYf(Math.round(painelWindow.getHeight() / 2));
        p1Array.add(p1);

        p2.setXi(Math.round(painelWindow.getWidth() / 2));
        p2.setYi(0);
        p2.setXf(Math.round(painelWindow.getWidth() / 2));
        p2.setYf(Math.round(painelWindow.getHeight()));
        p2Array.add(p2);

        desenhaObjeto(p1Array, Color.BLACK, true, "Plano Cartesiano", RETA);
        countCartesianos++;
        desenhaObjeto(p2Array, Color.BLACK, true, "Plano Cartesiano", RETA);
        countCartesianos++;
        painelWindow.repaint();
    }

    public int getTotalObjetosDesenhadosWindow() {
        //retorna o total de objetos menos os planos cartesianos, que n podeem ser removidos, apenas redesenhados para n bugar o painel...
        return painelWindow.getComponentCount() - countCartesianos;
    }

    public void centralizaViewPort() {
        // usa a diferença do tamamnho dos componentes para posicionar o maior no centro do menor.
        int difX = painelWindow.getWidth() - spViewport.getWidth();
        int difY = painelWindow.getHeight() - spViewport.getHeight();

        Point p = new Point(Math.round(spViewport.getViewport().getX() + (difX / 2)), Math.round(spViewport.getViewport().getY() + (difY / 2)));
        spViewport.getViewport().setViewPosition(p);
    }

    public void adicionaDesenhoALista(Component desenho) {
        listaModel.addElement(desenho);
        listaObjetos.setModel(listaModel);
    }

    public void alteraLabelPasso() {
        lblPasso.setText(String.valueOf(sldPasso.getValue()));
    }

    public void imprimeIndicesPainelWindow() {
        //função somente para conferencia e teste da manipulação dos itens adicionados ao painel.
        int indexDoComponent;
        indexDoComponent = 0;
        System.out.println("");
        System.out.println("");
        for (Component c : painelWindow.getComponents()) {
            indexDoComponent++;
            System.out.println("   " + c.getName() + "  -  índice: " + (painelWindow.getComponentCount() - indexDoComponent));
        }
        System.out.println("");
        System.out.println("");

    }

    public void translada(int tx, int ty) {
        Points p = new Points();
        ArrayList<Points> pLista = new ArrayList<Points>();
        if (listaObjetos.getSelectedIndex() > -1) {
            DrawFactory retaTranslada = (DrawFactory) listaModel.getElementAt(listaObjetos.getSelectedIndex());
            painelWindow.remove(painelWindow.getComponent(getObjSelecionadoNaListaDoPainelWindow()));
            pontosTransladados = treta.translada(retaTranslada, tx, ty);
            listaModel.remove(listaObjetos.getSelectedIndex());
            painelWindow.repaint();
            spViewport.repaint();
            
            
            
            
            
            
            
            desenhaObjeto(pontosTransladados, retaTranslada.getCor(), false, retaTranslada.getName(), retaTranslada.getTipoObj());
            
        }

    }

    //------------------------------------------MAIN----------------------------//
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblInfo1;
    private javax.swing.JLabel lblInfo2;
    private javax.swing.JLabel lblInfo3;
    private javax.swing.JLabel lblInfo4;
    private javax.swing.JLabel lblInfo5;
    private javax.swing.JLabel lblObjInfo;
    private javax.swing.JLabel lblObjSelLista;
    private javax.swing.JLabel lblObjSelPontos;
    private javax.swing.JLabel lblObjSelTipo;
    private javax.swing.JLabel lblPasso;
    private javax.swing.JLabel lblTotalObj;
    private javax.swing.JList<String> listaObjetos;
    private javax.swing.JScrollPane listaObjetosDesenhados;
    private javax.swing.JPanel painelAcessoTransformacoes;
    private javax.swing.JPanel painelFundo;
    private javax.swing.JPanel painelInfos;
    private javax.swing.JPanel painelOpcoes;
    private javax.swing.JPanel painelWindow;
    private javax.swing.JSlider sldPasso;
    private javax.swing.JScrollPane spViewport;
    // End of variables declaration//GEN-END:variables

}
