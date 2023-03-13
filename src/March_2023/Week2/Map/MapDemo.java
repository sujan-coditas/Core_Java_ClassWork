package March_2023.Week2.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map<Integer,String> map=new LinkedHashMap<>();
        map.put(2,"B");
        map.put(4,"D");
        map.put(6,"F");
        map.put(8,"H");
        map.put(10,"J");

        Map<Integer,String> map1=new LinkedHashMap<>();
        map1.put(1,"A");
        map1.put(3,"C");
        map1.put(5,"E");
        map1.put(7,"G");
        map1.put(9,"I");

        System.out.println ("Size map " +map.size());
        System.out.println("get :" + map.get(5));
        System.out.println("replace :" +map.replace(2,"Z"));
        System.out.println("keyset : "+map.keySet());
        //map.putAll(map1);
        for( Map.Entry<Integer,String> entry: map.entrySet()){
            System.out.println(entry.getKey()+ "===" + entry.getValue());
        }
    }
}
