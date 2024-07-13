package org.javacore.thread;

public class Main {
    public static void main(String[] args) {
        // Thread main -> Luong chinh cua chuong trinh - Tong cong co 3 luong 1,2,chinh
        System.out.println("Start");
        // Luong 1
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 100; i++){
                    System.out.println("Thread 1 > " + i);
                }
            }
        });
        t1.start();
        // Luong 2
        new Thread(() -> {
            for(int i = 0; i < 100; i++){
                System.out.println("Thread 2 > " + i);
            }
        }).start();
        System.out.println("End");
    }
}
