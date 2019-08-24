/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Primitivas2D;

/**
 *
 * @author coron
 */
public class Points {

    public int xi;
    public int yi;
    public int xf;
    public int yf;

    // CLASSE BASE PARA  INFORMAR OS PONTOS DOS OBJTS.
    // N FOI UTILZIADA A CLASSE POINT DO JAVA POR SO CONTER UM PONTO, AQUI PRECISAMOS DE DOIS
    public Points(int xi, int yi, int xf, int yf) {
        this.xi = xi;
        this.yi = yi;
        this.xf = xf;
        this.yf = yf;
    }

    public Points() {
    }

    public String toString() {
        return "Ponto x:"+xi+" y:"+yi+"";
    }

    public int getXi() {
        return xi;
    }

    public void setXi(int xi) {
        this.xi = xi;
    }

    public int getYi() {
        return yi;
    }

    public void setYi(int yi) {
        this.yi = yi;
    }

    public int getXf() {
        return xf;
    }

    public void setXf(int xf) {
        this.xf = xf;
    }

    public int getYf() {
        return yf;
    }

    public void setYf(int yf) {
        this.yf = yf;
    }

}
