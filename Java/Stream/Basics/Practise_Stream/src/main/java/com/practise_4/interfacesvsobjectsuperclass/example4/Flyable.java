package com.practise_4.interfacesvsobjectsuperclass.example4;

/**
 * Created by orifjon9 on 3/13/2017.
 */
public interface Flyable extends FlyBehavior {
    default  void flyWithWings(){
        System.out.println("\tfly with wings");
    }
}
