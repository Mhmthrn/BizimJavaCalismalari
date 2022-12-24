package a_team8Practice.day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Sample_37 {
    /*
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
        int [] sayilar={1, 2, 3, 2, 1 ,6, 3, 4 ,5 ,2};

        System.out.println("Birbirinden farkli girilen sayilar : "+tekrarEdenleriCikar(sayilar));


    }

    public static List<Integer>  tekrarEdenleriCikar(int[] sayilar) {

        List<Integer> tekrarsiz=new ArrayList<>();

        for (int each:sayilar){

            if (!tekrarsiz.contains(each)){

                tekrarsiz.add(each);
            }
        }

        return tekrarsiz;
    }

}
