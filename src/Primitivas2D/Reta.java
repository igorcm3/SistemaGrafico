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
    Color cor;
    float grossura;

    public Reta(int xI, int yI, int xF, int yF) {
        this.xI = xI;
        this.yI = yI;
        this.xF = xF;
        this.yF = yF;
    }
    
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D)g;
     
        //g2d.setColor(cor); // passar por parametro
         g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(grossura)); // muda largura em pixel, passar por parametro para aumentar grossura do circulo
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.drawLine(xI, yI, xF,yF); 
        g2d.dispose();  
    }

    public float getGrossura() {
        return grossura;
    }

    public void setGrossura(float grossura) {
        this.grossura = grossura;
    }

    public Reta(Color c, float grossura) {
        this.cor = c;
        this.grossura = grossura;
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
