package com.practise_3.main;

import com.practise_3.utils.UserGenerator;

/**
 * Created by rresino on 06/03/2016.
 */
public class SortedDistinctExample {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Sorted Distinct Example:");
        System.out.println();

        UserGenerator.streamOf(1000)
                .map(s->s.getName())
                .distinct()
                .sorted()
                .forEach(s-> System.out.println(s));

    }

}
