package org.javacore.lesson33;

public class Example2 {
    public static void main(String[] args) {
        D d1 = new D();
        d1.t = 10;
        d1.g = "Ten";
        System.out.println(d1.t + " " + d1.g);
        E<Boolean> e1 = new E<Boolean>();
        e1.t = true;
        e1.g = 10;
        K<Boolean, Integer> k1 = new K<>();
        k1.g = true;
        k1.t = 10;
        C<Double, Integer> k2 = new K<Integer, Double>();

        k2.t = 1.44;
        C<? extends  Number, ?> k3 = new K<>();
    }
}
