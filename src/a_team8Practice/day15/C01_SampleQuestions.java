package a_team8Practice.day15;

import java.util.Scanner;

public class C01_SampleQuestions {
    /*HESAP MAKINESI
        * Problem Tanımı :
          Basit 4 işlem yapan bir hesap makinesi kodlayınız.

          Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayinız.
          Kullanicidan iki sayi girmesini isteyiniz.
          Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdirınız.
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("********** Hesap Makinasi **********\n" +
                            "Toplama icin ==>  +\n" +
                            "Cikarma icin ==>  -\n" +
                            "Carpma  icin ==>  *\n" +
                            "Bolme   icin ==>  /\n");
        String islem=scan.next();
        System.out.println("Lutfen islem yapmak istediginiz ilk sayiyi griniz");
        double ilkSayi=scan.nextDouble();
        System.out.println("Lutfen islem yapmak istediginiz ikinci sayiyi griniz");
        double ikinciSayi=scan.nextDouble();

        double sonuc=0;


        switch (islem){

            case "+":
                System.out.println("Girilen iki sayinin toplami : "+(ilkSayi+ikinciSayi));
                break;
            case "-":
                System.out.println("Girilen iki sayinin farki : "+(ilkSayi-ikinciSayi));
                break;
            case "*":
                System.out.println("Girilen iki sayinin carpimi : "+(ilkSayi*ikinciSayi));
                break;
            case "/":
                if (ikinciSayi==0){
                    System.out.println("!!!!!! Bir sayinin sifira bolumu tanimsizdir.");
                }else {
                System.out.println("Girilen iki sayinin bolumu : "+(ilkSayi/ikinciSayi));
                }
                break;
            default:
                System.out.println("Lutfen tanimli bir islem tipi seciniz.");
        }

    }
}
