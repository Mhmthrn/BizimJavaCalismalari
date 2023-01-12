package a_team8Practice.day22;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class C00_MapSoru {
    /*
    1) Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
       bulunmaktadır. Toplam ürün sayısını bulmak için kodu yazınız

            ("Laptop", 12);
            ("TV", 53);
            ("Refrigerator", 12);
            ("Music System", 87)
     */
    public static void main(String[] args) {
        Map<String,Integer> envanterMap=new HashMap<>();

        envanterMap.put("Laptop", 12);
        envanterMap.put("TV", 53);
        envanterMap.put("Refrigerator", 12);
        envanterMap.put("Music System", 87);

        int toplamUrunSayisi=0;

        Collection<Integer> valueSet=envanterMap.values();

       for (Integer echValue:valueSet){

           toplamUrunSayisi+=echValue;
       }

        System.out.println("Toplam urun Sayisi: "+ toplamUrunSayisi+ " adettir.");




        }
    }

