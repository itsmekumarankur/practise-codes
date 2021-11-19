package com.practise_3.main;

import com.practise_3.utils.Generator;
import com.practise_3.utils.UserGenerator;

import java.util.Collection;
import java.util.stream.Stream;

/**
 * Created by rresino on 04/03/2016.
 */
public class FlatmapExample {


    public static void main(String[] args) {

        Stream.of(
                UserGenerator.streamOf(10).map(s->s.getName()),
                UserGenerator.streamOf(10).map(s->s.getEmail()),
                Generator.getGeekAlphabetList().stream())
                .flatMap(st->st)
                .forEach(x->System.out.println(x));

    }

}
