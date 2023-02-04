package a_team8Practice.day24;

import java.util.InputMismatchException;

public class C02_Soru {
    /*
    Soru 1- Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
    baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
    bir method olusturun.
    - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
    mesaji verin.

    - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
    yazdirin.
     */
    public static void main(String[] args) {
        String input="java bitti cok sukur";

        int basIndex=23;
        int bitIndex=28;

        istenilenAraligiYazdir(input,basIndex,bitIndex);


    }

    private static void istenilenAraligiYazdir(String input, int basIndex, int bitIndex) {

        if (basIndex>bitIndex){
            System.out.println("Baslangic indexi bitis indexinden buyuk olamaz. Bu nedenle Isleminiz gerceklestirilemez.");


        }else if (basIndex>input.length() || bitIndex>input.length()){
            throw new IndexOutOfBoundsException("Girdiginiz deger String de bulunmamaktadir.");


        }else {

            System.out.println("Gruntulem istediginiz aralik : "+input.substring(basIndex, bitIndex));

        }
    }
}
