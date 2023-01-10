package a_team8Practice.day21;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class C05_SetVsList {
    /*
    Set ve Liste arasındaki ortak öğeleri yazdırmak için kod yazınız.
     */
    public static void main(String[] args) {
        Set<Integer> sayiSet=new TreeSet<>();
        sayiSet.add(1);
        sayiSet.add(0);
        sayiSet.add(3);
        sayiSet.add(14);
        sayiSet.add(10);
        sayiSet.add(8);


        List<Integer> sayiList=new ArrayList<>();
        sayiList.add(9);
        sayiList.add(19);
        sayiList.add(10);
        sayiList.add(1);
        sayiList.add(3);
        sayiList.add(3);
        sayiList.add(8);

        sayiSet.retainAll(sayiList);

        System.out.println(sayiSet);



    }

}
