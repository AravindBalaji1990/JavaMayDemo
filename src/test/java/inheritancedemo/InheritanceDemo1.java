package inheritancedemo;

import encapsulationdemo.EncapsualtionDemo1;

public class InheritanceDemo1 extends EncapsualtionDemo1 {
    String name ="parent";

    //parent class

    public void addition(){
        int a =2;
        int b =2;
        int result = a+b;
        System.out.println(result);
    }

    public static void main(String[] args) {
        InheritanceDemo1 obj = new InheritanceDemo1();
        obj.addition();
        obj.samplePrint();
    }

}

