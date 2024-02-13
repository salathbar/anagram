package org.example;

import java.util.Arrays;

public class StringUtils {

    public static String removeAllSpecialCharacters(String input){
        return input.replaceAll("[-+.:^,;']","");
    }

    public static String removeAllDigits(String input) {
        return input.replaceAll("\\d","");
    }
    public static String removeAllWhiteSpaces(String input){
        return input.replaceAll("\\s", "");
    }

    public static String allLettersToLowerCase(String input){
        return input.toLowerCase();
    }

    public static char[] sortStringToCharArray(String input) {
        String noSpecialChars = removeAllSpecialCharacters(input);
        String noDigits = removeAllDigits(noSpecialChars);
        String noWhiteSpaces = removeAllWhiteSpaces(noDigits);
        String onlyLowerCase = allLettersToLowerCase(noWhiteSpaces);
        char[] result = onlyLowerCase.toCharArray();
        Arrays.sort(result);
        return result;
    }
}
