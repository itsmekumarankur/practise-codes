package com.monotonic.generics._1_what_and_why_of_generics.eg_3;

import com.monotonic.generics._1_what_and_why_of_generics.eg_3.GenericCircularBuffer;

public class GenericExample
{
    public static void main(String[] args)
    {
        GenericCircularBuffer<String> buffer = new GenericCircularBuffer<String>(10);

        buffer.offer("a");
        buffer.offer("bc");
        buffer.offer("d");

        //buffer.offer(1);

        String value = concatenate(buffer);
        System.out.println(value);
    }

    private static String concatenate(GenericCircularBuffer<String> buffer)
    {
        StringBuilder result = new StringBuilder();

        String value;
        while ((value = buffer.poll()) != null)
        {
            result.append(value);
        }

        return result.toString();
    }
}
