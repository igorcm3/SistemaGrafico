/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Primitivas2D;

import static java.lang.Math.cos;
import static java.lang.Math.round;
import static java.lang.Math.sin;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author wilsi
 */
public class Transforma {
    protected final int PONTO = 0, RETA = 1, POLILINHA = 2, POLIGONO = 3;
    private Double mt[][]=new Double[3][3];
    
    private Double p1[][]=new Double[1][3];
    
    private Double pf1[][]=new Double[1][3];
    
    
    public Transforma() {
        mt[0][0]=1.0;
        mt[0][1]=0.0;
        mt[0][2]=0.0;
        mt[1][0]=0.0;
        mt[1][1]=1.0;
        mt[1][2]=0.0;
        mt[2][0]=0.0;
        mt[2][1]=0.0;
        mt[2][2]=1.0;
        p1[0][0]=0.0;
        p1[0][1]=0.0;
        p1[0][2]=1.0;
        
    }

    
    
    public ArrayList<Points> translada(DrawFactory obj,double x,double y){
        mt[2][0]=x;
        mt[2][1]=y;
          
        ArrayList<Points> ponto= obj.getPoints();
        ArrayList<Points> pf = new ArrayList<>();
        for(Points p:ponto){
            Points pontoresult=new Points();
            
            p1[0][0]=p.getX()-500.0;
            p1[0][1]=-(p.getY()-500.0);
           
            pf1[0][0]=p1[0][0]*mt[0][0]+p1[0][1]*mt[1][0]+p1[0][2]*mt[2][0];
            pf1[0][1]=p1[0][0]*mt[0][1]+p1[0][1]*mt[1][1]+p1[0][2]*mt[2][1];
            
            
           
            
            pontoresult.setX((int) (pf1[0][0]+500));
            pontoresult.setY((int) (-pf1[0][1]+500));
           
            
            pf.add(pontoresult);
        }
        
        return pf;
    }

    
    public ArrayList<Points> escalona(DrawFactory obj,double x,double y,int op){
        
        
        ArrayList<Points> ponto= obj.getPoints();
        ArrayList<Points> pf = new ArrayList<>();
        
        if(op==0){
        for(Points p:ponto){
            Points pontoresult=new Points();
            mt[0][0]=x;
            mt[1][1]=y;
            p1[0][0]=p.getX()-500.0;
            p1[0][1]=-(p.getY()-500.0);
           
            pf1[0][0]=p1[0][0]*mt[0][0]+p1[0][1]*mt[1][0]+p1[0][2]*mt[2][0];
            pf1[0][1]=p1[0][0]*mt[0][1]+p1[0][1]*mt[1][1]+p1[0][2]*mt[2][1];
            
            pontoresult.setX((int) (pf1[0][0]+500));
            pontoresult.setY((int) (-pf1[0][1]+500));
            pf.add(pontoresult);
        }
        }
        
        if(op==1){
            Double tx=(ponto.get(0).getX()-500.0);
            Double ty=-(ponto.get(0).getY()-500.0);
            
            for(Points p:ponto){
                Points pontoresult=new Points();
                //matriz para transladar canto do objeto até a origem
                
                mt[2][0]=-tx;
                mt[2][1]=-ty;
                p1[0][0]=p.getX()-500.0;
                p1[0][1]=-(p.getY()-500.0);
                pf1[0][0]=p1[0][0]*mt[0][0]+p1[0][1]*mt[1][0]+p1[0][2]*mt[2][0];
                pf1[0][1]=p1[0][0]*mt[0][1]+p1[0][1]*mt[1][1]+p1[0][2]*mt[2][1];
                
                //matriz para fazer escalonamento
                mt[2][0]=0.0;
                mt[2][1]=0.0;
                mt[0][0]=x;
                mt[1][1]=y;
                p1[0][0]=pf1[0][0];
                p1[0][1]=pf1[0][1];
                pf1[0][0]=p1[0][0]*mt[0][0]+p1[0][1]*mt[1][0]+p1[0][2]*mt[2][0];
                pf1[0][1]=p1[0][0]*mt[0][1]+p1[0][1]*mt[1][1]+p1[0][2]*mt[2][1];
                
                
                
                //matriz para transladar para ponto original do objeto
                mt[0][0]=1.0;
                mt[1][1]=1.0;
                mt[2][0]=tx;
                mt[2][1]=ty;
                p1[0][0]=pf1[0][0];
                p1[0][1]=pf1[0][1];
                pf1[0][0]=p1[0][0]*mt[0][0]+p1[0][1]*mt[1][0]+p1[0][2]*mt[2][0];
                pf1[0][1]=p1[0][0]*mt[0][1]+p1[0][1]*mt[1][1]+p1[0][2]*mt[2][1];
                
                
                pontoresult.setX((int) (pf1[0][0]+500));
                pontoresult.setY((int) (-pf1[0][1]+500));
                pf.add(pontoresult);
            }
        
        
        }
        
        if(op==2){
            Points pt=new Points();
            pt=acharMeio(ponto);
            
            
            for(Points p:ponto){
                Points pontoresult=new Points();
                //matriz para transladar meio do objeto para origem
                mt[2][0]=-pt.getXd();
                mt[2][1]=-pt.getYd();
                p1[0][0]=p.getX()-500.0;
                p1[0][1]=-(p.getY()-500.0);
                pf1[0][0]=p1[0][0]*mt[0][0]+p1[0][1]*mt[1][0]+p1[0][2]*mt[2][0];
                pf1[0][1]=p1[0][0]*mt[0][1]+p1[0][1]*mt[1][1]+p1[0][2]*mt[2][1];
                
                //matriz para fazer escalonamento
                mt[2][0]=0.0;
                mt[2][1]=0.0;
                mt[0][0]=x;
                mt[1][1]=y;
                p1[0][0]=pf1[0][0];
                p1[0][1]=pf1[0][1];
                pf1[0][0]=p1[0][0]*mt[0][0]+p1[0][1]*mt[1][0]+p1[0][2]*mt[2][0];
                pf1[0][1]=p1[0][0]*mt[0][1]+p1[0][1]*mt[1][1]+p1[0][2]*mt[2][1];
                
                //matriz para transladar para ponto original do objeto
                mt[0][0]=1.0;
                mt[1][1]=1.0;
                mt[2][0]=pt.getXd();
                mt[2][1]=pt.getYd();
                p1[0][0]=pf1[0][0];
                p1[0][1]=pf1[0][1];
                pf1[0][0]=p1[0][0]*mt[0][0]+p1[0][1]*mt[1][0]+p1[0][2]*mt[2][0];
                pf1[0][1]=p1[0][0]*mt[0][1]+p1[0][1]*mt[1][1]+p1[0][2]*mt[2][1];
                
                pontoresult.setX((int) (pf1[0][0]+500));
                pontoresult.setY((int) (-pf1[0][1]+500));
                pf.add(pontoresult);
            }
            
            
        }
        return pf;
    }
    
    public ArrayList<Points> rotaciona(DrawFactory obj,double x,double y,int op){
        double ang=Math.toRadians(x);
        ArrayList<Points> ponto= obj.getPoints();
        ArrayList<Points> pf = new ArrayList<>();
        double mr[][]= new double[3][3];
        
        
        mr[0][0]=cos(ang);
        mr[0][1]=sin(ang);
        mr[0][2]=0;
        mr[1][0]=-sin(ang);
        mr[1][1]=cos(ang);
        mr[1][2]=0;
        mr[2][0]=0;
        mr[2][1]=0;
        mr[2][2]=1;
        
        
        
        if(op==0){
            
            for(Points p:ponto){
            Points pontoresult=new Points();
            
            p1[0][0]=p.getX()-500.0;
            p1[0][1]=-(p.getY()-500.0);
            p1[0][2]=1.0;
            
            
            pf1[0][0]=p1[0][0]*mr[0][0]+p1[0][1]*mr[1][0]+p1[0][2]*mr[2][0];
            pf1[0][1]=p1[0][0]*mr[0][1]+p1[0][1]*mr[1][1]+p1[0][2]*mr[2][1];
                
            
            pontoresult.setX((int) (pf1[0][0]+500));
            pontoresult.setY((int) (-pf1[0][1]+500));
                
            pf.add(pontoresult);
        }
        }
        
        if(op==1){
            
            Double tx=(ponto.get(0).getX()-500.0);
            Double ty=-(ponto.get(0).getY()-500.0);
            
            
            for(Points p:ponto){
                Points pontoresult=new Points();
                //matriz para transladar canto do objeto até a origem
                
                mt[2][0]=-tx;
                mt[2][1]=-ty;
                p1[0][0]=p.getX()-500.0;
                p1[0][1]=-(p.getY()-500.0);
                p1[0][2]=1.0;
                
                pf1[0][0]=p1[0][0]*mt[0][0]+p1[0][1]*mt[1][0]+p1[0][2]*mt[2][0];
                pf1[0][1]=p1[0][0]*mt[0][1]+p1[0][1]*mt[1][1]+p1[0][2]*mt[2][1];
                
                
                p1[0][0]=pf1[0][0];
                p1[0][1]=pf1[0][1];
                pf1[0][0]=p1[0][0]*mr[0][0]+p1[0][1]*mr[1][0]+p1[0][2]*mr[2][0];
                pf1[0][1]=p1[0][0]*mr[0][1]+p1[0][1]*mr[1][1]+p1[0][2]*mr[2][1];
                
                
               
                //matriz para transladar para ponto original do objeto
                
                mt[2][0]=tx;
                mt[2][1]=ty;
                p1[0][0]=pf1[0][0];
                p1[0][1]=pf1[0][1];
                pf1[0][0]=p1[0][0]*mt[0][0]+p1[0][1]*mt[1][0]+p1[0][2]*mt[2][0];
                pf1[0][1]=p1[0][0]*mt[0][1]+p1[0][1]*mt[1][1]+p1[0][2]*mt[2][1];
                
                
                pontoresult.setX((int) (pf1[0][0]+500));
                pontoresult.setY((int) (-pf1[0][1]+500));
                pf.add(pontoresult);
            }
        
            
        }
        
        if(op==2){
            Points pt=new Points();
            pt=acharMeio(ponto);
            
            
            for(Points p:ponto){
                Points pontoresult=new Points();
                //matriz para transladar meio do objeto para origem
                mt[2][0]=-pt.getXd();
                mt[2][1]=-pt.getYd();
                p1[0][0]=p.getX()-500.0;
                p1[0][1]=-(p.getY()-500.0);
                p1[0][2]=1.0;
                pf1[0][0]=p1[0][0]*mt[0][0]+p1[0][1]*mt[1][0]+p1[0][2]*mt[2][0];
                pf1[0][1]=p1[0][0]*mt[0][1]+p1[0][1]*mt[1][1]+p1[0][2]*mt[2][1];
                
                //matriz para fazer rotação
                
                p1[0][0]=pf1[0][0];
                p1[0][1]=pf1[0][1];
                pf1[0][0]=p1[0][0]*mr[0][0]+p1[0][1]*mr[1][0]+p1[0][2]*mr[2][0];
                pf1[0][1]=p1[0][0]*mr[0][1]+p1[0][1]*mr[1][1]+p1[0][2]*mr[2][1];
                
                //matriz para transladar para ponto original do objeto
                
                mt[2][0]=pt.getXd();
                mt[2][1]=pt.getYd();
                p1[0][0]=pf1[0][0];
                p1[0][1]=pf1[0][1];
                pf1[0][0]=p1[0][0]*mt[0][0]+p1[0][1]*mt[1][0]+p1[0][2]*mt[2][0];
                pf1[0][1]=p1[0][0]*mt[0][1]+p1[0][1]*mt[1][1]+p1[0][2]*mt[2][1];
                
                pontoresult.setX((int)(pf1[0][0]+500));
                pontoresult.setY((int) (-pf1[0][1]+500));
                pf.add(pontoresult);
            }
        
        }
    
        return pf;
    }
    
    public Points acharMeio(ArrayList<Points> pontos){
        Points pf =new Points();
        Double xm=0.0;
        Double ym=0.0;
        Double cont=0.0;
        
        for(Points p:pontos){
            xm=xm+(p.getX()-500.0);
            ym=ym-(p.getY()-500.0);
            cont++;
        }
        
        xm=xm/cont;
        ym=ym/cont;
        pf.setXd(xm);
        pf.setYd(ym);
        
        return pf;
    }
    
   

    
    
    
    
}
