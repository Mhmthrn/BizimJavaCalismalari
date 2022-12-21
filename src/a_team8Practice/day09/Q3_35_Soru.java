package a_team8Practice.day09;

import java.util.Arrays;

public class Q3_35_Soru {
    /*
    Soru 35-)
        Parametre olarak bir isim kabul eden ve ismi bir char Array dizisi olarak yazdıran bir method Return edin.
        		--> toCharArray() yöntemini kullanmayın
        Örnek:
        		String isim:    Yakup
        		char arr[]:     [Y,a,k,u,p]
        İpucu: Bir method içerisinde Array oluşturun ve aldıgınız ismi methoda gönderin. Bu ismi parçalayarak, her bir harfi, Arraye yerleştirin

     */
    public static void main(String[] args) {

        String isim="Ahmet Mustafa";

        diziYazdir(isim);
    }

    private static void diziYazdir(String isim) {

        isim=isim.replace(" ","");

        String [] parca=isim.split("");

        System.out.println(Arrays.toString(parca));



    }
}
