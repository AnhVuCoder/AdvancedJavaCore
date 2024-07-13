package org.javacore.lesson32;

public class Example2 {
    public static void main(String[] args) {
        B<?> b = new B<Integer>(10);
        System.out.println(b.b.getClass());
        B<? extends Number> b1 = new B<>(10);
        System.out.println(b1.b);
        B<? super Number> b2 = new B<>(10.5);
        System.out.println(b2.b);
    }
}
