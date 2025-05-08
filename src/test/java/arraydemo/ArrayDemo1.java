package arraydemo;

import java.util.Random;

public class ArrayDemo1 {


    public static void main(String[] args) {
        String[] stringarray = {"sample1","sample2","sample3","sample4","sample5"};

        System.out.println("to get the lenght of the items : " + stringarray.length);


        System.out.println("to get the speciifc of the items : " + stringarray[new Random().nextInt(stringarray.length)]);// this iwll haev  index out of bound  exception if you do not have the right integer

        for(int i =0; i <stringarray.length;i++){
            System.out.println(stringarray[i]);
        }

        for(String data : stringarray){
            System.out.println(data);
        }

    }




}
