package a_team8Practice.day10;

import java.util.Arrays;

public class Q03_Sample_35 {
    /* Soru 35-)
    Parametre olarak bir isim kabul eden ve ismi bir char Array dizisi olarak yazdıran bir method Return edin.
            --> toCharArray() yöntemini kullanmayın
    Örnek:
    String isim:    Yakup
    char arr[]:     [Y,a,k,u,p]
    İpucu: Bir method içerisinde Array oluşturun ve aldıgınız ismi methoda gönderin. Bu ismi parçalayarak,
    her bir harfi, Arraye yerleştirin

    */
    public static void main(String[] args) {
        String isim = "Burhan";

        arrayOlarakyazdir(isim);
    }

    private static void arrayOlarakyazdir(String isim) {

        String [] isimArr= isim.split("");

        char [] charArr=new char[isimArr.length];

        for (int i = 0; i <isimArr.length ; i++) {

            charArr[i]= isimArr[i].charAt(0);
        }

        System.out.println(Arrays.toString(charArr));


    }


}
