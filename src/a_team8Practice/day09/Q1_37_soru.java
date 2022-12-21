package a_team8Practice.day09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Q1_37_soru {
    /*
    ENG:
        Write a method that returns a new array by eliminating the duplicate values in the array using the following method header
        Write a test program that reads in ten integers, invokes the method, and displays the result.
        (Tekrarlananları çıkar)
        TÜR:
        Tekrarlanan kayıtların çıkarıldığı yeni bir dizi döndüren aşağıdaki başlıga sahip bir metot yazınız.
        On tane tamsayı alan ve bu metodu çağırarak sonucu gösteren bir test programı yazınız.
        ---->>>
        public static int[] eliminateDuplicates(int[] list)
        ÖRNEK:
        On sayi giriniz:
        1 2 3 2 1 6 3 4 5 2
        ÇIKTI:
        Birbirinden farkli girilen sayilar: 1 2 3 6 4 5
     */
    public static void main(String[] args) {

        int [] sayilar={1,4,2,5,4,8,5,1,2,3};



        System.out.println("Birbirinden farkli girilen sayilar : "+tekrarlariSil(sayilar));
    }

    private static List<Integer> tekrarlariSil(int[] sayilar) {

        List<Integer> tekrarsizListe=new ArrayList<>();

        for (int each:sayilar){

            if (!tekrarsizListe.contains(each)){

                tekrarsizListe.add(each);
            }
        }

        return tekrarsizListe;
    }
}
