package a_team8Practice.day22;

import java.util.Arrays;
import java.util.Collection;
import java.util.TreeMap;

public class C02_MapSoru {
    /*
    Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
    bulunmaktadır. Ürün sayılarını artan sırada yazdırınız.
    Map<String, Integer> product = new HashMap<>();
    product.put("Laptop", 82);
    product.put("TV", 53);
    product.put("Refrigerator", 12);
    product.put("Music System", 87);
    product.put("Mobile Phone", 53);
     */
    public static void main(String[] args) {
        TreeMap<String, Integer> product = new TreeMap<>();
        product.put("Laptop", 82);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);
        product.put("Mobile Phone", 53);
        product.put(" Phone", 58);
        product.put("Mobile cihaz", 3);
        product.put("Mobile elekt", 3);

        Collection<Integer> value= product.values();

        int [] urunSayilari=new int[product.size()];
        int a=0;
        for (Integer each :value){
            urunSayilari[a]=each;
            a++;
        }

        Arrays.sort(urunSayilari);

        System.out.println(Arrays.toString(urunSayilari));//[12, 53, 53, 82, 87]








        //[82, 53, 87, 12, 53]
    }
}
