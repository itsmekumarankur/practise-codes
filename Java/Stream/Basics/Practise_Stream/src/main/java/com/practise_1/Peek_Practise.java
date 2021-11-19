package com.practise_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/*
* Stream.peek() method can be useful in visualizing how the stream operations behave
*  and understanding the implications and interactions of complex intermediate stream operations.
* */
public class Peek_Practise {
    public static void main(String[] args)
    {

        // Creating a list of Integers
        List<Integer> list = Arrays.asList(0, 2, 4, 6, 8, 10);

        // Using peek without any terminal
        // operation does nothing. Hence this
        // code will produce no output.
        list.stream().peek(System.out::println);



        List<Integer> newList = list.stream()
                .peek(System.out::println)
                .collect(Collectors.toList());


    }
}
