package org.javacore.lesson39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,3,5,6,3,8,9));
        try{
            list.stream()
                    .forEach(x -> m(x));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    static void m(int x){
        if(x % 2 == 0){
            throw new RuntimeException("Error");
        }
        System.out.println(":)");
    }
}
