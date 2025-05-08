package variablesdemo;

public class StringDemo {

    //String
    //StringBuilder
    //StringBuffer
    //StringTokeniser
    public static void main(String[] args) {
        System.out.println("Sample".equals("Sample"));
        System.out.println("Sample".startsWith("Sample"));
        System.out.println("Sample".endsWith("Sample"));
        System.out.println("Sample".equalsIgnoreCase("Sample"));

        String name = "sample";
        name = name + name;
        System.out.println("final value :" +name.concat("_00001"));

    }
}
