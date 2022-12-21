package a_team8Practice.day09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q2_36_soru {
    /*
     Soru 36-)
        Verilen bir Array dizisindeki ortadaki degeri döndüren bir kod/method yazın. ( Yapabilirseniz Dinamik kod yazmaya çalışın, Arrayin uzunlugu degişse de ortadaki elemanı getirsin)
        Örnek:
        inputarr[]=   {1,2,3,4,5,6,7}
        output:         4
        İpucu:  Arrayin indexini hesaplayarak bulabilirsiniz. Kendinizi geliştirme adına sorunun cevabını degişik yollardan yapabilir, Arrayi kullanıcıya oluşturabilirsiniz (Öneri..)
        ------------------------------------------------------------------------------------------------------------------
     */
    public static void main(String[] args) {

        ortaDegeriDondur();

    }

    private static void ortaDegeriDondur() {
        List<String> sayilar=new ArrayList<>();
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir array dizisi yaziniz, ekleme islemi bittikten sonra Q ya basiniz.\n" +
                "sonuc olarak size girdiginiz dizedeki orta eleman dondurulecektir.");

       String girilenSayi="";
       while (!girilenSayi.equalsIgnoreCase("q")){

           girilenSayi=scan.nextLine();

           sayilar.add(girilenSayi);
       }

        System.out.println("Dizinin ortsindaki element : "+sayilar.get((sayilar.size()/2-1)));


       }




    }

