package code_problems;

import java.util.ArrayList;
import java.util.List;

/*
Welcome. In this kata, you are asked to square every digit of a number and concatenate them.

For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1. (81-1-1-81)

Example #2: An input of 765 will/should return 493625 because 72 is 49, 62 is 36, and 52 is 25. (49-36-25)

Note: The function accepts an integer and returns an integer.
Happy Coding!
 */


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
