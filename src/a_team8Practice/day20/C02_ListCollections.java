package a_team8Practice.day20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class C02_ListCollections {
    public static void main(String[] args) {
        // index numarasi girerek deger atayabiliriz.
        ArrayList country=new ArrayList<>();
        country.add("Ankara");
        country.add("Siirt");
        country.add("Bolu");
        country.add("Ankara");
        country.add(0,"Istanbul");
        country.remove(1);
        Iterator itr=country.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

       // country.forEach(i-> System.out.println(i+" "));

        //LinkedList<E>
        LinkedList list=new LinkedList<>();
        list.add("Armut");
        list.add("Cilek");
        list.add("Kavun");
        list.add(1,"Karpuz");

        list.forEach(i-> System.out.println(i+""));

        //Vector<E>
        /*
        tekra eden degerleri turmamizi ssaglar
        sira bilgisine gore yazdirir. birden fazla null atamaya izin verir.
        varsayilan bi rvektor olusturuldugunda kapasite 10 olark tanimlanir.
         */
        Vector v=new Vector<>();
        v.add("Armut");
        v.add("kiraz");
        v.add("cilek");
        v.add("kavun");
        v.add("elma");
        v.add("elma");
        v.add("elma");
        v.add("elma");
        v.add("elma");
        v.add("nar");
        v.add("nar");
        v.add("nar");

        System.out.println("Boyut : "+ v.size());//12
        System.out.println("Kapasite"+v.capacity());//20

        v.remove(1);
        System.out.println(v.firstElement());//Armut


    }
}
