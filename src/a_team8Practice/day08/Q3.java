package a_team8Practice.day08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q3 {
   /* Soru 6- Kullanicidan pozitif bir tamsayi alip, o tamsayiyi tam bolebilen tum pozitif
    tamsayilari bir liste olarak bize donduren bir method olusturun*/
   public static void main(String[] args) {

       Scanner scan=new Scanner(System.in);
       System.out.println("Lutfen bir pozitif bir tam sayi giriniz");
       int girilenSayi=scan.nextInt();

       System.out.println(tamBolenSayilar(girilenSayi));


   }
   public static List<Integer> tamBolenSayilar(int sayi){

       List<Integer> sayilar=new ArrayList<>();

       for (int i = 1; i <= sayi; i++) {
           if (sayi%i==0){
               sayilar.add(i);
           }

       }
       return sayilar;
   }
}
