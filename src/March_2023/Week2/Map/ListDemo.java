package March_2023.Week2.Map;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list =new LinkedList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(null);
        list.add(12);
        list.add(8);


        System.out.println("Get :" + list.get(2));
        System.out.println("Index of " + list.indexOf(4));
        System.out.println(" last Index of " + list.lastIndexOf(8));
        System.out.println("set " + list.set(10,10));
        System.out.println("subList : "+list.subList(2,5));

        System.out.println("offer"+list.offer(1));
        System.out.println("firstoffer"+list.offerFirst(1));
        System.out.println("lastoffer"+list.offerLast(1));
        for(Integer i: list){
            System.out.println(i);
        }
    }
}
