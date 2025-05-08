package inheritancedemo1;

public class SampleDemo2 extends SampleDemo1{

    String name = "test demo child";

    public void dataPrint(){
        System.out.println("this is method from child");
    }

    public void callFromParent(){
        super.dataPrint();
        System.out.println(super.name);
    }

    public static void main(String[] args) {
        SampleDemo2 obj = new SampleDemo2();
        obj.dataPrint();
        obj.callFromParent();


    }
}
