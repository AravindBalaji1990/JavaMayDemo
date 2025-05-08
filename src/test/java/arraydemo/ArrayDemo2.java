package arraydemo;

import java.util.Random;

public class ArrayDemo2 {


    public static void main(String[] args) {
       int[][] num = {{1,2},{3,4},{5,6}};

       demoIteration(num);


    }


    public static void demoIteration(int[][] num){
        for(int i =0; i< num.length;i++){
            for(int j =0;j<num[i].length;j++){
                System.out.println(num[i][j]);
            }

        }
    }




}
