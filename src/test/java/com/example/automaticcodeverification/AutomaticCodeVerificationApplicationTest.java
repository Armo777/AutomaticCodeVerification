package com.example.automaticcodeverification;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.*;

public class AutomaticCodeVerificationApplicationTest {

    private String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    //Тест для задачи реверс строк
    @Test
    public void testReverseString() {
        assertEquals("olleH", reverseString("Hello"));
        assertEquals("", reverseString(""));
        assertEquals("A", reverseString("A"));
        assertEquals("  a b c d ", reverseString(" d c b a  "));
    }

    // Тест который принимает на вход целое число n и
    // возвращает true, если число является простым, и false - в противном случае.
    @Test
    public void testIsPrimeNumber() {
        PrimeNumber primeNumber = new PrimeNumber();
        assertTrue(primeNumber.isPrimeNumber(2));
        assertTrue(primeNumber.isPrimeNumber(17));
        assertFalse(primeNumber.isPrimeNumber(4));
    }

    public int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // Тест который принимает на вход массив целых
    // чисел и возвращает сумму всех элементов массива.
    @Test
    public void testSumArray() {
        int[] array = {1, 2, 3, 4, 5};
        int expectedSum = 15;

        int actualSum = sumArray(array);

        assertEquals(expectedSum, actualSum);
    }

    // Тест который принимает на
    // вход два целых числа и возвращает их сумму.
    @Test
    public void testSumCalculation() {
        int a = 2;
        int b = 3;
        int expectedSum = 5;

        int actualSum = MathUtil.calculateSum(a, b);

        assertEquals(expectedSum, actualSum);
    }

    //Тесты который принимает на вход строку
    // и возвращает ее длину.
    @Test
    public void testStringLength() {
        String str = "Hello, World!";
        int expectedLength = 13;

        int actualLength = StringUtil.calculateLength(str);

        assertEquals(expectedLength, actualLength);
    }
}