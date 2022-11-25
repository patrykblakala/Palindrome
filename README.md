# Palindrome

## Description

In this project I am creating and testing methods checking if a given String is a palindrom.

## Definition of a Palindrome

A palindrome is a word, phrase, number, or other sequences of characters which reads the same backward as forward, such as “madam” or “racecar”.

## Getting Started

In the project I have tested created methods using Junit unit-testing framework. In order to implement it first I added junit-jupiter dependency to my pom.xml file.

### Dependencies

```java
<dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>5.9.0</version>
        </dependency>
```

### Solutions of the problem

In the Palindrome class I created 3 different methods checking if a particular input is or contains one or many palindromes

In the first method I used a for loop:

```java  
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
```
In the second method I used a while loop:

```java
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
```
The last method takes as an input an Array of Strings and return a List of palindromes present in that array:

```java
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
```
Notice that in all of the above methods first I am checking if the input String is empty or String array length is zero accordingly:
```java
if (input.isEmpty()) {
            return false;
        }
```
```java
if (input.length == 0) {
            return Collections.emptyList();
        }
```
Also before checking that the particular input is a palindrome or contains a palindrome I process the input to ignore case sensitivity using .toLowerCase() method.
Also in order to remove spaces between words in the strings I use a replceAll() method which is accepting a regex pattern for a sequence that needs to replced and an empty String tas a replacement:

```java
String editedInput = input.replaceAll("\\s+", "").toLowerCase();
```
### Testing

For each othe methods I created a test checking if the method given an input that is a pilindrome will return true or if an input is an array of palindromes the method  will return a list of all palindromes in an array

I also use parameterized tests using @ParameterizedTest and  @CsvSource() annotations allowing me to test mny different inputs in one testing method:

```java
 @ParameterizedTest
    @CsvSource({"A", "a", "civic", "Level", "RaDaR","Taco cat", "Aibohphobia",
            "Was it a car or a cat I saw", "Too bad I hid a boot", "Mr Owl ate my metal worm"})
    @DisplayName("Given a palindrome input should return true")
    public void isPalindromeWhileTest_shouldReturnTrue(String input) {
        boolean result = Palindrome.isPalindromeWhile(input);
        assertTrue(result);
    }
 ```
## Author

## Patryk Blakala 

## Useful resources
[baeldung.com](https://www.baeldung.com/java-palindrome)

[geeksforgeeks.org](https://www.geeksforgeeks.org/java-program-to-check-whether-a-string-is-a-palindrome/)

[dictionary.com](https://www.dictionary.com/e/palindromic-word/)
