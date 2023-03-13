package March_2023.Week2.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();//upcasting
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(7);
        set.add(9);

        Set<Integer> set1 = new HashSet<>();//upcasting
        set1.add(2);
        set1.add(4);
        set1.add(6);
        set1.add(8);
        set1.add(10);

        set.addAll(set1);

        System.out.println("Contains :" + set.contains(10));
        System.out.println(" contains All : "+ set.containsAll(set1));
        System.out.println("isEmpty : "+set.isEmpty());
        // Loop through/iterator
        //way1

        for (Integer i : set) {
            System.out.println(i);
        }

        //way 2 ==> goes in forward direction only

       // Iterator <Integer> iterator= set.iterator();


    }
}
