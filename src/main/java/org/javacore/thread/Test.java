package org.javacore.thread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) {
        System.out.println("Thread main start");
        ThreadOne t1 = new ThreadOne();
        t1.setName("A");
        t1.start();
        ThreadTwo t2 = new ThreadTwo();
        Thread t = new Thread(t2);
        t.start();
        try {
            System.out.println("Thuc hien join luong 1 vao luong main");
            t1.join();
            System.out.println("Thuc hien join luong 2 vao luong main");
            t.join();
        } catch (InterruptedException e) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, e);
        }
        System.out.println("Thread main stop");
//        try {
//            Thread.sleep(5000);
//            t1.stop();
//            t.stop();
//        } catch (InterruptedException e) {
//            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, e);
//        }
    }
}
