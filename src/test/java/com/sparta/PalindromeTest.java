package com.sparta;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @ParameterizedTest
    @CsvSource({"A", "a", "civic", "Level", "RaDaR","Taco cat", "Aibohphobia",
            "Was it a car or a cat I saw", "Too bad I hid a boot", "Mr Owl ate my metal worm"})
    @DisplayName("Given a palindrome input should return true")
    public void isPalindromeForTest_shouldReturnTrue(String input) {
        boolean result = Palindrome.isPalindromeFor(input);
        assertTrue(result);
    }

    @ParameterizedTest
    @CsvSource({"Hello", "Adam", "What is your name?", "Abradada", "Hooooo!!!", "sssdddrrr", "Testing for a palindrome", "Jonathan", "Good mornig"})
    @DisplayName("Given a palindrome input should return false")
    public void isPalindromeForTest_shouldReturnFalse(String input) {
        boolean result = Palindrome.isPalindromeFor(input);
        assertFalse(result);
    }

    @Test
    @DisplayName("Given an empty String should return false")
    public void isPalindromeFor() {
        String input = "";
        boolean result = Palindrome.isPalindromeFor(input);
        assertFalse(result);
    }

    @ParameterizedTest
    @CsvSource({"A", "a", "civic", "Level", "RaDaR","Taco cat", "Aibohphobia",
            "Was it a car or a cat I saw", "Too bad I hid a boot", "Mr Owl ate my metal worm"})
    @DisplayName("Given a palindrome input should return true")
    public void isPalindromeWhileTest_shouldReturnTrue(String input) {
        boolean result = Palindrome.isPalindromeWhile(input);
        assertTrue(result);
    }

    @ParameterizedTest
    @CsvSource({"Hello", "Adam", "What is your name?", "Abradada", "Hooooo!!!", "sssdddrrr", "Testing for a palindrome", "Jonathan", "Good mornig"})
    @DisplayName("Given a palindrome input should return false")
    public void isPalindromeWhileTest_shouldReturnFalse(String input) {
        boolean result = Palindrome.isPalindromeWhile(input);
        assertFalse(result);
    }

    @Test
    @DisplayName("Given an empty String should return false")
    public void isPalindromeWhileTest() {
        String input = "";
        boolean result = Palindrome.isPalindromeFor(input);
        assertFalse(result);
    }

    @Test
    @DisplayName("Given a String array input should return list of palindromes")
    public void isPalindromeArrayTest_shouldReturnTrue() {
        String[] input = {"A", "a", "civic", "Level", "RaDaR","Taco cat", "Aibohphobia",
                "Was it a car or a cat I saw", "Too bad I hid a boot", "Mr Owl ate my metal worm"};
        List<String> expected = Arrays.asList("A", "a", "civic", "Level", "RaDaR","Taco cat", "Aibohphobia",
                "Was it a car or a cat I saw", "Too bad I hid a boot", "Mr Owl ate my metal worm");
        List<String> result = Palindrome.isPalindromeArray(input);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Given a String array input should return an empty list")
    public void isPalindromeArrayTest_shouldReturnFalse() {
        String[] input = {"Hello", "Adam", "What is your name?", "Abradada", "Hooooo!!!", "sssdddrrr", "Testing for a palindrome", "Jonathan", "Good mornig"};
        List<String> expected = new ArrayList<>();
        List<String> result = Palindrome.isPalindromeArray(input);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Given an empty String[] should return false")
    public void isPalindromeArrayTest_ShouldReturnFalse() {
        String[] input = {};
        List<String> expected = new ArrayList<>();
        List<String> result = Palindrome.isPalindromeArray(input);
        assertEquals(expected, result);
    }

}