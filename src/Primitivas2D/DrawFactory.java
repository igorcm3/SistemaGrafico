/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Primitivas2D;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author coron
 */
public class DrawFactory extends JPanel {

    protected Color cor;
    protected int posicaoPainelWondow;
    protected ArrayList<Points> points;
    protected int tipoObj;
    protected final int PONTO = 0, RETA = 1, POLILINHA = 2, POLIGONO = 3;

    ;
    // Construtor que recebe um array de pontos para desenho.
    public DrawFactory(ArrayList<Points> points) {
        this.points = points;
    }

    public DrawFactory() {
    }

    @Override
    public void paintComponent(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(cor);
        g2d.setStroke(new BasicStroke(1.0f)); // tamanho da espessura.
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // aqui ele verifica que tipo será desenhado o objeto
        switch (tipoObj) {
            case RETA:
                for (int i = 0; i < points.size(); i++) {
                    if (i == 0) {
                        //primeiro elemento desenha normal para o proximo ter uam referencia
                        g2d.drawLine(points.get(i).getX(), points.get(i).getY(), points.get(i).getX(), points.get(i).getY());
                    } else {
                        g2d.drawLine(points.get(i - 1).getX(), points.get(i - 1).getY(), points.get(i).getX(), points.get(i).getY());
                    }
                }
                break;
            case POLILINHA:
                // percorre o arraylist por indices para controlar o desenho
                // ja que tem que pegar como inicio o fim do elemento anterior para desenahr a partir dele.
                for (int i = 0; i < points.size(); i++) {
                    if (i == 0) {
                        //primeiro elemento desenha normal para o proximo ter uam referencia
                        g2d.drawLine(points.get(i).getX(), points.get(i).getY(), points.get(i).getX(), points.get(i).getY());
                    } else {
                        g2d.drawLine(points.get(i - 1).getX(), points.get(i - 1).getY(), points.get(i).getX(), points.get(i).getY());
                    }
                }
                break;
            case POLIGONO:

                // percorre o arraylist por indices para controlar o desenho
                // ja que tem que pegar como inicio o fim do elemento anterior para desenahr a partir dele.
                for (int i = 0; i < points.size(); i++) {
                    if (i == 0) {
                        //primeiro elemento desenha normal para o proximo ter uam referencia
                        g2d.drawLine(points.get(i).getX(), points.get(i).getY(), points.get(i).getX(), points.get(i).getY());
                    } else {
                        g2d.drawLine(points.get(i - 1).getX(), points.get(i - 1).getY(), points.get(i).getX(), points.get(i).getY());
                    }

                }
                // DESENHA ULTIMO PONTO CONECTANDO COM PRIMEIRO
                g2d.drawLine(points.get(points.size() - 1).getX(), points.get(points.size() - 1).getY(), points.get(0).getX(), points.get(0).getY());
                break;
        }
        g2d.dispose();
    }

    @Override
    public String toString() {
        switch (tipoObj) {
            case RETA:
                return this.getName() + " [Reta]";
            case POLILINHA:
                return this.getName() + " [Polilinha] - " + points.size() + " pontos";
            case POLIGONO:
                switch (points.size()) {
                    case 1:
                        return this.getName() + " [Ponto]";
                    case 2:
                        return this.getName() + " [Reta]";
                    case 3:
                        return this.getName() + " [Triângulo]";
                    case 4:
                        return this.getName() + " [Quadrângulo]";
                    case 5:
                        return this.getName() + " [Pentágono]";
                    case 6:
                        return this.getName() + " [Hexágono]";
                    case 7:
                        return this.getName() + " [Heptágono]";
                    case 8:
                        return this.getName() + " [Octógono]";
                    case 9:
                        return this.getName() + " [Enealátero]";
                    case 10:
                        return this.getName() + " [Decalátero]";
                }
        }
        return "[Objeto]!";
    }

    public int getNumeroDePontos() {
        return points.size();
    }

    public ArrayList<Points> getPoints() {
        return points;
    }

    public void setPosicaoPainelWondow(int posicaoPainelWondow) {
        this.posicaoPainelWondow = posicaoPainelWondow;
    }

    public void setPoints(ArrayList<Points> points) {
        this.points = points;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public void setTipoObj(int tipoObj) {
        this.tipoObj = tipoObj;
    }

    public int getTipoObj() {
        return tipoObj;
    }

}
