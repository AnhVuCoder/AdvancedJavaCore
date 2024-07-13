package org.javacore.lesson33;

public class J<T> {
    private T value;
    void m1(T value){}
     T m2(){
        return null;
    }
    static <T> T m3(){
        return null;
    }
    static <U> U m4(){
        return null;
    }
    static <T> void smth(T a, Class<T> c){

    }
}
