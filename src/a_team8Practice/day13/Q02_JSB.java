package a_team8Practice.day13;

import java.util.ArrayList;
import java.util.List;

public class Q02_JSB {
    /*
    ) Bir tamsayı listesinde 13 öğesinden önceki tüm liste öğelerinin toplamını bulunuz.
     */

    public static void main(String[] args) {
        List<Integer> tamsayiList=new ArrayList<>();
        tamsayiList.add(1);
        tamsayiList.add(1);
        tamsayiList.add(1);
        tamsayiList.add(1);
        tamsayiList.add(1);
        tamsayiList.add(1);
        tamsayiList.add(1);
        tamsayiList.add(1);
        tamsayiList.add(1);
        tamsayiList.add(1);
        tamsayiList.add(1);
        tamsayiList.add(1);
        tamsayiList.add(1);
        tamsayiList.add(81);
        tamsayiList.add(91);
        tamsayiList.add(11);
        tamsayiList.add(21);
        tamsayiList.add(41);

        int toplam=0;


        for (int i = 0; i <14 ; i++) {

            if (i==13){
                break;
            }
            toplam+=tamsayiList.get(i);

        }

        System.out.println("13. elementten onceki elementlerin toplami : "+ toplam);

    }

}
