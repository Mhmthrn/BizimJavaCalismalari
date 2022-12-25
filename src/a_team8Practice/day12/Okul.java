package a_team8Practice.day12;

import java.util.Arrays;
import java.util.Scanner;

public class Okul{


    /*
         Soru 44-)
            Main methodda ögrenci bilgileri oluşturun ve bu verileri kullanın.

            Changename adında bir method oluşturun, parametre olarak öğrenci bilgileri alın ve
            methodda tüm bilgileri değiştirin
            ve yeni bilgileri ekleyip yazdırın.

            Main Methoddaki Rename methodunu çağırdığımız satırda öğrenci bilgilerini tekrardan yazdırın

            Changesurname adlı bir method oluşturun , bu method lastname'i parametre olarak alsın.
            Methodda kullanıcıya yeni bir lastname
            sorulsun ve eski lastname degiştirilsin.
         */
    public static void main(String[] args) {
        String okulAdi="Horizont Highschcool";
        String name="Isim belirtilmedi";
        String surName="Soysisim belirtilmedi";
        String sinif="Sinif belirtilmedi";
        int yas = 0;


        Changename(okulAdi,name,surName,sinif,yas);

        Changesurname(surName);
    }

    public static void Changesurname(String surName) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen soyisminizi  degistirmek istediginiz haliyle yaziniz.");
        String newSurname=scan.next();

        System.out.println("Soyisiminiz "+ surName+ " den "+ newSurname +" e degistirilmistir.");

    }

    public static void Changename(String okulAdi, String name, String surName, String sinif, int yas) {
        okulAdi="Malazgirt Highschool";
        name="Yusuf";
        surName="Safak";
        sinif="9/A";
        yas=15;
        System.out.println("Okul Adi : "+okulAdi+" Isim :"+ name+ " Soysisim "+
                                        surName+ " Sinif/Sube : "+ sinif+" Yas : "+ yas);

    }


    public Okul(String okulAdi,String name, String surName, String sinif, int yas) {



    }





}
