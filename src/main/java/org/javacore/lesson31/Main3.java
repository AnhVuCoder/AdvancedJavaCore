package org.javacore.lesson31;

public class Main3 {
    public static void main(String[] args) {
        Foo<? extends Number> f1 = new Foo<Integer>();
        // f1.x = 10; doesn't work
        Foo<? super Number> f2 = new Foo<Number>();
        f2.x = 10;
    }
}
