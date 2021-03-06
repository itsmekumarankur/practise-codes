package com.pluralsight.rxjava2.module3;

import com.pluralsight.rxjava2.utility.datasets.GreekAlphabet;
import com.pluralsight.rxjava2.utility.subscribers.DemoSubscriber;
import io.reactivex.Observable;

import java.util.concurrent.atomic.AtomicInteger;

public class Eg_4_SkipWhile_Example1 {

    public static void main(String[] args) {

        // Get the usual Greek alphabet and repeat it 3 times.
        Observable<String> greekAlphabet = GreekAlphabet.greekAlphabetInEnglishObservable()
                .repeat(3);

        // Create a counter so we can count the number of times we have
        // seen the "alpha" letter.
        AtomicInteger numberOfAlphas = new AtomicInteger();

        // We want to skip until we have seen "alpha" 3 times.
        // On the third time, we begin emitting letters.
        greekAlphabet.skipWhile( nextLetter -> {

            // It's an alpha!  Count it!
            if( nextLetter.equals("alpha") ) {

                // If this is the third alpha, then return false - meaning that
                // we are no longer skipping.
                if (numberOfAlphas.incrementAndGet() == 3) {
                    return false;
                }
            }

            // Return true - yes, we are still skipping.
            return true;

        }).subscribe(new DemoSubscriber<>());


        System.exit(0);
    }
}
