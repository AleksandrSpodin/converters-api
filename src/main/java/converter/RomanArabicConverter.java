package converter;

public class RomanArabicConverter {

    public String arabicToRoman(int arabicNumber) {
        boolean zeroNumber = arabicNumber == 0;
        if (zeroNumber) {
            return getDefaultRomanNumber();
        } else {
            return "I";
        }
    }

    private String getDefaultRomanNumber() {
        return "";
    }
}
