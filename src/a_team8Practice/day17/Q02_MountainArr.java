package a_team8Practice.day17;

import java.util.Arrays;

public class Q02_MountainArr {
    /*
        Verilen herhangi bir arrayin Mountain Array olup olmadığını kontrol etmek için bir kod
        yazınız.
        Not:
        Mountain Array ==> [0, 2, 5, 3, 1]
        Bir array elemanları en büyük değerine kadar sürekli artan, en büyük değerinden sonra
         sürekli azalan değer alıyorsa Mauntain Array' dir.

        Mountain Array Değil ==> [5, 2, 7, 1, 4]
        Bir array elemanları en büyük değerine kadar sürekli azalan, en büyük değerinden sonra
         sürekli artan değer alıyorsa Mauntain Array değildir.
     */
    public static void main(String[] args) {

        int[] arr1={4,6,8,5,3,2,1};


        int[] arr2={8,7,10,3,9,5};

        mountainArrMi(arr1);
        mountainArrMi(arr2);
    }

    private static void mountainArrMi(int[] arr1) {

        int enBuyukeleman=0;
        int enBuyukelemanIndex=0;


        for (int i = 0; i <arr1.length ; i++) {

            if (arr1[i]>enBuyukeleman){

                enBuyukelemanIndex=i;
                enBuyukeleman=arr1[i];
            }
        }

        boolean kontrol=true;

        for (int i = enBuyukelemanIndex; i <arr1.length -1; i++) {
            if (arr1[i]> arr1[i+1]){
                continue;
            }else {
                kontrol=false;
                break;
            }

        }

        if (kontrol){

            for (int j =enBuyukelemanIndex; j>0 ; j--) {

                if (arr1[j]>arr1[j-1]) {
                    continue;

                }else {
                    kontrol=false;
                    break;
                }
            }


        }



        if (kontrol) {
            System.out.println(Arrays.toString(arr1) + " arrayi mountain arraydir");
        } else {
            System.out.println(Arrays.toString(arr1) + " arrayi mountain array değildir");
        }

    }

}

