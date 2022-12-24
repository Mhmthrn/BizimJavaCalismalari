package a_team8Practice.day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q01_Sample_Q_30 {
    public static void main(String[] args) {
        /*Soru 30-)
        Bir Stringdeki yinelenen karakterleri Array String olarak döndüren bir kod yazın.
        ( mülakat sorusu )
        Örnek:
        String str="Javacokkolay"
        Yinelenen karakterler : [a, o, k]
        İpucu: İçiçe for looplar, String Manupulations ve ifler kullanrak çözebilrsiniz.
        Stringdeki bir harfi Stringde bulunan diger harfler ile karşılaştırıp konteynıra atacaksınız
        bu yüzden iç içe loop kullanmak mantıklı duruyor
        */

        String str="ahmetkarmehmetmahmut";

        List<String> tekraedenElementler= new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {

                if (str.substring(i, i + 1).equals(str.substring(j, j + 1))) {

                    if (!tekraedenElementler.contains(str.substring(j, j + 1))){

                        tekraedenElementler.add(str.substring(j, j + 1));

                    }


                }
            }
        }
        System.out.println(tekraedenElementler);


        }

    }

