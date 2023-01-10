package a_team8Practice.day21;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class C06_SetSoru {
    /*
    Bir String’ de kullanılan farklı karakterleri yazdırmak için kod yazınız.
    Örnek: ‘Mississippi’ ´ Misp

     */
    public static void main(String[] args) {

        String isim="Canakkale";

       List<String> arr = List.of(isim.split(""));

        Set<String> farkliKrk=new TreeSet<>(arr);

        System.out.println(farkliKrk);

    }
}
