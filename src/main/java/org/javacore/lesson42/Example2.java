package org.javacore.lesson42;

import java.util.*;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("AAA","B","CCCC","DDD","FFFFFFFF","AAA"));
//        list.stream()
//                .collect(Collectors.teeing(
//                        Collectors.counting(),
//                        Collectors.joining(),
//                        (a,b) -> List.of(a,b)
//                        )
//
//                )
        Map<Boolean, List<String>> res = list.stream()
                .collect(
                                Collectors.partitioningBy(n -> n.length() % 2 == 0)
                );
        System.out.println(res);
    }
}
