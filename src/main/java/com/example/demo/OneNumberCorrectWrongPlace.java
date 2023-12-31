package com.example.demo;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class OneNumberCorrectWrongPlace implements Predicate<Code> {

    private final Code verifyNumber;

    public OneNumberCorrectWrongPlace(Code vCode){
        verifyNumber = vCode;
    }

    @Override
    public boolean test(Code code) {

        return  IntStream.range(0, Code.NUM_OF_DIGITS)
                .flatMap(i ->
                        IntStream.range(0, Code.NUM_OF_DIGITS)
                                .filter(j -> i != j )
                                .filter(j -> code.getDigit(i) == verifyNumber.getDigit(j))
                ).count() == 1;
    }
}
