package org.javacore.lesson31;

public class Main1 {
    public static void main(String[] args) {
        Foo<Integer> f1;
        Foo<?> f2;
        Foo<? extends Number> f3;
        Foo<? super Number> f4;
        Foo<Number> f5;
        f1 = new Foo<Integer>();
        f5 = new Foo<Number>();
        f3 = new Foo<Integer>();
        f4 = new Foo<Object>();
    }
    static Foo<Integer> m1(){
        return null;
    }
}
