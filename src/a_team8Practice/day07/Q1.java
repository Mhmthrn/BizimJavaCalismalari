package a_team8Practice.day07;

import java.util.Scanner;

public class Q1 {
    /*
     Soru 21-)
            Bir aydaki gün sayısını bulmak için bir Java programı yazın
            (Mülakat Sorusu / Interview Sorusu / Leak Year)

            Örnek:
            Bir ay numarası girin: 2
            Bir yıl girin: 2016

            Şubat 2016'da 29 gün vardır
            ipucu:
            Switch Case kullanarak çözebiliriz. Şubat ayı senelere göre farklılık gösterir. Bunu çözmek için Şubat ayı için method kullanmamız gerekiyor!
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gun sayisini ogrenmek istediginiz ayi ve yili giriniz");
        String ay=scan.next();
        int yil=scan.nextInt();

        switch (ay) {
            case "ocak", "mart", "mayis", "temmuz", "agustos", "ekim", "aralik" ->
                    System.out.println(ay + " " + yil + " 'da  31 gun vardir");
            case "nisan", "haziran", "eylul", "kasim" -> System.out.println(ay + " " + yil + " 'da  30 gun vardir");
            case "subat" -> subatGunsayisi(yil);
            default -> System.out.println();
        }


    }

    public static void subatGunsayisi(int yil) {

        if (yil%4==0 || yil%400==0){
            System.out.println("Subat" +" "+yil+ " 'da  29 gun vardir");
        }else {

            System.out.println("Subat" +" "+yil+ " 'da  28 gun vardir");
        }


    }
}
