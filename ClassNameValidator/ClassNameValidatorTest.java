package ClassNameValidator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClassNameValidatorTest {
    @Test
    void testValidClassNames() {
        assertTrue(ClassNameValidator.isValidClassName("C0223G"));
        assertTrue(ClassNameValidator.isValidClassName("A0323K"));
        assertTrue(ClassNameValidator.isValidClassName("P1234H"));
        assertTrue(ClassNameValidator.isValidClassName("C0001I"));
    }

    @Test
    void testInvalidClassNames() {
        // Sai chữ cái đầu
        assertFalse(ClassNameValidator.isValidClassName("M0318G"));
        // Sai chữ cái cuối
        assertFalse(ClassNameValidator.isValidClassName("P0323A"));
        // Không đủ 4 chữ số
        assertFalse(ClassNameValidator.isValidClassName("C12K"));
        // Có ký tự đặc biệt
        assertFalse(ClassNameValidator.isValidClassName("P@123H"));
        // Thừa ký tự
        assertFalse(ClassNameValidator.isValidClassName("C02234G"));
        // Thiếu ký tự
        assertFalse(ClassNameValidator.isValidClassName("C223G"));
    }

}