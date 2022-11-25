package com.sparta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Palindrome {

    public static boolean isPalindromeFor(String input) {
        if (input.isEmpty()) {
            return false;
        }
        String editedInput = input.replaceAll("\\s+", "").toLowerCase();
        for (int i = 0; i < editedInput.length() / 2; i++) {
            if (editedInput.charAt(i) != editedInput.charAt(editedInput.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromeWhile(String input) {
        if (input.isEmpty()) {
            return false;
        }

        String editedInput = input.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = editedInput.length() - 1;

        while (left < right) {
            if (editedInput.charAt(left) != editedInput.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static List<String> isPalindromeArray(String[] input) {
        if (input.length == 0) {
            return Collections.emptyList();
        }
        List<String> result = new ArrayList<>();
        for (String s : input) {
            s.replaceAll("\\s+", "").toLowerCase();
            if (isPalindromeFor(s)) {
                result.add(s);
            }
        }
        return result;
    }
}
