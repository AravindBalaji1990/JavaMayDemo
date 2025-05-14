package collectionsdemo;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo {

    public static void main(String[] args) {

        Dictionary<Integer, String> dic = new Hashtable<>();
        Hashtable<Integer, String> ht = new Hashtable<>();


        ht.put(100,"sample1");
        ht.put(101,"sample2");
        ht.put(102,"sample3");
        ht.put(103,"sample4");
        ht.put(104,"sample5");
        ht.put(104,"sample6");
//        ht.put(null,null);


        for(Map.Entry<Integer, String> d : ht.entrySet()){
            System.out.println(d.getKey() +" - "+ d.getValue());
        }


    }
}
