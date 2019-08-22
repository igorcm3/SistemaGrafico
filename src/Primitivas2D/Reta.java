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
public class Reta extends JPanel {
    protected int xI;
    protected int yI;
    protected int xF;
    protected int yF;
    protected Color cor;
    protected float espessura;
    protected int posicaoPainelWondow;

    public Reta(int xI, int yI, int xF, int yF) {
        this.xI = xI;
        this.yI = yI;
        this.xF = xF;
        this.yF = yF;
    }
    
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(cor); // passar por parametro
        g2d.setStroke(new BasicStroke(espessura)); // muda largura em pixel, passar por parametro para aumentar grossura.
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.drawLine(xI, yI, xF,yF); 
        g2d.dispose();  
    }
    
    @Override
    public String toString(){
        return this.getName()+" xi:"+xI+" yi"+yI;
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

    public Reta(Color c, float espessura) {
        this.cor = c;
        this.espessura = espessura;
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
    
}
