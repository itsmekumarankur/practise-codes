package com.practise_4.interfacesvsobjectsuperclass.example1.E;


public interface ClassC extends ClassA {

    default void method() {
        System.out.println("Method of ClassC");
    }
}
