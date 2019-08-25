/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Primitivas2D;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author wilsi
 */
public class TransladaReta {
    protected final int PONTO = 0, RETA = 1, POLILINHA = 2, POLIGONO = 3;
    private int mt[][]=new int[3][3];
    private int p1[][]=new int[1][3];
    
    private int pf1[][]=new int[1][4];
    
    
    public TransladaReta() {
        mt[0][0]=1;
        mt[0][1]=0;
        mt[0][2]=0;
        mt[1][0]=0;
        mt[1][1]=1;
        mt[1][2]=0;
        mt[2][0]=0;
        mt[2][1]=0;
        mt[2][2]=1;
        p1[0][0]=0;
        p1[0][1]=0;
        p1[0][2]=1;
        
    }

    
    
    public ArrayList<Points> translada(DrawFactory obj,int tx,int ty){
        mt[2][0]=tx;
        mt[2][1]=ty;
        
        ArrayList<Points> ponto= obj.getPoints();
        ArrayList<Points> pf = new ArrayList<>();
        for(Points p:ponto){
            Points pontoresult=new Points();
            
            p1[0][0]=p.getXi()-500;
            p1[0][1]=-(p.getYi()-500);
           
            pf1[0][0]=p1[0][0]*mt[0][0]+p1[0][1]*mt[1][0]+p1[0][2]*mt[2][0];
            pf1[0][1]=p1[0][0]*mt[0][1]+p1[0][1]*mt[1][1]+p1[0][2]*mt[2][1];
            
            p1[0][0]=p.getXf()-500;
            p1[0][1]=-(p.getYf()-500);
          
            pf1[0][2]=p1[0][0]*mt[0][0]+p1[0][1]*mt[1][0]+p1[0][2]*mt[2][0];
            pf1[0][3]=p1[0][0]*mt[0][1]+p1[0][1]*mt[1][1]+p1[0][2]*mt[2][1];
            
            pontoresult.setXi(pf1[0][0]+500);
            pontoresult.setYi(-pf1[0][1]+500);
            pontoresult.setXf(pf1[0][2]+500);
            pontoresult.setYf(-pf1[0][3]+500);
            
            pf.add(pontoresult);
        }
        
        return pf;
    }

    
    
    
    
}
