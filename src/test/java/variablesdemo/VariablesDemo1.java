package variablesdemo;

public class VariablesDemo1 {
    //global variable
    int num =100;

    public static void main(String[] args) {

        // object it will accomodate everything irrespective of the data type
        Object obj = 2;
        System.out.println(obj);
        System.out.println("what is the data type : " + obj.getClass().getName());

        Object obj1 = "Stringname";
        System.out.println(obj1);
        System.out.println("what is the data type : " + obj1.getClass().getName());


        int num1 = 2;
        System.out.println(num1);
        //box - converting a primitive type tpo a wrapper class
//        System.out.println("Box in java : "+(num1).getClass().getName());
        System.out.println("Box in java : "+((Object)num1).getClass().getName());
        System.out.println("Box in java : "+((Object)num1).getClass().getSimpleName());


        String name = "sample";
        System.out.println(name);

        boolean bool = true;
        System.out.println(bool);

        float f = 12.34f;
        System.out.println(f);

        double d = 34.56;
        System.out.println(d);

    }
}
