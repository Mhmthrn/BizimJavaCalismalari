package a_team8Practice.day06;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        /*
         Soru 19-)
            Kullanıcıdan doğum tarihini alınız. Burcunu hesaplayan bir method yazınız.

            ipucu:
            Switch Case kullanabilirsiniz. Veya Method yazarak Method aracılıgı ile de yapabilirsiniz.
         */
        int gun=0;
        String ay="";

        burcHesapla(gun,ay);


    }
    public static void burcHesapla(int gun,String ay){

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen Dogum Tarihinizin gununu");
        gun=scan.nextInt();

        System.out.println("lutfen dogdugunuz ayi giriniz");
        ay=scan.next();
        ay.toLowerCase();

        String burc="";

        switch (ay){

            case "ocak": burc= gun>=21 ? "Kova":"Oglak";
            break;
            case "subat": burc= gun>=21 ? "Balik": "Kova";
            break;
            case  "mart": burc= gun>=21 ? "Koc *":"Balik";
            break;
            case  "nisan": burc=gun>=21 ? "Boga": "Koc";
            break;
            case  "mayis": burc=gun>=21 ? "Ikizler *":"Boga";
            break;
            case  "haziran": burc=gun>=21 ? "Yengec *": "Ikizler";
            break;
            case "temmuz" : burc=gun>=21? "Aslan":"Yengec";
            break;
            case "agustos": burc=gun>=21 ?"Basak *":"Aslan";
            break;
            case "eylul" :




        }
        System.out.println("Hayirli olsun burcunuz : "+burc);

    }
}
