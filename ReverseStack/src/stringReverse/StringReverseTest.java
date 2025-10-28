package stringReverse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringReverseTest {

    @Test
    void testReverseNormalSentence() {
        String input = "Lap trinh Java su dung Stack";
        String expected = "Stack dung su Java trinh Lap";
        assertEquals(expected, StringReverse.reverseWords(input),
                "Chuỗi đảo ngược từ đúng thứ tự");
    }

    @Test
    void testReverseWithExtraSpaces() {
        String input = "   Hello   world   from   Java   ";
        String expected = "Java from world Hello";
        assertEquals(expected, StringReverse.reverseWords(input),
                "Phải bỏ khoảng trắng thừa và đảo đúng thứ tự");
    }

    @Test
    void testEmptyString() {
        assertEquals("", StringReverse.reverseWords("   "),
                "Chuỗi chỉ toàn khoảng trắng phải trả về rỗng");
    }

    @Test
    void testNullInput() {
        assertNull(StringReverse.reverseWords(null),
                "Null input nên trả về null, không lỗi");
    }

    @Test
    void testSingleWord() {
        assertEquals("Hello", StringReverse.reverseWords("Hello"),
                "Một từ duy nhất không bị thay đổi");
    }
}