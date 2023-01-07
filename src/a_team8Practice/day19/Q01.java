package a_team8Practice.day19;

import java.util.Arrays;

public class Q01 {
    /*
    SORU 1)  2 String girmesini isteyiniz. Stringlerin karakterleri ve
    karakter sayıları aynıysa konsola "Anagramdır" yazdırın. Aksi takdirde,
    konsolda "Anagram Değil" yazdırınız.
    Örneğin; "Mary" ve "army" ve "RAMY" Anagramlardır.

     */
    public static void main(String[] args) {
        String input1="Namaz";
        String input2="Zaman";



        String [] temp1=input1.toLowerCase().split("");
        Arrays.sort(temp1);
        String [] temp2=input2.toLowerCase().split("");
        Arrays.sort(temp2);


       if (temp1.length==temp2.length){
           if (Arrays.equals(temp1,temp2)){

               System.out.println("Kelime anagramdir.");
           }else {
               System.out.println("Kelime anagram degildir.");
           }


       }else {
           System.out.println("Grilen kelimeler anagram degildir.");
       }




    }
}
