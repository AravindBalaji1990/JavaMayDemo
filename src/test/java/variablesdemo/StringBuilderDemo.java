package variablesdemo;

public class StringBuilderDemo {
    StringBuilder sb1 = new StringBuilder("Sample");


    public void appendBuffer(String data){
        sb1.append(data);
        System.out.println(Thread.currentThread().getName() +sb1);
    }

    public static void main(String[] args) throws InterruptedException {
        StringBuilderDemo obj = new StringBuilderDemo();

        Thread t1 = new Thread(() -> obj.appendBuffer("_frist")); // this is one person trying to access sb1
        Thread t2 = new Thread(() -> obj.appendBuffer("_second"));// this is second person trying to access sb1
        t1.start();
        t2.start();

    }
}
