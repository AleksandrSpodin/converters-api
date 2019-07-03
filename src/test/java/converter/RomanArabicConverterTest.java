package converter;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanArabicConverterTest {

    @ParameterizedTest
    @CsvSource(value = {"0:''", "1:I", "2:II", "3:III", "5:V"}, delimiter = ':')
    void testConvertArabicToRoman(int input, String expected) {
        String romanNumber = convertToRoman(input);
        assertEquals(expected, romanNumber);
    }

    private String convertToRoman(int arabicNumber) {
        return RomanArabicConverter.arabicToRoman(arabicNumber);
    }

}