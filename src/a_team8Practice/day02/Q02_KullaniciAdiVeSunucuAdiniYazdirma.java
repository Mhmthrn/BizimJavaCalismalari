package a_team8Practice.day02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q02_KullaniciAdiVeSunucuAdiniYazdirma {

    /*
    bir e-mail adresindeki kullanıcı adını ve sunucu adını ekrana yazdırin.
    e-mail adresi örneği: yilmazkarakas@gmail.com
    ekrana:
    kullaniciadi: yilmazkarakas
    sunucu: gmail yazacak.

     */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen email adresinizi giriniz ");
        String email=scan.nextLine();// yilmazkarakas@gmail.com


        int  atIndex= email.length()-10;
        int nokta=email.length()-4;

        System.out.println("kullaniciadi : "+ email.substring(0,atIndex)+"\n"+

                            "sunucu : "+ email.substring(atIndex+1,nokta)
                          );










    }

}
