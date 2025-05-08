package variablesdemo;

public class TypeCasting {
    public static void main(String[] args) {

        //typecasting - this iis nothing but converting from one type to another

        //use case convert the num to string and get the data type of it using boxing

        int num =2;
        Integer num1 =2;


        String converteddata = String.valueOf(num); // null safe - it will return null
        String converteddata1 = num1.toString(); // not null safe it will result in null pointer exception
        System.out.println("typecast in java converteddata1: "+((Object)converteddata1).getClass().getName()); // this will pull the packanem and class

        System.out.println("typecast in java : "+((Object)converteddata).getClass().getName()); // this will pull the packanem and class
        System.out.println("typecast in java : "+((Object)converteddata).getClass().getSimpleName()); // this will pull the class

        double d = 9.7;
        int d_int = (int) d; // type casting converting from double to int inthis context
        System.out.println("type casted : " + d_int);
        System.out.println("type casted : " + ((Object)d_int).getClass().getSimpleName());

    }
}
