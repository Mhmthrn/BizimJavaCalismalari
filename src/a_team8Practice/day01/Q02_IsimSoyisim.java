package a_team8Practice.day01;

public class Q02_IsimSoyisim {
    /*
    Kullanicidan isim ve soyismini ayri ayri alin.

    - ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
    yazdirin


    - soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
    harflerle yazdirin.

     */
    public static void main(String[] args) {

        String isim="muzafFER";

        String soyisim="DENiz";

        String yeniIsimSoyisim="";

       // ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
       // yazdirin

        if (isim.length()>soyisim.length()){

            System.out.println((isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase())+" "
                    + (soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase()));


        }else {//- soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin.
            yeniIsimSoyisim=(isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()+" "
                             +soyisim.toUpperCase());
            System.out.println("Yeni hali "+yeniIsimSoyisim);

        }


    }
}

