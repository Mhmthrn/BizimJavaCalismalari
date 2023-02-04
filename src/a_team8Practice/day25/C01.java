package a_team8Practice.day25;

import java.util.Arrays;

public class C01 {
    /*
    String str1=" Today  4 november  weather is sunny and 72 degree. It is a perfect day to practice java";
     */
    public static void main(String[] args) {
        String str1="Today weather is sunny and 155 degree. It is a perfect day to practice java";

        String fahrenheit=str1.replaceAll("\\D","");

        //(30°C x 1.8) + 32 = 86°F’

         int fahrenheit1= Integer.parseInt(fahrenheit);


         double derece = (fahrenheit1-32)/1.8;

        System.out.println("Donusumu istenilen : "+fahrenheit1+"F"+" Derece karsiligi : "+derece);


        //////////////////////////////////////////////////////////////////////////////
        int[] numaralar = {45, 20, 100, 23, -5, 2, -6};

        int [] yeniArr = new int[numaralar.length];

        Arrays.sort(numaralar);
        System.out.println(Arrays.toString(numaralar));//[-6,-5,2,20,23,45,100]

        int uzunluk =numaralar.length;


        for (int i = 0; i<=numaralar.length-1 ; i++) {
            yeniArr [i]=numaralar[uzunluk-1];
            uzunluk--;

        }
        yeniArr[yeniArr.length-1]=-1;


        System.out.println(Arrays.toString(yeniArr));


    }
}
