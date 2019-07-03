package converter;

public class RomanArabicConverter {

    public static String arabicToRoman(int arabicNumber) {
        boolean zeroNumber = arabicNumber == 0;
        if (zeroNumber) {
            return getDefaultRomanNumber();
        }
        if (arabicNumber==1) {
            return "I";
        }
        return "II";
    }

    private static String getDefaultRomanNumber() {
        return "";
    }
}
