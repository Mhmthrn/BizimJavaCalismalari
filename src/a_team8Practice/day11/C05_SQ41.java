package a_team8Practice.day11;

import java.util.ArrayList;
import java.util.List;

public class C05_SQ41 {
    /*
    Soru 41-)
    Parametre olarak 2 Int Array kabul eden ve 2 Array listesini yeni bir Arraye ekleyen ve yazdıran bir method yazın.
		 * Input1={1,2,3,4}
		 * Input2={5,6}
		 * Çıktı={1,2,3,4,5,6}
     */
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5,6};
        int [] arr2= {1,2,3,4,5};

        birlestir(arr1,arr2);
    }

    public static void birlestir(int[] arr1, int[] arr2) {
        List<Integer> birlesik=new ArrayList<>();



        for (int i = 0; i < arr1.length; i++) {

            birlesik.add(arr1[i]);

        }

        for (int i = 0; i < arr2.length; i++) {

                birlesik.add(arr2 [i]);

        }

        System.out.println(birlesik);

    }
}
