package inhertiancedemo2;

public class ClassA implements  ISampleTest{
    @Override
    public void demoApp() {
        System.out.println("test demoApp from ClassA");

    }

    @Override
    public void demoPrint() {
        System.out.println("test demoPrint from ClassA");

    }
    // all the implementation of the interface should be available in the implemented class


}
