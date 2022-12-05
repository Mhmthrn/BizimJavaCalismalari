package a_team8Practice.day04;

import java.util.Scanner;
import java.util.SortedMap;

public class Q4_SampleQuestions_17 {
    /*
    Soru 17-)
    Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
    ardından isimde karakterin kaç kez tekrarlandığını kontrol edelim.
    Örnek:

    char ch1=            'a'
    String name =     "Ali bakkala geç gitti."
    Beklenen Çıktı=    a sayısı = 3
    Ipucu:
    Loop döngülerini hatırlayalım. While döngüsü kullanabilirsiniz!
    Sayac adlı bir int variable oluşturarak bunun ile kelimenin kaç
    defa geçtigini Loop içindeki İf ile bulabilirsiniz!
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scan.nextLine();
        char krk = scan.next().charAt(0);

        int sayac = 0;
        boolean flag = true;

        for (int i = 0; i < cumle.length(); i++) {
            if ((cumle.charAt(i) == krk)) {
                sayac++;
                flag = true;
            } else {
                flag = false;
            }
        }
        if (!flag ) {
            System.out.println("Girilen harf girilen cumlede bulunmamaktadir.");
        } else {
            System.out.println(krk + " karakteri : " + sayac + " adet bulunmaktadir");

        }
    }
}
