package a_team8Practice.day17;

import java.util.Scanner;



public class Q01 {
    /*
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
     "Game Finished" yazdırın. Puanları ve kazananı ekrana yazdırın.

     */
    static Scanner scan=new Scanner(System.in);
    static String ouyuncu1="";
    static String ouyuncu2="";
    static int oyuncu1Puan=0;
    static int oyuncu2Puan=0;


    public static void main(String[] args) {
        System.out.println("Oyunu baslatmak icin lutfen bir kelime giriniz.");
        String ilkKelime=scan.next();
        oyun(ilkKelime);

    }

    public static void oyun(String ilkKelime) {

        System.out.println("Girilen kelime "+ ilkKelime+ " dir kelimeyi onayliyor musuz?\n" +
                            "Cevabinizi evet veya hayir seklinde giriniz.");
        String oyuncu2Cvp=scan.next();

       boolean flag=true;
       while (flag){

           if (oyuncu2Cvp.substring(0,1).equalsIgnoreCase("e")){

               oyuncu1Puan+=ilkKelime.length();
               ucuncuAdim(ilkKelime);

           }else {

               System.out.println("Geçersiz kelime, oyuncu 2 oyunu kazandı");
               flag=false;
           }
       }




    }

    public static void ucuncuAdim(String ilkKelime) {
        System.out.println("Oyuna devam etmek istermisiniz?\n" +
                            "Oyunculardan her biri cevap vermelidir.");
        String oyuncu2cvp=scan.next();
        String oyuncu1cvp=scan.next();

        if (oyuncu2cvp.substring(0,1).equalsIgnoreCase("e") && oyuncu1cvp.substring(0,1).equalsIgnoreCase("e") ){
            System.out.println("Lutfen kelimeye eklemek istediniz harfi giriniz");
            String harf=scan.next();
            System.out.println("Sectiniz har kelimenin neresine eklensin? Bas veya Son");
            String harfYonu=scan.next();

            if (harfYonu.substring(0,1).equalsIgnoreCase("b")){

                ilkKelime=harf+ilkKelime;
            }else{
                ilkKelime+=harf;
                oyun(ilkKelime);
            }





        }else {
            if (oyuncu1Puan>oyuncu2Puan){
                System.out.println("Game Finished oyuncu bir kazandi.\n" +
                                    "oyuncu1 : " +oyuncu1Puan+ "oyuncu2 : "+ oyuncu2Puan);

            }else if(oyuncu2Puan>oyuncu1Puan){
                System.out.println("Game Finished oyuncu iki kazandi.\n" +
                        "oyuncu1 : " +oyuncu1Puan+ "oyuncu2 : "+ oyuncu2Puan);

            }else{
                System.out.println("Dostlul Kazandi. Berabere");
            }

        }




    }


}
