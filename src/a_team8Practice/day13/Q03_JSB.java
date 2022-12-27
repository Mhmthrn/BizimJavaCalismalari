package a_team8Practice.day13;

import java.util.ArrayList;
import java.util.List;

public class Q03_JSB {
    /*
    Bir tamsayı listesindeki tüm çift sayıların çarpımını bulunuz
     */

    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();

        sayilar.add(0);
        sayilar.add(2);
        sayilar.add(4);
        sayilar.add(6);
        sayilar.add(8);

        List<Integer> ekleme=new ArrayList<>();
        ekleme.add(1);
        ekleme.add(3);
        ekleme.add(5);

        sayilar.addAll(ekleme);
        System.out.println(sayilar);

        System.out.println(sayilar.removeAll(ekleme));
        System.out.println(sayilar);


        int carpim=1;
        int silincekdeger=4;


        for (int i = 0; i < sayilar.size(); i++) {
            if (sayilar.get(i)%2==0){
                carpim*=sayilar.get(i);
            }

        }
        System.out.println("Cift elementlerin carpimi : "+ carpim);

    }
}
