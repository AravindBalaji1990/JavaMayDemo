package collectionsdemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ListCollectionsDemo2 {

    public static void main(String[] args) {
        // initalise the list
        LinkedList<String> obj1 = new LinkedList<>();// type safe - no exception
        obj1.add("sample1");
        obj1.add("sample2");
        obj1.add("sample3");

        List obj2 = new LinkedList<>(); // this might result in runtime exception
        obj2.add("sample4");
        obj2.add("sample5");
        obj2.add("sample6");


        // to add both the list together

        obj1.addAll(obj2);

        for (String data: obj1){
            System.out.println("the data avaialble : " + data);
        }

        obj1.remove(2);
        for (String data: obj1){
            System.out.println("the data avaialble : " + data);
        }

       List<Object> consolidated = obj1.stream().filter(datagiven -> datagiven.endsWith("2")).collect(Collectors.toList());

        for (Object data: consolidated){
            System.out.println("the data avaialble after searching : " + data);
        }


        obj1.add("Sample6");

        for (Object data: obj1){
            System.out.println("the data avaialble after searching : " + data);
        }


    }
}
