package a_team8Practice.day17;

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

        int[] arr1={4,6,8,5,3,2};


        int[] arr2={8,7,10,3,9,5};

        mountainArrMi(arr1);
    }

    private static void mountainArrMi(int[] arr1) {

        int enBuyukeleman=arr1[0];
        int enBuyukelemanIndex=0;


        for (int i = 0; i <arr1.length ; i++) {

            if (arr1[i]>enBuyukeleman){

                enBuyukelemanIndex=i;
                enBuyukeleman=arr1[i];

            }
        }

        int count=0;
        for (int i = 0; i < enBuyukelemanIndex; i++) {

            if (arr1[i]<arr1[i+1]) {
                count++;
                continue;
            }



        }
        int count2=0;
        for (int j =enBuyukelemanIndex+1; j <arr1.length-1 ; j++) {

            if (arr1[j]>arr1[j+1]) {
                count2++;

            }
        }
            System.out.println(count);
            System.out.println(count2);

        if (count2==0 && count==0){
            System.out.println("Mountain array degildir");
        }else if ((count>=0 || count2==0) || (count2>=0 || count==0)){
            System.out.println("Mountain array degildir");
        }else {
            System.out.println("Girilen array mountain dir.");
        }

        }

    }

