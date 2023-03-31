package code_problems;

import java.util.ArrayList;
import java.util.List;

// https://www.codewars.com/kata/546e2562b03326a88e000020

public class SquareDigit {
    public int squareDigits(int n) {
        String value = String.valueOf(n);
        StringBuilder result = new StringBuilder();
        List<String> digits = new ArrayList<>(List.of(value.split("")));
        digits.forEach(digit -> result.append((int) Math.pow(Integer.parseInt(digit), 2)));
        return Integer.parseInt(result.toString());
    }

    public static void main(String[] args) {
        var sd = new SquareDigit();
        int randomNumber = (int) (Math.random() * 1000);
        int result = sd.squareDigits(randomNumber);
        System.out.println(randomNumber);
        System.out.println(result);
    }
}
