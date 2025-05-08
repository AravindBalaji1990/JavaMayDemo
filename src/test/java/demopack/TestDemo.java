package demopack;

import demopack2.*;

public class TestDemo {

    public static void main(String[] args) {
        System.out.println("this is from main");
        addition();
        // non static accessed inside a main method
        TestDemo testdemo =  new TestDemo();
        testdemo.multiply();
        testdemo.multiplyParams(3,4);
        testdemo.multiplyParams(5,6);
        TestDemo2 testdemo2 = new TestDemo2();
        testdemo2.division();

        TestDemo3 testdemo3 = new TestDemo3();
        testdemo3.subtraction();

    }

    public static void addition() {
        int a = 2;
        int b = 3;
        int result = a + b;
        System.out.println("the result of the addition : " + result);
    }

    public void multiply() {
        int a = 2;
        int b = 3;
        int result = a * b;
        System.out.println("the result of the multiply : " + result);
    }

    public void multiplyParams(int a, int b) {
        int result = a * b;
        System.out.println("the result of the multiply : " + result);
    }


}
