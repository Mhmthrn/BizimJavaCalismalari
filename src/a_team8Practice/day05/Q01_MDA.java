package a_team8Practice.day05;

public class Q01_MDA {
    /*
    Soru 4- Verilen 2 katli bir array’de bulunan tum sayilarin carpinini bize donduren bir
    method olusturun.
     */
    public static void main(String[] args) {

        int [] [] arr={{1,2},{5,6},{7,4}};


        int elemetlerCarpimi=carpim(arr);

        System.out.println(elemetlerCarpimi);//1680

    }
    public static int carpim(int [][] abc){

        int carpim=1;



        for (int i = 0; i <abc.length ; i++) {
            for (int j = 0; j < abc[i].length; j++) {

                carpim *= abc[i][j];

            }
        }

        return carpim;
    }



}
