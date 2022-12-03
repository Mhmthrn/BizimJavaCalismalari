package a_team8Practice.day03;

import java.util.Scanner;

public class Q01 {

    /*
    Kullanicidan iki farkli dogum gunu tarihini alip,
    kimin once dogdugunu consolda yazdiran bir method yaziniz.
     */
    public static void main(String[] args) {

        dogumGunuHesapla();

    }

    public static void dogumGunuHesapla() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kiyaslamak istediginiz 1. dogumgununu \n" +
                "sirasiyla YY/AA/GG seklinde giriniz");

        int yil1 = scan.nextInt();
        int ay1 = scan.nextInt();
        int gun1 = scan.nextInt();

        System.out.println("Lutfen kiyaslamak istediginiz 2. dogumgununu \n" +
                "sirasiyla YY/AA/GG seklinde giriniz");
        int yil2 = scan.nextInt();
        int ay2 = scan.nextInt();
        int gun2 = scan.nextInt();
        
        
        if (yil1>yil2){
            System.out.println("Girilen 2. Dogum Gunu  buyuktur.");
        } else if (yil1<yil2) {
            System.out.println("Girilen 1. Dogum Gunu  buyuktur.");
            
        }else {// yillar esit
            if (ay1>ay2){
                System.out.println("Girilen 2. Dogum Gunu  buyuktur.");

            } else if (ay1<ay2) {
                System.out.println("Girilen 1. Dogum Gunu  buyuktur.");

            }else {// aylar esit
                if (gun1>gun2){
                    System.out.println("Girilen 2. Dogum Gunu  buyuktur.");
                } else if (gun1<gun2) {
                    System.out.println("Girilen 1. Dogum Gunu  buyuktur.");

                }// gunler esit
                else System.out.println("Ayni gun dogulmustur buyukluk soz konusu degildir.");
            }
        }

        System.out.println("_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+_+");

        int birinciDogumGunu = yil1 * 1000 + ay1 * 100 + gun1 * 10;
        int ikinciDogumGunu = yil2 * 1000 + ay2 * 100 + gun2 * 10;

        if (birinciDogumGunu > ikinciDogumGunu) {
            System.out.println("Ikinci gogum gunu buyuktur");

        } else if (birinciDogumGunu < ikinciDogumGunu) {
            System.out.println("Birinci gogum gunu buyuktur");

        } else {
            System.out.println("ayni gun dogmussunuz");


        }

    }
}
