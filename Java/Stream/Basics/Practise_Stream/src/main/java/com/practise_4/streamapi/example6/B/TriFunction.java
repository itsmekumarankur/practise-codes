package com.practise_4.streamapi.example6.B;

/**
 * Created by orifjon9 on 3/17/2017.
 */
@FunctionalInterface
public interface TriFunction<S,T,U,R> {
    R apply(S s, T t, U u);
}
