package variablesdemo;

public class StringBufferDemo2 {
    StringBuffer sb1 = new StringBuffer("Sample");


    public void appendBuffer(String data){
        sb1.append(data);
        System.out.println(Thread.currentThread().getName() +sb1);
    }

    public static void main(String[] args) throws InterruptedException {
        StringBufferDemo2 obj = new StringBufferDemo2();

        Thread t1 = new Thread(() -> obj.appendBuffer("_frist")); // this is one person trying to access sb1
        Thread t2 = new Thread(() -> obj.appendBuffer("_second"));// this is second person trying to access sb1
        t1.start();
        t2.start();

    }
}
