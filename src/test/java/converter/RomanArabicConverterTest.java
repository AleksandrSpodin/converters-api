package converter;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanArabicConverterTest {

    @DisplayName("0 -> empty string")
    @Test
    void testConvertZeroToEmptyString() {
        String romanNumber = convertToRoman(0);
        assertEquals("", romanNumber);
    }

    @DisplayName("1 -> I")
    @Test
    void testConvertOneToI() {
        String romanNumber = convertToRoman(1);
        assertEquals("I", romanNumber);
    }

    @DisplayName("2 -> II")
    @Test
    void testConvertTwoToII() {
        String romanNumber = convertToRoman(2);
        assertEquals("II", romanNumber);
    }

    private String convertToRoman(int arabicNumber) {
        return RomanArabicConverter.arabicToRoman(arabicNumber);
    }

}