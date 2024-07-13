package org.javacore.lesson39;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Example2 {
    public static void main(String[] args) {
        Stream<Integer> s1 = Stream.empty();
        Stream<Integer> s2 = Stream.of(3,5,6,7,8,9);
//        s2.forEach(System.out::println);
//        System.out.println();
//        Stream<Integer> s3 = Stream.generate( () -> new Random().nextInt());
//        s3.limit(10).forEach(System.out::println);
//        Stream<Integer> s4 = Stream.iterate(1, i -> i+1);
//        s4.limit(10)
//                .forEach(System.out::println);
        Stream<Integer> s5 = Stream.iterate(1, i -> i+1).limit(3);
        s5.forEach(System.out::println);
    }
    public List<Integer> m1(){
        return Collections.emptyList();
    }
    public Stream<Integer> m2(){
        return Stream.empty();
    }
}
