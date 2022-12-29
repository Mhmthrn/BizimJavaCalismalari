package a_team8Practice.day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;

public class C04_JSB {
    /*
    Bir String listesinde verilen en düşük ve en büyük fiyatın toplamını bulunuz.
    Örnek: List<String> myList = new List<String>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70
     */
    public static void main(String[] args) {
        List<String> sayilar = new ArrayList<>();

        sayilar.add("12.99");
        sayilar.add("23.60");
        sayilar.add("54.45");
        sayilar.add("14.45");
        sayilar.add("11.45");

        double minsayi=0;
        double maxsayi=0;
        List<Double> doubleToplam=new ArrayList<>();

        for (String each:sayilar){
            double fiyat= Double.parseDouble(each);

            doubleToplam.add(fiyat);

        }

        Collections.sort(doubleToplam);

        System.out.println("En kucuk ve en buyuk tutarlarin toplami : "+ (doubleToplam.get(0)+doubleToplam.get(doubleToplam.size()-1)));



    }
}
