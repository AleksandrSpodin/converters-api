package converter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanArabicConverterTest {

    @DisplayName("0 -> empty string")
    @Test
    void testConvertZeroToEmptyString() {
        String romanNumber = new RomanArabicConverter().arabicToRoman(0);
        assertEquals("", romanNumber);
    }

    @DisplayName("1 -> I")
    @Test
    void testConvertOneToI() {
        String romanNumber = new RomanArabicConverter().arabicToRoman(1);
        assertEquals("I", romanNumber);
    }

}