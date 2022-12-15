package a_team8Practice.day07;

import java.util.Scanner;

public class C00_SampleQuetions {
    /*

            ----------------------------------------------------------------------------------------------------------------------------------------------------------------

            ----------------------------------------------------------------------------------------------------------------------------------------------------------------
    Soru 20-)
            Kullanıcıdan bir isim yazmasını isteyin, İsim uzunluğu 3 olmalıdır. Daha sonra ismin aynı karakterlere sahip olup olmadığını kontrol edin.
            Dize aynı karakterlere sahipse:  "Dizede yinelenen karakterler var" ; aynı karakterlere sahip degilse  "String benzersiz karakterlere sahip"
            yazdırın. İsim 3 karakterden uzunsa "Bu kadar uzun cümleyi anlayamam ben agam" yazdırın.

                            Örnek:
                            giriş: ama
            		çıkış: Dizede yinelenen karakterler var

                            İpucu: İf Else ve Char kullanarak çözebiliriz.
            ----------------------------------------------------------------------------------------------------------------------------------------------------------------

            ----------------------------------------------------------------------------------------------------------------------------------------------------------------

            ----------------------------------------------------------------------------------------------------------------------------------------------------------------
   Soru 23-)
            Girdi olarak bir tamsayı kabul eden ve bu tam sayının faktöriyelini hesaplayan bir method yazın. Method bize çıktıyı döndürsün.
            Örnek:
            Girdi: 6
            Çıktı: 6!=65432*1=720
            ipucu: Aldıgınız sayıyı methoda gönderin. Methodun içinde For Loop ile faktöriyelini hesaplayın.
            ----------------------------------------------------------------------------------------------------------------------------------------------------------------
   Soru 24-)
            20'den 0'a kadar çift sayıları yazdırın ancak decrement (i--) kullanmayın.
            Örnek:
            100'den 0'a kadar Çift Sayılar şunlardır: 20 18 16 14 12 10 8 6 4 2 0
            ipucu:
            Loop içinde if kullanarak çözebilirsiniz. % kullanmak iyi bir fikir olabilir :wink:
            ----------------------------------------------------------------------------------------------------------------------------------------------------------------
   Soru 25-)
            Alfabeyi konsola yazdırın.
            örnek:
            a b c .. .. .. .. y z
            ipucu: char kullanmak iyi bir fikir olabilir :wink:
            ----------------------------------------------------------------------------------------------------------------------------------------------------------------

            ----------------------------------------------------------------------------------------------------------------------------------------------------------------
    Soru 27-) 'a' ile 'z' arasındaki karakterlerin ASCII değerlerini yazdıran bir Java programı yazın
            ipucu: For Loop ve Char kullanarak çözebilirsiniz.
            örnek:
            Ascii value of a = 97
            Ascii value of b = 98
            Ascii value of c = 99
            Ascii value of d = 100
     */
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        /*
        Soru 18-)
            Girilen araç hızı ve yol kilometresinden, gidilen yere varış süresini hesaplayan bir method yazalım.
            Kullanıcıya hızını ve kilometreyi soralım, bunu methoda gönderelim ve bize varış süremizi hesaplasın
            İpucu:
            yol=Hız*zaman
         */
       /* System.out.println("Varis zamaninizi hesaplayabilmeniz icin , hizinizi ve katettiginiz Km yaziniz");
        double hiz=scan.nextDouble();
        double km=scan.nextDouble();

        zamanHesaplama(hiz,km);*/

        /*Soru 22-)
        Kullanıcıdan 2 tamsayı girmesini isteyin, ardından GCD (En Büyük Ortak Bölen) ve
        LCM'yi bulun (En Küçük Ortak Kat)
        Giriş :
        30 ve 40

        Beklenen Çıktı:
        30 ve 40 için EBOB= 10
        30 ve 40 için EKOK= 120
        ipucu:
        Loopları kullanarak çözebiliriz. İki sayının EKOK'u sayıların çarpımının sayıların
        EBOB'una bölünerek bulunabilir.*/
        //EBOB(a, b) . EKOK(a, b) = a.b

        System.out.println("Lutfen EBOB'nu ve EKOK'unu hesaplamak istediginz iki tane tam sayi giriniz.");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        int EKOK=0;
        int EBOB=1;

        for (int i = 2; i <151 ; i++) {

            if (sayi1%i==0 && sayi2%i==0){

                EBOB=i;
            }
        }
        EKOK=(sayi1*sayi2)/EBOB;

        System.out.println(sayi1+ " ve "+sayi2+ " için EBOB = "+ EBOB);
        System.out.println(sayi1+ " ve "+sayi2+ " için EKOK = "+ EKOK);



    }
    public static void zamanHesaplama(double hiz, double km){

        double zaman=km/hiz;


        System.out.println("Varis Sureniz : "+zaman+" saat olarak hesaplanmistir");


    }

}
