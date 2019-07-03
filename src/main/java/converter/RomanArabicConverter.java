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

    private static String getRepeatingRomanNumber(int number) {
        List<RomanNumeral> romanNumerals = RomanNumeral.getReverseSortedValues();

        int i = 0;
        StringBuilder sb = new StringBuilder();

        while (number > 0 && i < romanNumerals.size()) {
            RomanNumeral currentSymbol = romanNumerals.get(i);
            if (currentSymbol.getValue() <= number) {
                sb.append(currentSymbol.name());
                number -= currentSymbol.getValue();
            } else {
                i++;
            }
        }
        return sb.toString();
    }

    private static String getDefaultRomanNumber() {
        return "";
    }
}
