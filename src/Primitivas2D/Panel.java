/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Primitivas2D;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author coron
 */
public class Panel extends JPanel {
    
    
    protected int inicio, fim, largura, altura; 
    protected Color cor;
    protected float grossura;

    public Panel(int inicio, int fim, int largura, int altura, Color cor, float grossura) {
        this();
        this.inicio = inicio;
        this.fim = fim;
        this.largura = largura;
        this.altura = altura;
        this.cor = cor;
        this.grossura = grossura;
    }
    
    public Panel(){
        super();
        setOpaque(false);
        
    
    
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFim() {
        return fim;
    }

    public void setFim(int fim) {
        this.fim = fim;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor) {
        this.cor=cor;
    }
    
    public float getGrosura() {
        return grossura;
    }

    public void setGrossura(float grossura) {
        this.grossura=grossura;
    }    
    
}
