package com.practise_2.intro;

import java.util.Arrays;
import java.util.List;

public class Example0 {

    public static void main(String[] args) {

        List<String> myFirstStream = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        for(String t: myFirstStream){
            if(t.startsWith("a")){
               System.out.println(t);
            }
        }
    }
}
