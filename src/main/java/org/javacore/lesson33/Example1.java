package org.javacore.lesson33;

public class Example1 {
    public static void main(String[] args) {
        B b1 = new B();
        b1.a = "Hello";
        b1.b = 10;
        System.out.printf("%s, %d", b1.a, b1.b);
    }
}
