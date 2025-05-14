package collectionsdemo;

import java.util.HashSet;
import java.util.Set;

public class SetCollectionDemo {

    public static void main(String[] args) {
//        Set<String> data1 = new HashSet<>();
        HashSet<String> data2 = new HashSet<>();
        data2.add("sample1");
        data2.add("sample2");
        data2.add("sample3");
        data2.add("sample4");
        data2.add("sample4");
        data2.add("sample5");

        System.out.println("the total ite ms inside the set : " + data2.size());
        for(String data : data2){
            System.out.println("items inside the set : " +data);
        }

        data2.remove("sample4");
        for(String data : data2){
            System.out.println("items inside the set : " +data);
        }
        // the below code wil throw exception as the set does not have a duplciate values
        // so  the position if the data will be varied or shuffled

//        for(int i =0 ; i < data2.size();i++){
//            System.out.println("data insde the set : " + data2);
//        }
    }
}
