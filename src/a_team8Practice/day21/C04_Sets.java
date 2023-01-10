package a_team8Practice.day21;

import java.util.*;

public class C04_Sets {
    /*
    Bir listede kaç farklı öğe olduğunu gösteren kodu yazınız.
    Örnek: {10, 31, 15, 7, 15, 7, 7} ==> 4
     */
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(8);
        sayilar.add(8);
        sayilar.add(8);
        sayilar.add(5);
        sayilar.add(15);
        sayilar.add(57);
        sayilar.add(58);
        sayilar.add(0);

        Set<Integer> tekrasizSet=new TreeSet<>(sayilar);

        System.out.println(tekrasizSet+" "+ tekrasizSet.size());





    }
}
