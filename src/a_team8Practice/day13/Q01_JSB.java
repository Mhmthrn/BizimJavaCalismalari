package a_team8Practice.day13;

import java.util.ArrayList;
import java.util.List;

public class Q01_JSB {
    /*
    1) Bir tamsayı listesindeki tüm öğelerinin toplamını bulunuz
     */
    public static void main(String[] args) {

        int [] sayilar={1,2,3,6,4,5,6,9,8,7};
        List<Integer> sayiListe=new ArrayList<>();

        for (int i = 0; i < sayilar.length; i++) {
            sayiListe.add(sayilar[i]);

        }
        System.out.println(sayiListe);

        int toplam=0;

        for(int s:sayiListe){
            toplam+=s;
        }

        System.out.println("List in elementleri toplami : "+ toplam);

    }
}
