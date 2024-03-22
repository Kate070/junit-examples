package dev;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateUtilTest {

    private final CalculateUtil calculateUtil = new CalculateUtil();

    @Test
    void sum() {
        int a = 2;
        int b = 3;
        int sum = 5;

        int actualSum = calculateUtil.sum(a, b);

        assertEquals(sum, actualSum);
    }


    @Test
    void multiply() {
        int a = 2;
        int b = 3;
        int expectedResult = 6;

        int actualResult = calculateUtil.multiply(a, b);

        assertEquals(expectedResult, actualResult);
    }

    //Написать тесты на сумму с параметрами с помощью аннотации CsvSource - 2 слагаемых и сумм (а,b, sum) - 3-4 набора параметров
}
