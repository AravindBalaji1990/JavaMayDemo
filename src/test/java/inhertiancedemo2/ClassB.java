package inhertiancedemo2;

public class ClassB implements ISampleTest{
    @Override
    public void demoApp() {
        System.out.println("test demoApp from ClassB");
    }

    @Override
    public void demoPrint() {
        System.out.println("test demoPrint from ClassB");

    }

    public static void main(String[] args) {
        ClassB objb = new ClassB();
        objb.demoApp();
        objb.demoPrint();
        ISampleTest.testDemo();
        ClassA obja = new ClassA();
        obja.demoApp();
        obja.demoPrint();
    }
}
