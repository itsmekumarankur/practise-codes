package com.pluralsight.rxjava2.module3;

import com.pluralsight.rxjava2.utility.datasets.GreekAlphabet;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Eg_4_Filter_Example3 {
    private static final Logger log = LoggerFactory.getLogger(Eg_4_Filter_Example3.class);

    public static void main(String[] args) {

        // Create an Observable to filter.
        Observable<String> greekAlphabet = GreekAlphabet.greekAlphabetInEnglishObservable()

                // Filter out "delta"
                .filter( nextLetter -> !nextLetter.toLowerCase().equals("delta"));

        greekAlphabet.subscribe(nextLetter -> log.info( "onNext - {}" , nextLetter));

        System.exit(0);
    }
}
