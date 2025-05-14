package collectionsdemo;

import java.util.HashMap;
import java.util.Map;

public class HashmapDemo1 {

    public static void main(String[] args) {
        Map<Integer, String> data1 = new HashMap<>();
        HashMap<Integer, String> data2 = new HashMap<>();

        data2.put(100, "sample1");
        data2.put(101, "sample2");
        data2.put(102, "sample3");
        data2.put(103, "sample4");
        data2.put(104, "sample5");
        data2.put(105, "sample5");
        data2.put(105, "sample6");
        data2.put(null, null);

        data2.entrySet().stream().forEach((dataentry -> System.out.println((dataentry.getKey() +"----------------- " +dataentry.getValue()))));

        data2.entrySet().stream().filter(entrydatasamsample ->entrydatasamsample.getValue().equals("sample5")).forEach((dataentry -> System.out.println((dataentry.getKey() +"----------------- " +dataentry.getValue()))));

        // how to pull one set of data
        System.out.println("get data from the map : " + data2.get(105));
        System.out.println("getthe size of the map : " + data2.size());

//        how to manipulate the dat from hashmap
        // this will result in nulla s the value of i does not match any key inthe hashmap
//        for (int i = 0; i < data2.size(); i++) {
//            System.out.println("print the i value : " + i);
//            System.out.println(data2.get(i));
//        }
        // iterating through both key and value
        for(Map.Entry<Integer, String> hm:data2.entrySet()){
            System.out.println("the key : " + hm.getKey() + " - and the value :"+ hm.getValue());

        }


        for(Integer hm1:data2.keySet()){
            System.out.println("the key : " + hm1);

        }

        for(String hm2:data2.values()){
            System.out.println("the value : " + hm2);

        }



        data2.remove(100);
        for(Map.Entry<Integer, String> hm:data2.entrySet()){
            System.out.println(" reintration the key : " + hm.getKey() + " - and the value :"+ hm.getValue());

        }

        data2.put(101,"xxxxyyyyzzzz");

        for(Map.Entry<Integer, String> hm:data2.entrySet()){
            System.out.println("reintration  key : " + hm.getKey() + " - and the value :"+ hm.getValue());

        }

    }
}

