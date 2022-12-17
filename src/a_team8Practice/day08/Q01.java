package a_team8Practice.day08;

import java.util.Arrays;

public class Q01 {
    public static void main(String[] args) {
       /*
       Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
olusturun.
        */

        String [] str={"Kitap", "Kalemlik", " Bilgin", "Vay"};
        enKisaEnUzuKelime(str);


    }
    public static void enKisaEnUzuKelime(String[] abc){

        String enKisaKelime=abc[0];
        String enUzunKelime=abc[0];

        for (int i = 0; i < abc.length; i++) {

           if (abc[i].length()>enUzunKelime.length()){

               enUzunKelime=abc[i];
           }

           if (abc[i].length()<=enKisaKelime.length()){

               enKisaKelime=abc[i];
           }

        }

        System.out.println("Array'de bulunan En Uzun Kelime : "+enUzunKelime+"\n"+
                            "Array'de bulunan En Kisa Kelime : "+enKisaKelime);
    }
}
