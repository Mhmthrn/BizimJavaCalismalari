package a_team8Practice.day11;

import java.util.Arrays;

public class C03_sample_39 {
    /*
     Soru-39)
        Bir tamsayı dizisini (Int Array) girdi olarak kabul eden ve verilen bu (Arrayden) diziden minimum ve
         maksimum sayıları yazdıran bir yöntem yazın
        Örnek:
        Input : {3,2,5,4,1,6}
        Output :
        min: 1
        max: 6
        Ipucu: sort yöntemni kullanabilirsiniz.
     */
    public static void main(String[] args) {
        int [] arr={-1,-2,3,5,4,8,9,7,4,78,96,58,85};

        enBuyukEnKucuk(arr);
    }

    public static void enBuyukEnKucuk(int[] abc) {
       Arrays.sort(abc);
        System.out.println(Arrays.toString(abc));
        System.out.println("Minimum : "+abc [0]+"\n" +
                           "Maximum : "+ abc[(abc.length-1)]);



    }
}
