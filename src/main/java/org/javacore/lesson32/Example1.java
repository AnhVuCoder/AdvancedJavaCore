package org.javacore.lesson32;

public class Example1 {
    public static void main(String[] args) {
        A<Integer> a1 = new A<>();
        a1.a = 10;
        A<Number> a2 = new A<>();
        A<? super Number> a3 = new A<>();
        A<? extends Number> a4 = new A<>();
        // a4.a = 10;
        A<?> a5 = new A<>();
        // a5.a=10;
    }

}
