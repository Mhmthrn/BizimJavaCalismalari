package a_team8Practice.day06;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        /*
        Soru 18-)
            Girilen araç hızı ve yol kilometresinden, gidilen yere varış süresini hesaplayan bir method yazalım.

            Kullanıcıya hızını ve kilometreyi soralım, bunu methoda gönderelim ve bize varış süremizi hesaplasın
            İpucu:
            yol=Hız*zaman
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen hizini giriniz");
        double hiz=scan.nextDouble();
        System.out.println("Lutfen km giriniz");
        double km=scan.nextDouble();

        varisSuremiHesapla(hiz,km);





    }
    public static void varisSuremiHesapla(double hiz,double km){

        double zaman=km/hiz;


            System.out.println("Varis saatiniz "+ zaman+ " saattir.");


    }
}
