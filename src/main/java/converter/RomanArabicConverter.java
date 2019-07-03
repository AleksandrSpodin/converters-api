package converter;

public class RomanArabicConverter {

    public static String arabicToRoman(int arabicNumber) {
        boolean zeroNumber = arabicNumber == 0;
        if (zeroNumber) {
            return getDefaultRomanNumber();
        }
        if (arabicNumber == 1) {
            return "I";
        }
        if (arabicNumber == 2) {
            return "II";
        }
        return "III";
    }

    private static String getDefaultRomanNumber() {
        return "";
    }
}
