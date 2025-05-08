package cosntructordemo;

public class ConstructorDemo1 {
    int a =10;

    public ConstructorDemo1(){
            a =20;
    }

    public void demoAddition( int a , int b){
        a = this.a; //this is a keyword where you can get the instanc eof the variable or method at that instance
        int result = a+b;
        System.out.println("result of addition : " + result);
    }

    public static void main(String[] args) {
        ConstructorDemo1 demoobject = new ConstructorDemo1();
        demoobject.demoAddition(7,7);
    }
}
