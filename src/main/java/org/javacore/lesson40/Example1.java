package org.javacore.lesson40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("abcd", "qwet", "sdsd"));

        int sum = list.stream()
                .mapToInt(s -> s.length())
                .sum();

    }
}
