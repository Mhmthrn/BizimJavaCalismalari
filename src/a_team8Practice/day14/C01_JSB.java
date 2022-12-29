package a_team8Practice.day14;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class C01_JSB {
    /*
    Bir tamsayı listesinde en yakın 2 tamsayıyı bulunuz.
    Örnek: (12, 31, 15, 13, 54) ==> Çıktı 12 ve 13'tür
     */
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(85);
        sayilar.add(33);
        sayilar.add(7);
        sayilar.add(99);
        sayilar.add(101);



        Collections.sort(sayilar);

        int minumumFark=sayilar.get(2)-sayilar.get(1);
        for (int i = 1; i < sayilar.size(); i++) {

            minumumFark=Math.min(minumumFark,sayilar.get(i)-sayilar.get(i-1));

        }
        System.out.println("Listede bulunan elementlerin Minumum farki : "+ minumumFark);
        System.out.println();
        for (int i =1 ; i <sayilar.size() ; i++) {

            if (sayilar.get(i)-sayilar.get(i-1)== minumumFark){
                System.out.println(sayilar.get(i)+" ve "+ sayilar.get(i-1));
            }

        }


    }
}
