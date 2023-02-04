package a_team8Practice.day24;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C03_ {
    public static void main(String[] args) {

        Set<Integer> sayilar=new HashSet<>();
        sayilar.add(1);
        sayilar.add(9);
        sayilar.add(88);
        sayilar.add(54);
        sayilar.add(23);

        System.out.println(sayilar);

        System.out.println("_+_+_+_+_+_+_+_+_+_+_+");

        Set<Integer> rakamlar=new HashSet<>();
        rakamlar.add(1);
        rakamlar.add(3);
        rakamlar.add(9);
        System.out.println(rakamlar);

        System.out.println("_+_+_+_+_+_+_+_+_+_+_+_");

        sayilar.retainAll(rakamlar);

        System.out.println(sayilar);

    }
}
