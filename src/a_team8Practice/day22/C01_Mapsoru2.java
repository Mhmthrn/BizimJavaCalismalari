package a_team8Practice.day22;

import java.util.HashMap;
import java.util.Map;

public class C01_Mapsoru2 {
    /*
    Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
    bulunmaktadır. Ürünler arasında " Laptop " olup olmadığını kontrol etmek için kodu
    yazınız.


    product.put("Laptop", 12);
    product.put("TV", 53);
    product.put("Refrigerator", 12);
    product.put("Music System", 87)
     */

    public static void main(String[] args) {
        Map<String,Integer> envanterMap=new HashMap<>();

        envanterMap.put("Laptop", 12);
        envanterMap.put("TV", 53);
        envanterMap.put("Refrigerator", 12);
        envanterMap.put("Music System", 87);

        System.out.println(envanterMap.containsKey("Laptop"));//true
    }
}
