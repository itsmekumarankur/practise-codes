package com.pluralsight.rxjava2.module3;

import com.pluralsight.rxjava2.utility.datasets.GreekAlphabet;
import io.reactivex.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Eg_4_Filter_Example2 {
    private static final Logger log = LoggerFactory.getLogger(Eg_4_Filter_Example2.class);

    public static void main(String[] args) {

        // Create an Observable to filter.
        Observable<String> greekAlphabet = GreekAlphabet.greekAlphabetInEnglishObservable()

                // Filter out "delta"
                .filter( nextLetter -> !nextLetter.equals("delta"));

        greekAlphabet.subscribe(
                nextLetter ->  log.info( "onNext - {}" , nextLetter),
                throwable -> log.error(throwable.getMessage(),throwable),
                () -> log.info( "onComplete")
        );

        System.exit(0);
    }
}
