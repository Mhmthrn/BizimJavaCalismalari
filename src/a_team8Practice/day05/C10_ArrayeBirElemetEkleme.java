package a_team8Practice.day05;

import java.util.Arrays;

public class C10_ArrayeBirElemetEkleme {
    public static void main(String[] args) {

        /*
        Soru 7- Verilen bir array’e istenen bir elemani
        ekleyip bize donduren bir method yazin, eski array’e yeni degeri atayin.
         */
        String [] isimler={"Ali","Veli", "Cem"};

        String eklenecekIsim="Kemal";

        isimler=arreyeElementEkleme(isimler,eklenecekIsim);

        System.out.println(Arrays.toString(isimler));// [Ali, Veli, Cem, Kemal]

    }
    public static String [] arreyeElementEkleme(String [] str, String eklenecekisim){

        String [] temp=new String[str.length+1];

        for (int i = 0; i <str.length ; i++) {

            temp[i]=str[i];

            temp[temp.length-1]=eklenecekisim;




        }

        return temp;



    }
}
