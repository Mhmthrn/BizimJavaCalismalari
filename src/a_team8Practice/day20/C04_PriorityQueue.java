package a_team8Practice.day20;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C04_PriorityQueue {
    //-element() Kuyrugun basindaki ogeyi veriri ama  onu kuyruktan atmaz
    // -offer(E o) mumkunse verilen ogeyi kuyruga ekler.
    // -peek ()Kuyrugun basindaki ogeyi veri ve kuyruktan atmaz. Kuyruk bos ise null verir.
    // -pool ()Kuyrugun basindaki ogeyi veri ve kuyruktan ATAR. Kuyruk bos ise null verir.
    // -remove () kuyrugun basimdaki ogeyi verir ve onu kuyruktan atar.
    public static void main(String[] args) {
        PriorityQueue q= new PriorityQueue<>();

        q.add(80);
        q.add(20);
        q.add(10);
        q.add(50);

        while (!q.isEmpty()){
            System.out.println(q.poll());
        }


    }
}
