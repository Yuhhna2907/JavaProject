package FizzBuzzTranslate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void testFizzByDivisibleBy3() {
        assertEquals("Fizz", FizzBuzzTranslate.translate(9));
    }

    @Test
    void testBuzzByDivisibleBy5() {
        assertEquals("Buzz", FizzBuzzTranslate.translate(10));
    }

    @Test
    void testFizzBuzzByDivisibleBy3And5() {
        assertEquals("FizzBuzz", FizzBuzzTranslate.translate(15));
    }

    @Test
    void testFizzByContaining3() {
        assertEquals("Fizz", FizzBuzzTranslate.translate(13));
    }

    @Test
    void testBuzzByContaining5() {
        assertEquals("Buzz", FizzBuzzTranslate.translate(52));
    }

    @Test
    void testNormalNumber() {
        assertEquals("Buzz", FizzBuzzTranslate.translate(20));
    }

    @Test
    void testInvalidNumber() {
        assertEquals("Số không hợp lệ (chỉ nhận từ 1 đến 99)", FizzBuzzTranslate.translate(0));
    }
}