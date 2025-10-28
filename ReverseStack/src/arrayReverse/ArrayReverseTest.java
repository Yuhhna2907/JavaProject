package arrayReverse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayReverseTest {


    @Test
    void testReverseNormalArray() {
        int[] arr = {1, 2, 3, 4, 5};
        ArrayReverse.reverse(arr);
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, arr,
                "Mảng sau khi đảo phải đúng thứ tự ngược");
    }

    @Test
    void testReverseSingleElement() {
        int[] arr = {42};
        ArrayReverse.reverse(arr);
        assertArrayEquals(new int[]{42}, arr, "Mảng 1 phần tử không thay đổi");
    }

    @Test
    void testReverseEmptyArray() {
        int[] arr = {};
        ArrayReverse.reverse(arr);
        assertArrayEquals(new int[]{}, arr, "Mảng rỗng vẫn giữ nguyên");
    }

    @Test
    void testReverseNullArray() {
        assertDoesNotThrow(() -> ArrayReverse.reverse(null),
                "Không nên ném lỗi khi mảng null");
    }
}