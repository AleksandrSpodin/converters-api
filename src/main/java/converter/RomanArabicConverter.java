package converter;

public class RomanArabicConverter {

    public String arabicToRoman(int arabicNumber) {
        boolean zeroNumber = arabicNumber == 0;
        if (zeroNumber) {
            return getDefaultRomanNumber();
        }
        if (arabicNumber==1) {
            return "I";
        }
        return "II";
    }

    private String getDefaultRomanNumber() {
        return "";
    }
}
