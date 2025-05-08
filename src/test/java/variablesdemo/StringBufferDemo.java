package variablesdemo;

import demopack2.TestDemo2;

public class StringBufferDemo {

    public static void main(String[] args) throws InterruptedException {
        StringBuffer sb = new StringBuffer("Sample");
        System.out.println(sb);
        System.out.println(sb.append(" demo"));
        System.out.println(sb.reverse());
        System.out.println(sb.capacity());
        System.out.println(sb.substring(4,8));

        StringBuffer sb1 = new StringBuffer("Sample");

        Thread t1 = new Thread(() -> sb1.append("_frist")); // this is one person trying to access sb1
        Thread t2 = new Thread(() -> sb1.append("_second"));// this is second person trying to access sb1
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(sb1);

    }
}
