package EmailExample;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static EmailExample.EmailExample.EMAIL_REGEX;
import static org.junit.jupiter.api.Assertions.*;

class EmailExampleTest {

    private final EmailExample emailExample = new EmailExample();

    @Test
    @DisplayName("✅ Email hợp lệ")
    void testValidEmails() {
        String[] validEmails = {
                "a@gmail.com",
                "ab@yahoo.com",
                "abc@hotmail.com",
                "user.name+tag@gmail.com",
                "first.last@sub.domain.com",
                "user_name@domain.co.uk",
                "a@b.co",
                "123@123.io"
        };

        for (String email : validEmails) {
            assertTrue(emailExample.validate(email), "Sai khi kiểm tra email hợp lệ: " + email);
        }
    }

    @Test
    @DisplayName("❌ Email không hợp lệ")
    void testInvalidEmails() {
        String[] invalidEmails = {
                "@gmail.com",
                "ab@gmail.",
                "@#abc@gmail.com",
                ".start@domain.com",
                "end.@domain.com",
                "user..name@domain.com",
                "user@.com",
                "user@domain..com",
                "user@@domain.com",
                "user name@domain.com",
                "user@-domain.com",
                "user@domain-.com",
                "user@domain",
                "user@domain.c"
        };

        for (String email : invalidEmails) {
            assertFalse(emailExample.validate(email), "Sai khi kiểm tra email không hợp lệ: " + email);
        }
    }
}

