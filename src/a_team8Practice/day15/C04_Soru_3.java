package a_team8Practice.day15;

import java.util.Scanner;

public class C04_Soru_3 {
    /*
   Constructor Sorusu-
   1. Aşama: Başlangıçta İlk Oyuncuya oyunu başlatmak için bir kelime girmesini iste.

   2. Aşama: Sonra oyuncuyu degiştir ve ikinci oyuncuya geç.
    Yeni oyuncuya verilen kelimenin geçerli olup olmadıgını sor
      2.1) Eğer yeni oyuncu verilen kelimeyi kabul ederse :
       kelimeyi yazan oyuncuya puan olarak kelimedeki harf sayısını ekleyin ve 3. adıma gidin
      2.2) Eğer yeni oyuncu verilen kelimeyi	geçerli olarak kabul etmesse
       "Geçersiz kelime, oyuncu X(Mevcut oyuncu) oyunu kazandı" yazıp oyunu bitirin.

   3. Aşama: Kullanıcılara oyuna devam etmek isteyip istemediklerini sor: Eğer devam etmek isterlerse:
     3.1) Kullanıcıdan kelimeye eklemek için bir harf isteyin
     3.2) Ve kullanıcıya hangi tarafa eklemek istedigini sorun (Başa veya Sona)
     3.3) Daha sonra harfi kelimeye ekleyin ve 2.Aşamaya geçin
      Eğer devam etmek istemezlerse:
     "Game Finished" yazdırın.        Puanları ve kazananı ekrana yazdırın

     */
   static Scanner scan=new Scanner(System.in);
   static String oyuncu1="";
   static String oyuncu2="";
   static int puan1=0;
   static int puan2=0;
    public static void main(String[] args) {

        System.out.println("Lutfen oyunu baslatmak icin bir kelime giriniz.");
        String ilkKelime=scan.next();
        oyun(ilkKelime);

    }

    public static void oyun(String ilkKelime) {

        boolean flag=true;
        while (flag){
            System.out.println("Oyuncu1'in girmis oldugu "+ilkKelime+ "'yi onayliyor musunuz?");
            String oyuncu2Cvp=scan.next();

            if (oyuncu2Cvp.substring(0,1).equalsIgnoreCase("h")){
                System.out.println("Geçersiz kelime, oyuncu2 oyunu kazandı.");
                flag=false;
            }else {

                puan1+=ilkKelime.length();
                System.out.println("Oyuncu1 => "+puan1+" puan kazanmistir.");
                ucuncuAsama(ilkKelime);
            }
        }

    }

    public static void ucuncuAsama(String ilkKelime) {
        System.out.println("Oyuna devam etmek ister misiniz?\n" +
                " Sirasiyla her iki oyuncunun cevap vermesi gerklidir.");
        String oyuncu1Cvp=scan.next();
        String oyuncu2Cvp=scan.next();

        if (oyuncu1Cvp.substring(0,1).equalsIgnoreCase("e") && oyuncu2Cvp.substring(0,1).equalsIgnoreCase("e")){

            System.out.println("Lutfen "+ ilkKelime+ " 'ye eklemek icin bir harf giriniz.");
            String eklenecekHarf=scan.next();
            System.out.println("Girmis oldugunuz harf kelimenin neresine eklensin? Basina mi, Sonuna mi?");
            String harfYonu=scan.next();

            if (harfYonu.substring(0,1).equalsIgnoreCase("b")){
                ilkKelime=eklenecekHarf+ilkKelime;
            }else {
                ilkKelime=ilkKelime+eklenecekHarf;
                oyun(ilkKelime);
            }



        }else {

            System.out.println("!!! Game Finished !!!");
            if (puan1>puan2){
                System.out.println("Oyuncu1 kazanmnistir pauni : "+ puan1);
            }else {
                System.out.println("Oyuncu2 kazanmistir puani : " +puan2);
            }

        }
    }
}
