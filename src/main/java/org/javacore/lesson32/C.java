package org.javacore.lesson32;

public class C<N extends Number> {
    N n;
    public void doSmth(N n){
        long x = n.longValue();
    }
}
