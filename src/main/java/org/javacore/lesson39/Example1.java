package org.javacore.lesson39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,5,6,3,8,9));
//        list.stream()
//                .filter(x -> x % 2 == 0)
//                .sorted(Comparator.reverseOrder())
//                .forEach(System.out::println);
        boolean b1 = list.stream().anyMatch(x -> x % 2 == 0);
        boolean b2 = list.stream().allMatch(x -> x % 2 == 0);
        boolean b3 = list.stream().noneMatch(x -> x % 2 == 0);
        System.out.printf("%s, %s, %s", b1, b2, b3);
    }
}
