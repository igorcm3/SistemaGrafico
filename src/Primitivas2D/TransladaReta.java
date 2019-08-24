/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Primitivas2D;

/**
 *
 * @author wilsi
 */
public class TransladaReta {
    
    private int mt[][]=new int[3][3];
    private int p1[][]=new int[1][3];
    private int p2[][]=new int[1][3];
    private int pf1[][]=new int[1][3];
    private int pf2[][]=new int[1][3];
    
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
        p2[0][0]=0;
        p2[0][1]=0;
        p2[0][2]=1;
    }

    
    
    public int[] translada(DrawFactory reta,int tx,int ty){
        int pf[]=new int[4];
        p1[0][0]=reta.getxI();
        p1[0][1]=reta.getyI();
        p2[0][0]=reta.getxF();
        p2[0][1]=reta.getyF();
        mt[2][0]=tx;
        mt[2][1]=ty;
        
        pf1[0][0]=p1[0][0]*mt[0][0]+p1[0][1]*mt[1][0]+p1[0][2]*mt[2][0];
        pf1[0][1]=p1[0][0]*mt[0][1]+p1[0][1]*mt[1][1]+p1[0][2]*mt[2][1];
        
        pf2[0][0]=p2[0][0]*mt[0][0]+p2[0][1]*mt[1][0]+p2[0][2]*mt[2][0];
        pf2[0][1]=p2[0][0]*mt[0][1]+p2[0][1]*mt[1][1]+p2[0][2]*mt[2][1];
        
        pf[0]=pf1[0][0];
        pf[1]=pf1[0][1];
        pf[2]=pf2[0][0];
        pf[3]=pf2[0][1];
        //System.out.println(pf[0]+" "+pf[1]+" "+pf[2]+" "+pf[3]);
        return pf;
    }

    
    
    
    
}
