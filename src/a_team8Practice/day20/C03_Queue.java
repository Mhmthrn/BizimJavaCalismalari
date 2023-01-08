package a_team8Practice.day20;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {
    //-element() Kuyrugun basindaki ogeyi veriri ama  onu kuyruktan atmaz
    // -offer(E o) mumkunse verilen ogeyi kuyruga ekler.
    // -peek ()Kuyrugun basindaki ogeyi veri ve kuyruktan atmaz. Kuyruk bos ise null verir.
    // -pool ()Kuyrugun basindaki ogeyi veri ve kuyruktan ATAR. Kuyruk bos ise null verir.
    // -remove () kuyrugun basimdaki ogeyi verir ve onu kuyruktan atar.
    public static void main(String[] args) {
        Queue q = new LinkedList();
        q.add("Deniz");
        q.add("mehmet");

        q.offer("Ali");
        q.offer("Damla");

        System.out.println("remove() : "+ q.remove());

        System.out.println("element () : "+ q.element());


        q.forEach(i-> System.out.println(i));


    }

}
