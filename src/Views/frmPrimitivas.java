/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Primitivas2D.Points;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author coron
 */
public class frmPrimitivas extends javax.swing.JFrame {

    private frmPrincipal framePrincipal;
    private Color cor;
    //constantes
    protected final int PONTO = 0, RETA = 1, POLILINHA = 2, POLIGONO = 3;
    ArrayList<Points> listaAddPontos;
    protected DefaultListModel listaModel;

    // essa variavel frmPrincipal é o frame principal passado por parametro, ai consegue acessar
    // os metodos dele e desenhar nele, esssa tela serve somente para passar as informações para la...
    // essa é a forma mais facil de passar informações entre frames, passa tudo...
    public frmPrimitivas(frmPrincipal framePrincipal) {
        this.framePrincipal = framePrincipal;
        initComponents();
        setLocationRelativeTo(null);
        cor = Color.black; // inicia com cor preta, fica a criterio de quem faz o desenho mudar.
        rbPolilinha.setSelected(true);
        listaAddPontos = new ArrayList<Points>();
        listaModel = new DefaultListModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jFileChooser1 = new javax.swing.JFileChooser();
        painelGuias = new javax.swing.JTabbedPane();
        painelReta = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtXinicio = new javax.swing.JTextField();
        txtYinicio = new javax.swing.JTextField();
        txtXfim = new javax.swing.JTextField();
        txtYfim = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        painelRetangulo = new javax.swing.JPanel();
        Polilinha = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPontos = new javax.swing.JList<>();
        rbPolilinha = new javax.swing.JRadioButton();
        rbPoligono = new javax.swing.JRadioButton();
        btnNovoPonto = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        painelCor = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        nomeObjeto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnDesenhaPrimitiva = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Primitivas");
        setResizable(false);
        setSize(new java.awt.Dimension(550, 300));

        painelGuias.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Coordenadas"));

        jLabel4.setText("Y");

        jLabel3.setText("X ");

        jLabel2.setText("Y");

        jLabel1.setText("X ");

        txtXinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtXinicioActionPerformed(evt);
            }
        });

        jLabel11.setText("Ponto 1");

        jLabel12.setText("Ponto 2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtXinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtYinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel12)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtXfim, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtYfim, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(102, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtXinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtYinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtXfim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtYfim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout painelRetaLayout = new javax.swing.GroupLayout(painelReta);
        painelReta.setLayout(painelRetaLayout);
        painelRetaLayout.setHorizontalGroup(
            painelRetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRetaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        painelRetaLayout.setVerticalGroup(
            painelRetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRetaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, Short.MAX_VALUE)
                .addContainerGap())
        );

        painelGuias.addTab("Reta", painelReta);

        Polilinha.setBorder(javax.swing.BorderFactory.createTitledBorder("Pontos para a polilinha"));

        jScrollPane1.setViewportView(listaPontos);

        javax.swing.GroupLayout PolilinhaLayout = new javax.swing.GroupLayout(Polilinha);
        Polilinha.setLayout(PolilinhaLayout);
        PolilinhaLayout.setHorizontalGroup(
            PolilinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PolilinhaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addContainerGap())
        );
        PolilinhaLayout.setVerticalGroup(
            PolilinhaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PolilinhaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addContainerGap())
        );

        rbPolilinha.setText("Polilinha");

        rbPoligono.setText("Poligono");
        rbPoligono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPoligonoActionPerformed(evt);
            }
        });

        btnNovoPonto.setText("Adicionar ponto");
        btnNovoPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoPontoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelRetanguloLayout = new javax.swing.GroupLayout(painelRetangulo);
        painelRetangulo.setLayout(painelRetanguloLayout);
        painelRetanguloLayout.setHorizontalGroup(
            painelRetanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRetanguloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Polilinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painelRetanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rbPolilinha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbPoligono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNovoPonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        painelRetanguloLayout.setVerticalGroup(
            painelRetanguloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRetanguloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Polilinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelRetanguloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbPolilinha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbPoligono)
                .addGap(18, 18, 18)
                .addComponent(btnNovoPonto)
                .addGap(32, 32, 32))
        );

        painelGuias.addTab("Polilinha / Poligono", painelRetangulo);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Opções"));

        jLabel6.setText("Cor:");

        painelCor.setBackground(new java.awt.Color(0, 0, 0));
        painelCor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout painelCorLayout = new javax.swing.GroupLayout(painelCor);
        painelCor.setLayout(painelCorLayout);
        painelCorLayout.setHorizontalGroup(
            painelCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );
        painelCorLayout.setVerticalGroup(
            painelCorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jButton1.setText("Escolher cor");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Nome objeto:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel5.setText("*Nome do objeto é obrigatório.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nomeObjeto))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(painelCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(nomeObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(painelCor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69))
        );

        btnDesenhaPrimitiva.setText("Confirmar");
        btnDesenhaPrimitiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesenhaPrimitivaActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(painelGuias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnDesenhaPrimitiva)
                        .addGap(427, 427, 427)
                        .addComponent(btnCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelGuias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDesenhaPrimitiva)
                    .addComponent(btnCancelar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDesenhaPrimitivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesenhaPrimitivaActionPerformed

        // NOME OBRIGATORIO DO OBJETO
        if ((nomeObjeto.getText().equals("")) || (listaPontos.getModel().getSize() <= 1)) {
            if (nomeObjeto.getText().equals("")) {
                System.out.println("Sem nome, não desenhar!");
                JOptionPane.showMessageDialog(null, "Informe o nome do objeto!", "Nome do objeto", 1);
            } else {
                System.out.println("insira ao menos dois pontos para polilinha/poligono");
                JOptionPane.showMessageDialog(null, "Insira ao menos dois pontos para polilinha/poligono!", "Desenhar Polilinha", 1);
            }

        } else {
            // CONSIDERAA O MEIO DO PAINELMUNDO COMO SENDO O INICIO (PONTO 0,0) DEVIDO A VARIAVEL X0 e Y0 serem metade desse painel.
            switch (painelGuias.getSelectedIndex()) {
                // desenha uma reta com os pontos informados
                case 0:
                    inserePontosParaReta();
                    framePrincipal.desenhaObjeto(listaAddPontos, this.cor, false, nomeObjeto.getText(), RETA);
                    break;
                case 1:
                    // os pontos para polilinha e poligono são pegos diretamente através do form frmAdicionaPontos
                    // precisam ser ajustados a origem do plano cartesiano
                    ajustaOrigemPolilinhaPoligono();
                    if ((rbPolilinha.isSelected()) && (!rbPoligono.isSelected())) {
                        framePrincipal.desenhaObjeto(listaAddPontos, this.cor, false, nomeObjeto.getText(), POLILINHA);
                    }
                    if ((rbPoligono.isSelected()) && (!rbPolilinha.isSelected())) {
                        framePrincipal.desenhaObjeto(listaAddPontos, this.cor, false, nomeObjeto.getText(), POLIGONO);
                    }

                    break;
            }
            dispose();
        }
    }//GEN-LAST:event_btnDesenhaPrimitivaActionPerformed
    private void inserePontosParaReta() {
        // quando for a primeira aba = retas
        // pega dos edits e faz diretamente com esses pontos.
        Points pontos = new Points();
        pontos.setXi((framePrincipal.X0 + (Integer.parseInt(txtXinicio.getText()))));
        pontos.setYi((framePrincipal.Y0 - (Integer.parseInt(txtYinicio.getText()))));
        pontos.setXf((framePrincipal.X0 + (Integer.parseInt(txtXfim.getText()))));
        pontos.setYf((framePrincipal.Y0 - (Integer.parseInt(txtYfim.getText()))));
        listaAddPontos.add(pontos);
    }

    private void ajustaOrigemPolilinhaPoligono() {
        // função para ajustar os pontos do desenho para fazer a partir do centro do
        // plano cartesiano

        for (Points pontos : listaAddPontos) {
            pontos.setXi((framePrincipal.X0 + (pontos.getXi())));
            pontos.setYi((framePrincipal.Y0 - (pontos.getYi())));
            pontos.setXf((framePrincipal.X0 + (pontos.getXf())));
            pontos.setYf((framePrincipal.Y0 - (pontos.getYf())));
        }

    }

    public void inserePontosNaJList(Points p) {
        listaModel.addElement(p);
        listaPontos.setModel(listaModel);
    }
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtXinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtXinicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtXinicioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        frmColorPicker c = new frmColorPicker(this);
        c.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rbPoligonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPoligonoActionPerformed
        // TODO add your handling code here:
        if (rbPolilinha.isSelected()) {
            rbPolilinha.setSelected(false);
        }
        if (!rbPoligono.isSelected()) {
            rbPoligono.setSelected(true);
        }
    }//GEN-LAST:event_rbPoligonoActionPerformed

    private void btnNovoPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoPontoActionPerformed
        // TODO add your handling code here:
        frmAdicionaPontos telaPontos = new frmAdicionaPontos(this);
        telaPontos.setVisible(true);
    }//GEN-LAST:event_btnNovoPontoActionPerformed

    public void mudaCorPainelCores(Color corParam) {
        this.cor = corParam;
        painelCor.setBackground(cor);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Polilinha;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDesenhaPrimitiva;
    private javax.swing.JButton btnNovoPonto;
    private javax.swing.JButton jButton1;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList<String> listaPontos;
    private javax.swing.JTextField nomeObjeto;
    private javax.swing.JPanel painelCor;
    private javax.swing.JTabbedPane painelGuias;
    private javax.swing.JPanel painelReta;
    private javax.swing.JPanel painelRetangulo;
    private javax.swing.JRadioButton rbPoligono;
    private javax.swing.JRadioButton rbPolilinha;
    private javax.swing.JTextField txtXfim;
    private javax.swing.JTextField txtXinicio;
    private javax.swing.JTextField txtYfim;
    private javax.swing.JTextField txtYinicio;
    // End of variables declaration//GEN-END:variables

}
