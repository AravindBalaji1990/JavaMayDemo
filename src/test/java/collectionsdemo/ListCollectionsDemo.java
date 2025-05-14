package collectionsdemo;

import java.lang.invoke.StringConcatException;
import java.util.ArrayList;
import java.util.List;

public class ListCollectionsDemo {

    public static void main(String[] args) {
        // initalise the list
        List<String> obj = new ArrayList<>();
//        ArrayList<String> obj1 = new ArrayList<>();

        //add data inside a list
        obj.add("Sample1");//0
        obj.add("Sample2");//1
        obj.add("Sample3");//2
        obj.add("Sample4");//3
        obj.add("Sample5");//4
        obj.add("Sample5");//4
        obj.add("Sample5");//4
        obj.add("Sample5");//4

        System.out.println("to get the total items inside a list :" +obj.size());
        System.out.println("to get one o fthe items fromt he list :" +obj.get(0));

//        for(int i =0 ; i< obj.size();i++){
//            System.out.println("the items from the list : "+ obj.get(i));
//        }

        for(String data : obj){
            System.out.println("the items from the list : "+ data);

        }
    }
}
