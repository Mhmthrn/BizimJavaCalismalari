package a_team8Practice.day07;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    // input olarak verilen bir Stringde
    // index'i tek sayi olanlari kucuk harfle
    // index'i cift sayi olanlari buyuk harfle yazdirin
    // ornek : Java  output: JaVa
    // String input = "Java candir, Selenium heyecandir";




    public static void main(String[] args) {

        String input = "Java candir, Selenium heyecandir";




       for (int i = 0; i <input.length() ; i++) {

            System.out.print  ( i%2==0   // index cift mi ?
                    ? input.substring(i,i+1).toUpperCase() // index cift ise
                    : input.substring(i,i+1).toLowerCase() // index cift degilse
            );
        }



    }


}
