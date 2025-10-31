package InsertionSort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InsertionSortTest {
    private InsertionSort service;

    @BeforeEach
    void setUp() {
        service = new InsertionSort();
    }

    @Test
    void testSort_RandomArray() {
        int[] input = {5, 3, 4, 1, 2};
        int[] expected = {1, 2, 3, 4, 5};
        int[] result = service.sort(input);
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testSort_AlreadySorted() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        int[] result = service.sort(input);
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testSort_ReversedArray() {
        int[] input = {9, 7, 5, 3, 1};
        int[] expected = {1, 3, 5, 7, 9};
        int[] result = service.sort(input);
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testSort_WithDuplicates() {
        int[] input = {4, 2, 4, 3, 2};
        int[] expected = {2, 2, 3, 4, 4};
        int[] result = service.sort(input);
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testSort_EmptyArray() {
        int[] input = {};
        int[] expected = {};
        int[] result = service.sort(input);
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testSort_SingleElement() {
        int[] input = {42};
        int[] expected = {42};
        int[] result = service.sort(input);
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testSort_NegativeNumbers() {
        int[] input = {3, -1, 0, -5, 2};
        int[] expected = {-5, -1, 0, 2, 3};
        int[] result = service.sort(input);
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    void testSort_DoesNotMutateOriginal() {
        int[] input = {3, 1, 2};
        int[] copy = input.clone();
        service.sort(input);
        Assertions.assertArrayEquals(copy, input, "Hàm sort không được làm thay đổi mảng gốc");
    }

}