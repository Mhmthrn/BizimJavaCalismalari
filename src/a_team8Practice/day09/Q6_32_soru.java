package a_team8Practice.day09;

import java.util.Arrays;
import java.util.Scanner;

public class Q6_32_soru {
    /*
     Soru 32-)
        Kullanıcıdan alacagınız bilgilerle oluşturdugunuz bir Integer Array dizesini Reverse olarak (tersten) yazdırınız.
        İpucu:  int arrReverse[] diye bir array oluşturun ve kullancıya oluşturdugunuz arrayi buna tersten assign edin...
        ------------------------------------------------------------------------------------------------------------------
     */
   static Scanner scan= new Scanner(System.in);

    public static void main(String[] args) {


        arrreverseYap();
    }

    private static void arrreverseYap() {
        System.out.println("Kac elemanli bir Array olusturmak istiyorsunuz?");
        int elemanSaysi=scan.nextInt();

        int [] arr=new int[elemanSaysi];
        int [] reverseArr=new int[arr.length];

        for (int i =0; i < arr.length ; i++) {
            System.out.println("Lutfen eklemek istediginiz elementleri giriniz");
            int eklenecekSayi=scan.nextInt();

            arr[i]+=eklenecekSayi;

            reverseArr[(arr.length-1-i)]= arr[i];

        }

        System.out.println("Olusturlan Array : "+Arrays.toString(arr));

        System.out.println("Olusturulan Arrayin reverse edilmis hali : "+Arrays.toString(reverseArr));

    }
}
