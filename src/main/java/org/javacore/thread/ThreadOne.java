package org.javacore.thread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadOne extends Thread {
    @Override
    public void run() {
        System.out.println("t1 is running");
        for (int i = 0; i < 10; i++){
            try {
                System.out.println("Thread one > " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }
}
