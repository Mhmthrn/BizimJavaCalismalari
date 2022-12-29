package a_team8Practice.day14;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class C03_JSB {
/*
String bir listede verilen tüm fiyatların toplamını bulunuz.
Örnek: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04
 */
public static void main(String[] args) {

    List<String> sayilar = new ArrayList<>();

    sayilar.add("12.99");
    sayilar.add("23.60");
    sayilar.add("54.45");

    double toplam=0;

    for (String each: sayilar){

       double stringFiyat=Double.valueOf(each);
       toplam+=stringFiyat;
    }

    System.out.println("Toplam fiyat : "+ toplam);



    }






}


