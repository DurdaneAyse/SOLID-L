/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liskov;

/**
 *
 * @author AYŞE
 */
public class Cember implements CevreHesap{
    private double yaricap;
    public Cember(double yaricap){
        this.yaricap=yaricap;
    }
      public Cember(){   }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }
       
 

    @Override
    public double cevreHesapla() {
 return 6*getYaricap();    }

   
    
}
