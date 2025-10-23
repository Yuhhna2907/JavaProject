package TriangleClassifier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {
    @Test
    void testEquilateralTriangle() {
        assertEquals("Tam giác đều", TriangleClassifier.classifyTriangle(2, 2, 2));
    }

    @Test
    void testIsoscelesTriangle() {
        assertEquals("Tam giác cân", TriangleClassifier.classifyTriangle(2, 2, 3));
    }

    @Test
    void testScaleneTriangle() {
        assertEquals("Tam giác thường", TriangleClassifier.classifyTriangle(3, 4, 5));
    }

    @Test
    void testInvalidTriangleCase1() {
        assertEquals("Không phải là tam giác", TriangleClassifier.classifyTriangle(8, 2, 3));
    }

    @Test
    void testInvalidTriangleCase2() {
        assertEquals("Không phải là tam giác", TriangleClassifier.classifyTriangle(-1, 2, 1));
    }

    @Test
    void testInvalidTriangleCase3() {
        assertEquals("Không phải là tam giác", TriangleClassifier.classifyTriangle(0, 1, 1));
    }
}