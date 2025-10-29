package BracketChecker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketCheckerTest {
    @Test
    void testValidExpressions() {
        assertTrue(BracketChecker.isValidExpression("(a+b)*(c-d)"));
        assertTrue(BracketChecker.isValidExpression("[{()}]"));
        assertTrue(BracketChecker.isValidExpression("((a+b)/c) - {d*e}"));
    }

    @Test
    void testInvalidExpressions() {
        assertFalse(BracketChecker.isValidExpression("(a+b]*(c-d)"));
        assertFalse(BracketChecker.isValidExpression("(a+b"));
        assertFalse(BracketChecker.isValidExpression("a+b)"));
        assertFalse(BracketChecker.isValidExpression("{[a+b]*c"));
    }

    @Test
    void testEmptyAndEdgeCases() {
        assertTrue(BracketChecker.isValidExpression(""));
        assertTrue(BracketChecker.isValidExpression("a+b-c"));
    }
}