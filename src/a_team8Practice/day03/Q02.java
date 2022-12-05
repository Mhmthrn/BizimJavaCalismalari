package a_team8Practice.day03;

import java.util.Scanner;

public class Q02 {

    /*
    - Kullanicidan toplanmak uzere pozitif tamsayilar isteyin Kullaniciya bitirmek
      istediginde 0'a basmasini soyleyin
      Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdiginive
      bunlarin toplaminin kac oldugunu yazdirin

      Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin bu
      negatif sayiyi sayi adedine ve toplama eklemeyen ve bize yazdiran bir method olusturun.
     */

    public static void main(String[] args) {

        sayilarinToplami();

    }

    public static void sayilarinToplami() {
        Scanner scan=new Scanner(System.in);

        int girilenSayi=3;

        int girlenSayiAdedi=0;
        int toplam=0;

        while (girilenSayi != 0){

            System.out.println("Lutfen toplamak istediginiz tamsayi degerlerini giriniz" +
                                "\nBitimek icin 0'a basiniz");
            girilenSayi=scan.nextInt();

            if (girilenSayi>0){
                girlenSayiAdedi++;
                toplam+=girilenSayi;

            }else if (girilenSayi<0){
                System.out.println("!!! Negatif sayi kullanamazsiniz");

            }


        }
        System.out.println("Girilen "+girlenSayiAdedi+" adet sayinin toplami : "+ toplam);


    }

}
