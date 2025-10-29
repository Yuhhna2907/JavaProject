package DecimalToBinaryConverter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecimalToBinaryConverterTest {

    @Test
    void testConvertToBinary() {
        assertEquals("11110", DecimalToBinaryConverter.convertToBinary(30));
        assertEquals("1010", DecimalToBinaryConverter.convertToBinary(10));
        assertEquals("1", DecimalToBinaryConverter.convertToBinary(1));
        assertEquals("0", DecimalToBinaryConverter.convertToBinary(0));
        assertEquals("11111111", DecimalToBinaryConverter.convertToBinary(255));
    }
}