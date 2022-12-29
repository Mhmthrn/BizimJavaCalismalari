package a_team8Practice.day14;

import java.util.ArrayList;
import java.util.List;

public class C02_JSB {
    /*
    Listedeki 7 ve 10 dışındaki her öğenin değerini 2'şer artırınız.
Örnek: (12, 31, 7, 13, 10) ==> Çıktı (14, 33, 7, 15, 10
     */
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(12);
        sayilar.add(31);
        sayilar.add(7);
        sayilar.add(13);
        sayilar.add(10);

        for (int each : sayilar) {

            if (each==7 || each==10){
                continue;


            }

            sayilar.set(sayilar.indexOf(each),each+2);


        }

        System.out.println(sayilar);
    }
}
