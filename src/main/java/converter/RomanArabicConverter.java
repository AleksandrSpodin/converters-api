package converter;

public class RomanArabicConverter {

    public static String arabicToRoman(int arabicNumber) {
        boolean zeroNumber = arabicNumber == 0;
        if (zeroNumber) {
            return getDefaultRomanNumber();
        }
        return getRepeatingRomanNumber(arabicNumber);
    }

    private static String getRepeatingRomanNumber(int arabicNumber) {
        String romanNumber = "";
        while (arabicNumber >= 1) {
            romanNumber += "I";
            arabicNumber--;
        }
        return romanNumber;
    }

    private static String getDefaultRomanNumber() {
        return "";
    }
}
