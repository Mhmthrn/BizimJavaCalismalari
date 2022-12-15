package a_team8Practice.day05;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.SortedMap;

import static a_team8Practice.day05.C10_ArrayeBirElemetEkleme.arreyeElementEkleme;

public class Q2_Odev {
  static final   Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        /*
        Kullanicidan yeni ismler alip var olan bir array ye ekleyen bir method olusturun.

        Kullanici yeni deger verdigi muddetceeklemeye devam edin
        kullanici q bastiginda arr nin son halini dondurun.
         */


        String [] arr = {"ali", "veli"};

       yeniElemanEkleme(arr);

        System.out.println(Arrays.toString(arr));


    }

    public static String[] yeniElemanEkleme(String[] arr){

        String eklenecekIsim="";


        while (!eklenecekIsim.equalsIgnoreCase("q")){
           System.out.println("Lutfen Array'ye eklemek istediginz ismi giriniz" + "\n" +
                   "Ekleme islemi bittikten sonra Q'ya basiniz");
            eklenecekIsim=scan.nextLine();

           if (eklenecekIsim.equalsIgnoreCase("q")){
               break;

           }else {
               String [] temp=new String[arr.length+1];

               for (int i = 0; i <arr.length ; i++) {

                   temp[i]=arr[i];

                   temp[temp.length-1]=eklenecekIsim;
               }
               arr=temp;

           }
       }

       return arr;



       }


    }





