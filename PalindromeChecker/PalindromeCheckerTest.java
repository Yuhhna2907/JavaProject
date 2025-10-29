package PalindromeChecker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {

    @Test
    void testPalindromeBasic() {
        assertTrue(PalindromeChecker.isPalindrome("Able was I ere I saw Elba"));
        assertTrue(PalindromeChecker.isPalindrome("Madam"));
        assertTrue(PalindromeChecker.isPalindrome("A man a plan a canal Panama"));
    }

    @Test
    void testNotPalindrome() {
        assertFalse(PalindromeChecker.isPalindrome("Hello World"));
        assertFalse(PalindromeChecker.isPalindrome("Java"));
    }

    @Test
    void testEmptyAndNull() {
        assertFalse(PalindromeChecker.isPalindrome(""));
        assertFalse(PalindromeChecker.isPalindrome(null));
    }
}