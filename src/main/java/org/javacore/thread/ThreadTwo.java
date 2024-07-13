package org.javacore.thread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadTwo implements Runnable {
    ThreadOne t1;
    public ThreadTwo(){}
    public ThreadTwo(ThreadOne t1){
        this.t1 = t1;
    }
    @Override
    public void run() {
        System.out.println("t2 is running");
        try {
            System.out.println("join t1 into t2");
            t1.join();
            System.out.println("t1 is finished");
            for (int i = 0; i < 10; i++){
                try {
                    System.out.println("Thread two > " + i);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, e);
                }
            }
        } catch (InterruptedException e) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
