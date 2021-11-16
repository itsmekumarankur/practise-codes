package com.practise_1;

import java.util.Arrays;

public class Reduce_Practise {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // 1st argument, init value = 0
        int sum = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);

        System.out.println("sum : " + sum); // 55

        int sum1 = Arrays.stream(numbers).reduce(0, Integer::sum); // 55

        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum2 = Arrays.stream(numbers1).reduce(0, (a, b) -> a / b);    // 55
        int sum3 = Arrays.stream(numbers1).reduce(0, Integer::sum);      // 55





    }

    void max_min(){
        // Max and Min.
        int[] numbers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int max = Arrays.stream(numbers2).reduce(0, (a, b) -> a > b ? a : b);  // 10
        int max1 = Arrays.stream(numbers2).reduce(0, Integer::max);            // 10

        int min = Arrays.stream(numbers2).reduce(0, (a, b) -> a < b ? a : b);  // 0
        int min1 = Arrays.stream(numbers2).reduce(0, Integer::min);
    }

    void joinString(){
        String[] strings = {"a", "b", "c", "d", "e"};

        // |a|b|c|d|e , the initial | join is not what we want
        String reduce = Arrays.stream(strings).reduce("", (a, b) -> a + "|" + b);

        // a|b|c|d|e, filter the initial "" empty string
        String reduce2 = Arrays.stream(strings).reduce("", (a, b) -> {
            if (!"".equals(a)) {
                return a + "|" + b;
            } else {
                return b;
            }
        });

        // a|b|c|d|e , better uses the Java 8 String.join :)
        String join = String.join("|", strings);
    }
}
