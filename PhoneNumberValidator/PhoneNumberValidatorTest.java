package PhoneNumberValidator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneNumberValidatorTest {
    @Test
    void testValidPhoneNumbers() {
        assertTrue(PhoneNumberValidator.isValidPhoneNumber("(84)-(0978489648)"));
        assertTrue(PhoneNumberValidator.isValidPhoneNumber("(00)-(0123456789)"));
        assertTrue(PhoneNumberValidator.isValidPhoneNumber("(99)-(0987654321)"));
    }

    @Test
    void testInvalidPhoneNumbers() {
        // Có ký tự không phải số
        assertFalse(PhoneNumberValidator.isValidPhoneNumber("(a8)-(22222222)"));
        assertFalse(PhoneNumberValidator.isValidPhoneNumber("(84)-(22b22222)"));

        // Không bắt đầu bằng 0 sau dấu '-'
        assertFalse(PhoneNumberValidator.isValidPhoneNumber("(84)-(9978489648)"));

        // Thiếu dấu '-'
        assertFalse(PhoneNumberValidator.isValidPhoneNumber("(84)(0978489648)"));

        // Sai định dạng ngoặc
        assertFalse(PhoneNumberValidator.isValidPhoneNumber("84-(0978489648)"));
        assertFalse(PhoneNumberValidator.isValidPhoneNumber("(84)-0978489648"));

        // Thiếu hoặc thừa chữ số
        assertFalse(PhoneNumberValidator.isValidPhoneNumber("(84)-(097848964)"));
        assertFalse(PhoneNumberValidator.isValidPhoneNumber("(84)-(09784896489)"));
    }

}