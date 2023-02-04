package a_team8Practice.day24;

import java.util.Set;
import java.util.TreeSet;

public class C04_ {
    /*
    3) Bir String’ de kullanılan farklı karakterleri yazdırmak için kod yazınız.
        Örnek: ‘Mississippi’ ´ Misp
     */
    public static void main(String[] args) {
        String str="Missimssmipj kpi";
        farkliKarakterleriYazdir(str);
    }

    private static void farkliKarakterleriYazdir(String str) {

        Set<String> farkliKarakter= new TreeSet<>();

        for (int i = 0; i <str.length() ; i++) {
            farkliKarakter.add(str.substring(i,i+1));
        }
        System.out.println(farkliKarakter);
    }
}
