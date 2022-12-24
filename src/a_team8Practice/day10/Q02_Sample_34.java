package a_team8Practice.day10;

import java.util.ArrayList;
import java.util.List;

public class Q02_Sample_34 {
    /*Soru 34-)
    Bir String'i parametre olarak kabul eden ve verilen dizede Stringde bulunan
    rakamların toplamını yazdıran bir Method yazın.
    Örnek
    String str : ade1r4d3
    Int toplam : 8
    İpucu :      Character.isDigit() kullanarak Digitleri alabilir sonra bunları
    Arraye atabilirsiniz.
    Ardından loop yardımı ile Integer.valueOf() kullanarak toplama yapabilirsiniz
        */
    public static void main(String[] args) {
        String str = "ade1r4d3";

        intTopla(str);

    }

    private static void intTopla(String str) {
        str=str.replaceAll("\\D","");
        int toplam=0;

        for (int i = 0; i < str.length(); i++) {

            toplam+=Integer.parseInt(str.substring(i,i+1));

        }

        System.out.println("String de gecen sayisal degerlerin toplami : "+toplam);
    }


}
