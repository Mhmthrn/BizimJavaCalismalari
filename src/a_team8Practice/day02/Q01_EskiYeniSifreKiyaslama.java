package a_team8Practice.day02;

import java.util.Scanner;

public class Q01_EskiYeniSifreKiyaslama {
    /*
    String tipinde sabit bir şifre değişkeni oluşturun.
    Örneğin: String password = “12345”; gibi.
    Ardından, kullanıcıdan klavyeden bir şifre girmesini isteyin
    .
    Girilen şifre ile değişkende tuttuğunuz değeri kıyaslayın.
    Eğer, iki değer birbirine eşitse ekrana “Giriş Başarılı!”, değilse “Giriş Başarısız” yazdırın.
     */
    public static void main(String[] args) {

        String sifre="20221514";
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");
        String girilenSifre=scan.nextLine();

        if (sifre.equals(girilenSifre)){
            System.out.println("Giris Basarili");

        }else {
            System.out.println("Giris Basarisiz");

        }




    }
}
