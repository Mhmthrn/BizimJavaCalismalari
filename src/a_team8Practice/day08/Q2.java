package a_team8Practice.day08;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        /*
        Soru 5- Verilen 2 katli bir array’de her bir inner array’in son elementlerinin
toplaminini yazdiran bir method olusturun
         */
        int [][]arr={{1,2,3},{4,5},{7,8,9,8}};

        sonElementTopla(arr);

    }
    public static void sonElementTopla(int [] [] arr){

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            toplam+=arr[i][arr[i].length-1];

        }
        System.out.println("son Elementler Toplam : "+toplam);

        System.out.println("/*/**/*/*/*/*/*/*/*/*/*/*/*/*/*/");

        toplam=0;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) { // int [][]arr={{1,2,3},{4,5},{7,8,9,8}};

                toplam+=arr[i][j];



            }

        }
        System.out.println("Tum Elementler Toplam : "+ toplam);


    }
}
