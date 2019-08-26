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

    public int x;
    public int y;
    public Double xd;
    public Double yd;


    // CLASSE BASE PARA  INFORMAR OS PONTOS DOS OBJTS.
    // N FOI UTILZIADA A CLASSE POINT DO JAVA POR SO CONTER UM PONTO, AQUI PRECISAMOS DE DOIS
    public Points(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Points() {
    }

    public Double getXd() {
        return xd;
    }

    public void setXd(Double xd) {
        this.xd = xd;
    }

    public Double getYd() {
        return yd;
    }

    public void setYd(Double yd) {
        this.yd = yd;
    }
    
    

    public String toString() {
        return "Ponto x:"+x+" y:"+y+"";
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


}
