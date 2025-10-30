package BinarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    @Test
    void testFoundMiddle() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(2, BinarySearch.binarySearch(arr, 5));
    }

    @Test
    void testFoundFirst() {
        int[] arr = {2, 4, 6, 8, 10};
        assertEquals(0, BinarySearch.binarySearch(arr, 2));
    }

    @Test
    void testFoundLast() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(4, BinarySearch.binarySearch(arr, 5));
    }

    @Test
    void testNotFound() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(-1, BinarySearch.binarySearch(arr, 6));
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        assertEquals(-1, BinarySearch.binarySearch(arr, 10));
    }
}
