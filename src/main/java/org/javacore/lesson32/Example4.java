package org.javacore.lesson32;

public class Example4 {
    public static void main(String[] args) {
        D<Integer, String> d1 = new D<>();
        D<String, Integer> d2 = new D<>();
        D<?, Integer> d3 = new D<String, Integer>();

        D<?, ? extends Number> d4 = new D<String, Integer>();

    }
}
