package a_team8Practice.day11;

public class C04_sample_Questions {
    /*
     Soru-40)
        Bir diziyi (Array) parametre olarak kabul eden ve dizideki tüm elemanların toplamını döndüren
        bir method yazın ve ardından sonucu main methodda yazdırın.
        Örn:
        girdi : {1,2,3,4,5,6,7,8}
        çıkış: 36
        ıpucu: For Loop ile arrayin elemanlarını toplayın ve methodu yazdırarak döndürün

     */

    public static void main(String[] args) {
        int [] arr={4,5,8,7};

        toplam(arr);

    }

    public static void toplam(int[] arr) {

        int toplam=0;

        for (int each:arr) {

            toplam+=each;

        }
        System.out.println("Girilen dizideki elementlerin toplami : "+ toplam);

    }
}
