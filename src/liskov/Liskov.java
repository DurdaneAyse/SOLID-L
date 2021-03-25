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
public class Liskov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Toplayici toplayici=new Toplayici();
        Kare kare1=new Kare();
        kare1.setKenar(4);
        Kare kare2=new Kare(5);
        Dikdortgen dikdortgen=new Dikdortgen(4,6);
        Cember cember=new Cember(7);
        
        
      ArrayList<CevreHesap> cevreHesapArrayList=new ArrayList<>();
      ArrayList<AlanHesap> alanHesapArrayList=new ArrayList<>();

      cevreHesapArrayList.add( kare1);
      cevreHesapArrayList.add( dikdortgen);
      cevreHesapArrayList.add( cember);
      alanHesapArrayList.add(kare2);
      alanHesapArrayList.add(dikdortgen);


        System.out.println(toplayici.alanToplayici(alanHesapArrayList));
        System.out.println(toplayici.cevreToplayici(cevreHesapArrayList));

       /* System.out.println(kare1.alanHesapla());
        System.out.println(kare2.alanHesapla());
        System.out.println(dikdortgen.alanHesapla());
        
        System.out.println(kare1.cevreHesapla());
        System.out.println(kare2.cevreHesapla());
        System.out.println(dikdortgen.cevreHesapla());
*/

    }
    
}
