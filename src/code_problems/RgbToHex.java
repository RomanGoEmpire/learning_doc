package code_problems;

// https://www.codewars.com/kata/513e08acc600c94f01000001/
public class RgbToHex {

    public static String rgb(int r, int g, int b) {
        return convertNumberToHex(r) + convertNumberToHex(g) + convertNumberToHex(b);
    }

    public static String convertNumberToHex(int number) {
        if (number < 0) return "00";
        if (number < 9) return "0" + number;
        if (number > 255) return "FF";

        int secondDigit = number / 16;
        int remainder = secondDigit == 0 ? number : number - secondDigit * 16;
        return decToHex(secondDigit) + decToHex(remainder);
    }

    public static String decToHex(int number) {
        if (number == 10) return "A";
        if (number == 11) return "B";
        if (number == 12) return "C";
        if (number == 13) return "D";
        if (number == 14) return "E";
        if (number == 15) return "F";
        return "" + number;
    }

    public static void main(String[] args) {
        System.out.println(rgb(255, 255, 255));
    }
}

