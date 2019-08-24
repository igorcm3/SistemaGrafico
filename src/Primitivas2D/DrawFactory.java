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
    protected final int PONTO=0, RETA=1, POLILINHA =3, POLIGONO =4;
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
                for (Points p : points) {
                    g2d.drawLine(p.getXi(), p.getYi(), p.getXf(), p.getYf());
                }
                break;
            case POLILINHA:
                 // percorre o arraylist por indices para controlar o desenho
                // ja que tem que pegar como inicio o fim do elemento anterior para desenahr a partir dele.
                for (int i =0; i<points.size(); i++) {
                    if (i == 0) {
                        //primeiro elemento desenha normal para o proximo ter uam referencia
                        g2d.drawLine(points.get(i).getXi(), points.get(i).getYi(), points.get(i).getXf(), points.get(i).getYf());    
                    } else{
                        g2d.drawLine(points.get(i-1).getXf(), points.get(i-1).getYf(), points.get(i).getXf(), points.get(i).getYf());    
                    }
                    
                }
                break;
        }
        g2d.dispose();
    }

    @Override
    public String toString() {
        switch(tipoObj){
            case RETA: return this.getName() + " [Reta]";
            //case Circulo: return this.getName() + " [Circulo]";
            case PONTO: return this.getName() + " [Ponto]";               
        }
        return "Tipo não identificado!";
    }
    
    public int getNumeroDePontos(){
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
