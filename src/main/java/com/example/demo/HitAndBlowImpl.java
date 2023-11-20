package com.example.demo;

import java.io.IOException;
import java.io.Reader;

@lombok.AllArgsConstructor
public class HitAndBlowImpl implements HitAndBlow{

    private final CountHitImpl countHit;
    private final CountBlowImpl countBlow;
    private final InputNum inputNum;

    @Override
    public void hitAndBlow(Reader raed, char[] answer, int numDigit) throws IOException {

        int numHit;
        int numBlow;
        do {

            char[] input = new char[3];
            inputNum.input(raed, numDigit);


            numHit = countHit.countHit(answer, input, numDigit);
            numBlow = countBlow.countBlow(answer, input, numDigit);
            if (numHit == 0 && numBlow == 0) {
                System.out.println("Nothing is correct!");
            } else {
                System.out.println(numHit + "number correct!!  " + numBlow + "number correct, wrong place!!");
            }
        } while (numHit < numDigit);
    }
}