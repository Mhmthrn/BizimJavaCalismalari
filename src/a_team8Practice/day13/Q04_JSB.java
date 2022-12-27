package a_team8Practice.day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q04_JSB {
    /*
    Bir listedeki öğelerin azalan sırada olup olmadığını kontrol ediniz.
    Örnek: (Sarı, Mavi, Kırmızı, Yeşil) ==> Çıktı: Azalan sırada değil
    (Sarı, Kırmızı, Yeşil, Mavi) ==> Çıktı: Azalan sıradadır
     */
    public static void main(String[] args) {

        List<String> list1=new ArrayList<>();
        list1.add("Turuncu");
        list1.add("Kahverengi");
        list1.add("Turkuaz");
        list1.add("Suyesili");
        list1.add("Mercanmavisi");

        List<String> list2=new ArrayList<>();
        list2.add("Kirmizi");
        list2.add("Pembe");
        list2.add("Yesil");
        list2.add("Mavi");
        list2.add("Mor");

        siralama(list1);
        siralama(list2);

    }

    public static void siralama(List<String> list1) {
        int count=0;


        for (int i = 0; i <list1.size()-1 ; i++) {

            if (list1.get(i).length()>=list1.get(i+1).length()){
                count++;

            }

        }

        if (count == list1.size()-1){
            System.out.println("Liste azalan sira seklinde element iceriyor. :)");
        }else {
            System.out.println("Liste azalan sira seklinde element icermiyor. :(");
        }
    }
}
