package a_team8Practice.day04;

import java.util.Scanner;

public class Q2_SampleQuestions_11 {
    /*
    Soru 11-) Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup bunları özel forma dönüştürün.
                 Ad ve soyadın baş harfleri büyük olmalıdır

                 Kredi kartı numarasını kontrol edin, 16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.

                 Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.

	Ipucu: IF ile çözebilirsiniz. Baş harfleri alın gerisi zaten * işareti ;-)
    Giriş :
		 > Gandalf Grey 563245879632
    Çıktı :
    > İsim : G****** G***
    > CCN : **** **** 9632 (edited)
     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim=scan.nextLine();
        System.out.println("Lutfen kart numaranizi giriniz");
        String kartNo=scan.nextLine();

       String yeniIsim = isim.substring(0,1).toUpperCase()+ isim.replaceAll("\\w","*");

       String yeniSoyisim = soyisim.substring(0,1).toUpperCase()+ soyisim.replaceAll("\\w","*");
       //CCN : **** **** 9632 (edited)

       if (kartNo.length()!=16){
           System.out.println("Geçersiz kredi kartı numarası");

       }else {

           System.out.println("Isim :"+ yeniIsim+" "+yeniSoyisim+"\n" +
                   "Kart No :"+" "+kartNo.substring(0,12).replaceAll("\\d","*")+ kartNo.substring(12) );
       }

    }
}
