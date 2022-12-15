package a_team8Practice.day07;

import java.util.Scanner;

public class Q2 {
    /*
    Soru 22-)
            Kullanıcıdan 2 tamsayı girmesini isteyin, ardından GCD (En Büyük Ortak Bölen) ve LCM'yi bulun (En Küçük Ortak Kat)
            Giriş :
            30 ve 40

            Beklenen Çıktı:
            30 ve 40 için EBOB= 10
            30 ve 40 için EKOK= 120
            ipucu:
            Loopları kullanarak çözebiliriz. İki sayının EKOK'u sayıların çarpımının sayıların EBOB'una bölünerek bulunabilir.
     */
    public static void main(String[] args) {
        int sayi1=30;
        int sayi2=40;

        int ebob=1;

        int buyukSayi=0;

        if (sayi1>sayi2){
            buyukSayi=sayi1;

        }else {
            buyukSayi=sayi2;
        }


        for (int i = 2; i <buyukSayi ; i++) {

            if (sayi1%i==0 && sayi2%i==0){
               ebob=i;

            }



        }
        int ekok=(sayi1*sayi2)/ebob;

        System.out.println(sayi1+" ve "+ sayi2+  " EBOB'u "+ ebob+ " EKOK'u"+ ekok);






    }
}
