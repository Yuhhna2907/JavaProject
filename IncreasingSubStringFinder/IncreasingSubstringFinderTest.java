package IncreasingSubStringFinder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncreasingSubstringFinderTest {
    @Test
    public void testNormalString() {
        assertEquals("Welo", IncreasingSubstringFinder.findLongestIncreasingSubstring("Welcome"));
    }

    @Test
    public void testAllIncreasing() {
        assertEquals("abcdef", IncreasingSubstringFinder.findLongestIncreasingSubstring("abcdef"));
    }

    @Test
    public void testAllSame() {
        assertEquals("a", IncreasingSubstringFinder.findLongestIncreasingSubstring("aaaaaa"));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", IncreasingSubstringFinder.findLongestIncreasingSubstring(""));
    }

    @Test
    public void testMixedString() {
        assertEquals("abcz", IncreasingSubstringFinder.findLongestIncreasingSubstring("abczaybcd"));
    }
}
