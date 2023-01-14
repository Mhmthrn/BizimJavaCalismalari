package a_team8Practice.day23;

import java.util.*;

public class C01_Iterotor {
    public static void main(String[] args) {

        Collection<Integer> sayilar=new ArrayList<>();

        sayilar.add(11);
        sayilar.add(8);
        sayilar.add(10);
        sayilar.add(6);

        Iterator itr=sayilar.iterator();

        while (itr.hasNext()){


            if (itr.next().equals(10)){

                System.out.println(itr.next().toString());

            }
        }



    }
}
