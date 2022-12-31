package a_team8Practice.day15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_Soru_1 {
    /*
     Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program
        yazınız. Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir
        method yazınız. Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını
        gösteren bir method yazınız. Ayrıca bakkalın hangi günler ortalamanın altında
         kazandığını gösteren bir method yazınız.

         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
           2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
           3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
           4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.

           5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun. for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır ortalama
                     kazançtan yüksekse o günleri return yap.
           6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun. for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
                     ortalama kazançtan aşağıysa o günleri return yap.
        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
        -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
     */
    static Scanner scan=new Scanner(System.in);

    static double ortalama=0;
    public static void main(String[] args) {
        List<String> gunler=new ArrayList<>();
        gunler.add("Pazartesi");
        gunler.add("Sali");
        gunler.add("Carsamba");
        gunler.add("Persembe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("Pazar");

        List<Double> gunlukKazanclar=new ArrayList<>();

        int count=0;

        while (count!=7){
            System.out.println("Lutfen "+ gunler.get(count)+ " gunu icin toplam kazancinizi giriniz");
            Double girilenKazanc=scan.nextDouble();

            gunlukKazanclar.add(girilenKazanc);
            count++;

        }

        getOrtalamaKazanc(gunlukKazanclar);

        getOrtalamaninUstundeKazancGunleri(gunlukKazanclar, gunler);

       getOrtalamaninAltindaKazancGunleri(gunlukKazanclar, gunler);


    }

    private static void getOrtalamaninAltindaKazancGunleri(List<Double> gunlukKazanclar, List<String> gunler) {
        List<String> ortlamaninAltindakiGunler=new ArrayList<>();

        for (int i = 0; i < gunlukKazanclar.size(); i++) {

            if (gunlukKazanclar.get(i)<ortalama){

                ortlamaninAltindakiGunler.add(gunler.get(i));
            }

        }
        System.out.println("Ortalamnin altindaki kazanc gunleri ==> "+ortlamaninAltindakiGunler);
    }

    public static void getOrtalamaninUstundeKazancGunleri(List<Double> gunlukKazanclar, List<String> gunler) {

        List<String> ortlamaninUstundekiGunler=new ArrayList<>();

        for (int i = 0; i < gunlukKazanclar.size(); i++) {

            if (gunlukKazanclar.get(i)>ortalama){

                ortlamaninUstundekiGunler.add(gunler.get(i));
            }

        }
        System.out.println("Ortalamnin ustundeki kazanc gunleri ==> "+ortlamaninUstundekiGunler);

    }

    public static void getOrtalamaKazanc(List<Double> gunlukKazanclar) {
        double toplam=0;

        for (Double each : gunlukKazanclar) {

            toplam += each;
        }

         ortalama=toplam/7;

        System.out.println("Bu haftaki kazanilan toplam para "+ toplam +" Tl olup ortlamasi : "+ ortalama);
    }
}
