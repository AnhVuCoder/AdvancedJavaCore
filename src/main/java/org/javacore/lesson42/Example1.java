package org.javacore.lesson42;

import java.util.*;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("AAA","B","CCCC","DDD","FFFFFFFF","AAA"));
        TreeMap<String, Integer> map1 =
                list.stream()
                        .collect(
                                Collectors.toMap(
                                        s -> s,
                                        s -> s.length(),
                                        (a,b) -> a+b,
                                        () -> new TreeMap<>()
                                )
                        );
        for (Map.Entry<String, Integer> map:map1.entrySet()){
            System.out.printf("%s %d\n", map.getKey(), map.getValue());
        }
    }
}
