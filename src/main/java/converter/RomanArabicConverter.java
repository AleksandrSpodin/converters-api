package converter;

import java.util.List;

public class RomanArabicConverter {

    public static String arabicToRoman(int arabicNumber) {
        boolean zeroNumber = arabicNumber == 0;
        if (zeroNumber) {
            return getDefaultRomanNumber();
        }
        return getRepeatingRomanNumber(arabicNumber);
    }

    private static String getRepeatingRomanNumber(int arabicNumber) {
        List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();

        int i = 0;
        String romanNumber = "";

        for (RomanNumeral digit : romanNumerals) {
            while (arabicNumber >= digit.getValue()) {
                romanNumber += digit.name();
                arabicNumber -= digit.getValue();
            }
        }
        return romanNumber;
    }

    private static String getDefaultRomanNumber() {
        return "";
    }
}
