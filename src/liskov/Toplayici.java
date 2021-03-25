/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liskov;

import java.util.ArrayList;

/**
 *
 * @author AYŞE
 */
public class Toplayici {
    public double alanToplayici(ArrayList<AlanHesap>sekiller) {
        double toplam=0;
        for(AlanHesap sekil :sekiller) {
           toplam+=sekil.alanHesapla();
            
        }
        return toplam;
    }
    public double cevreToplayici(ArrayList<CevreHesap>sekiller){
        double toplam=0;
        for(CevreHesap sekil :sekiller){
            toplam+=sekil.cevreHesapla();
        }
        return toplam;
    }

   

  
}
