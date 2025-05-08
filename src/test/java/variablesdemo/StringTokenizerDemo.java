package variablesdemo;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

    //String tokeniser is a way to split the string values
    public static void main(String[] args) {
        String name = "this is automation testing batch";

        StringTokenizer st = new StringTokenizer(name); // if there is no delimiter mentioned then space will bet aken as delimiter
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        System.out.println("-----------------------------------");

        String name1 = "this is automation, testing batch";

        StringTokenizer st1 = new StringTokenizer(name1,","); // if there is delimiter mentioned then provide any valid delimiter
        while (st1.hasMoreTokens()) {
            System.out.println(st1.nextToken());
        }

        //newer way to split
        String[] datainfromname1 = name1.split(",");

        for(int i =0 ;i <datainfromname1.length;i++){
            System.out.println(datainfromname1[i]);
        }

        for(String data : datainfromname1){
            System.out.println(data);
        }



    }
}
