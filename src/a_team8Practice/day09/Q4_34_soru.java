package a_team8Practice.day09;

import java.util.Arrays;

public class Q4_34_soru {
    /*
    Soru 34-)
        Bir String'i parametre olarak kabul eden ve verilen dizede Stringde bulunan rakamların toplamını yazdıran bir Method yazın.

        Örnek
        String str : ade1r4d3
        Int toplam : 8
        İpucu :      Character.isDigit() kullanarak Digitleri alabilir sonra bunları Arraye atabilirsiniz.
                          Ardından loop yardımı ile Integer.valueOf() kullanarak toplama yapabilirsiniz
        ------------------------------------------------------------------------------------------------------------------
     */
    public static void main(String[] args) {
        String str ="a8d7ejdyehfjff7d89f5d4gfgdg6786dh7d64g6d5g6dh7d64g6d8h6d7h9d4gh6df4h6d7h61r4d3";




        rakmalarToplami(str);

    }

    private static void rakmalarToplami(String str) {

        str= str.replaceAll("\\D","");
        String [] strarr=str.split("");

        int toplam=0;
        int sayac=0;

        for (String s : strarr) {



                toplam+=Integer.parseInt(s);
                sayac++;




        }

        System.out.println("Dizide bulanan "+sayac+" adet  sayinin toplami : "+ toplam);
    }
}
