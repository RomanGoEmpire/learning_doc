package code_problems;

import java.util.*;

// https://www.codewars.com/kata/5279f6fe5ab7f447890006a7/train/java
public class PickPeaks {

    public static Map<String, List<Integer>> getPeaks(int[] arr) {

        var indexes = new ArrayList<Integer>();
        var peak = new ArrayList<Integer>();
        var checked = new ArrayList<Integer>();

        for (int i = 1; i < arr.length - 1; i++) {
            if (checked.contains(i)) continue;

            ArrayList<Integer> left = checkNeighbor(arr, new ArrayList<>(), i, -1, 0);
            if (left == null) continue;

            ArrayList<Integer> right = checkNeighbor(arr, new ArrayList<>(), i, 1, arr.length - 1);
            if (right == null) continue;

            if (left.size() > 1 || right.size() > 1) {
                checked.addAll(left);
                checked.addAll(right);
            }
            indexes.add(i);
            peak.add(arr[i]);
        }
        var result = new HashMap<String, List<Integer>>();
        result.put("pos", indexes);
        result.put("peaks", peak);
        return result;
    }

    public static ArrayList<Integer> checkNeighbor(int[] arr, ArrayList<Integer> checked, int index, int direction, int end) {
        if (index == end || arr[index] < arr[index + direction]) {
            return null;
        }
        checked.add(index);
        if (arr[index] == arr[index + direction]) {
            return checkNeighbor(arr, checked, index + direction, direction, end);
        } else return checked;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 1, 2, 2, 2, 2};
        System.out.println(getPeaks(numbers));
    }
}
