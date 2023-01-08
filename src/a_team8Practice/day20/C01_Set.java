package a_team8Practice.day20;

import java.util.*;

public class C01_Set {
    public static void main(String[] args) {

        /*
        hashset ler ayni data turu ve degerini kabul etmezler.
         */
        //HashSet<E>

        HashSet h= new HashSet<>();
        h.add("12");
        h.add(12);
        h.add(12.0);
        h.add(true);
        h.add(null);
        h.remove("12");
        System.out.println(h.size());//4

        System.out.println(h.contains(12));// true

        Iterator itr=h.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());

        }
        h.forEach(item-> System.out.println(item+" "));


        // LinkedHashSet<E>


        LinkedHashSet days=new LinkedHashSet<>();

        days.add("Pazartesi");
        days.add("Sali");
        days.add("Carsamba");
        days.add("Persembe");
        days.add("Cuma");
        days.add("Cumartesi");
        days.add("Pazar");
        days.remove("Carsamba");

        days.add("Pazartesi");

        days.forEach(item -> System.out.print(item+ " "));


        // TreeSet<E>
        TreeSet tree=new TreeSet<>();
        tree.add(10);
        tree.add(4);
        tree.add(5);
        tree.add(6);
        tree.add(67);

        try {
            tree.add(null);
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }

        tree.forEach(item-> System.out.println(item+ " "));


    }
}
