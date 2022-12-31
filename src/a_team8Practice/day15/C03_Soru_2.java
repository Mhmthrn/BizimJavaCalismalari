package a_team8Practice.day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C03_Soru_2 {
    /*
     * Basit bir 5 ürünlü manav alisveris programi yaziniz.

           1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
           2. Adim : Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam miktari goster,
            istiyorsa tekrar urun sectir. Bu islemi alisverisi
                     bitirmek isteyene kadar tekrarla.
           3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
           4. Adim : Alisveris bitince toplam odemesi gereken tutari goster
       */

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        List<String> urunler=new ArrayList<>();
        urunler.add("Portakal==> 2,5 Tl");
        urunler.add("Elma ==> 2,7 Tl");
        urunler.add("Ayva==> 3,5 Tl");
        urunler.add("Kivi==> 3,6 Tl");
        urunler.add("Nar==> 5,2 Tl");

        System.out.println(urunler);

        List<Double> urunlerFiyat=new ArrayList<>();
        urunlerFiyat.add(2.5);
        urunlerFiyat.add(2.7);
        urunlerFiyat.add(3.5);
        urunlerFiyat.add(3.6);
        urunlerFiyat.add(5.2);



        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        double tutar=0;
        double kilo=0;


      String secilenislem="E";

      while (!secilenislem.substring(0,1).equalsIgnoreCase("h")){
            System.out.println("Lutfen almak istediginiz urunu seciniz\n" +
                                "=> Portakal icin 1'a\n" +
                                "=> Elma icin 2'e\n"+
                                "=> Ayva icin 3'e\n"+
                                "=> Kivi icin 4'e\n"+
                                "=> Nar icin 5'e\n");

            int siparisNum=scan.nextInt();

            System.out.println("Sectiginiz urunden kac kilo almak istersiniz?");
            kilo=scan.nextDouble();

            tutar +=urunlerFiyat.get(siparisNum-1)*kilo;
            System.out.println("Alisverise devam etmek istermisiniz");
            secilenislem=scan.next();

            if (secilenislem.substring(0,1).equalsIgnoreCase("e")){
                System.out.println("Lutfen almak istediginiz urunu seciniz\n" +
                        "=> Portakal icin 1'e\n" +
                        "=> Elma icin 2'e\n"+
                        "=> Ayva icin 3'e\n"+
                        "=> Kivi icin 4'e\n"+
                        "=> Nar icin 5'e\n");
                 siparisNum=scan.nextInt();
                System.out.println("Sectiginiz urunden kac kilo almak istersiniz?");
                kilo=scan.nextDouble();

                tutar +=urunlerFiyat.get(siparisNum-1)*kilo;

                System.out.println("Alisverise devam etmek istermisiniz");
                secilenislem=scan.next();

                }

            }

            System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz Toplam tutar : "+ tutar+ " Tl dir.");

        }

    }

