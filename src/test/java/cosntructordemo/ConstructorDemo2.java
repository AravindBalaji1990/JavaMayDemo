package cosntructordemo;

public class ConstructorDemo2 {
    int a = 10;

    public ConstructorDemo2(int a) {
        this.a = a;
    }

    public void demoAddition(int a, int b) {
        a = this.a; //this is a keyword where you can get the instanc eof the variable or method at that instance
        int result = a + b;
        System.out.println("result of addition : " + result);
    }

    public static void main(String[] args) {
        ConstructorDemo2 demoobject = new ConstructorDemo2(100);
        demoobject.demoAddition(7, 7);
        ConstructorDemo2 demoobject1 = new ConstructorDemo2(200);
        demoobject1.demoAddition(7, 7);
    }
}
