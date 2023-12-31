package com.example.demo;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OneNumberCorrectWrongPlaceTest {

    private final Code code806 = Code.from(8, 0, 6);
    private final OneNumberCorrectWrongPlace target806 = new OneNumberCorrectWrongPlace(code806);
    @Nested
    class test {

        @Test
        void returnTrue() {
            var code = Code.from(7, 1, 8);

            var result806 = target806.test(code);


            assertTrue(result806);
        }

        @Test
        void returnFalse() {
            var code = Code.from(1, 1, 1);

            var result806 = target806.test(code);

            assertFalse(result806);
        }

        @Test
        void returnBooleanSamePlaceNumber() {
            var code = Code.from(1, 1, 6);

            var result806 = target806.test(code);

            assertFalse(result806);
        }

        @Test
        void returnBooleanSamePlaceNumber2() {
            var code = Code.from(6, 1, 1);

            var result806 = target806.test(code);

            assertTrue(result806);
        }

        @Test
        void returnFalseDuplicationNumber() {
            var code = Code.from(0, 8, 8);

            var result806 = target806.test(code);

            assertFalse(result806);
        }
    }
}
