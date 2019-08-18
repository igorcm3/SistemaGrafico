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
import javax.swing.JPanel;

/**
 *
 * @author coron
 */
public class Retangulo extends JPanel {

    protected int xI;
    protected int yI;
    protected int xF;
    protected int yF;
    protected Color cor;
    protected float espessura;
    protected int posicaoPainelWondow;

    // construtor
    public void paintComponent(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        // super.paintComponent(g2d);
        g2d.setColor(cor);
        g2d.setStroke(new BasicStroke(1.0f)); // muda largura em pixel, passar por parametro para aumentar grossura do circulo
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        // g2d.drawRect(1, 1, largura-3, altura-3);
        g2d.drawRect(1, 1, (Math.abs(xF - xI)) - 3, (Math.abs(yF - yI)) - 3);
        g2d.dispose();
    }
    
    @Override
    public String toString(){
        return this.getName()+" xi:"+xI+" yi"+yI;
    }

    public int getxI() {
        return xI;
    }

    public void setxI(int xI) {
        this.xI = xI;
    }

    public int getyI() {
        return yI;
    }

    public void setyI(int yI) {
        this.yI = yI;
    }

    public int getxF() {
        return xF;
    }

    public void setxF(int xF) {
        this.xF = xF;
    }

    public int getyF() {
        return yF;
    }

    public void setyF(int yF) {
        this.yF = yF;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public float getEspessura() {
        return espessura;
    }

    public void setEspessura(float espessura) {
        this.espessura = espessura;
    }

    public int getPosicaoPainelWondow() {
        return posicaoPainelWondow;
    }

    public void setPosicaoPainelWondow(int posicaoPainelWondow) {
        this.posicaoPainelWondow = posicaoPainelWondow;
    }

    public Retangulo() {
    }
}
