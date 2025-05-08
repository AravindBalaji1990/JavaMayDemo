package inheritancedemo;

public class InheritanceDemo2 extends InheritanceDemo1 {

    //chi;ld class

    public void multiply(){
        int a =2;
        int b =3;
        int result = a*b;
        System.out.println(result);
    }

    public static void main(String[] args) {
        InheritanceDemo2 demo = new InheritanceDemo2();
        demo.addition();
        demo.multiply();
        demo.samplePrint();// this method of deom encapsulationDemo1 which is parent of the inheritancedemo1
    }
}
