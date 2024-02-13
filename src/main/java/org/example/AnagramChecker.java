package org.example;

import java.util.*;

public class AnagramChecker {

    Map<String, Set<String>> anagramMap = new HashMap<>();

    private void checkKey(String key) throws IllegalArgumentException {
        if (key.isEmpty()) {
            throw  new IllegalArgumentException("Empty string cannot be used as key for the anagramMap!");
        }
    }

    // procedure to update the anagramMap attribute
    private void addToAnagramMap(String key, String value) throws IllegalArgumentException {
        checkKey(key);
        Set<String> currentSet = this.anagramMap.get(key);
        if (currentSet == null) {
            currentSet = new HashSet<>();
            if (!value.isEmpty()) {
                currentSet.add(value);
            }
            this.anagramMap.put(key, currentSet);
        } else {
            if (!value.isEmpty()) {
                currentSet.add(value);
                this.anagramMap.replace(key, currentSet);
            }
        }
    }

    // solutions to the first exercise
    public boolean isAnagram(String string1, String string2) {
        char[] a1 = StringUtils.sortStringToCharArray(string1);
        char[] a2 = StringUtils.sortStringToCharArray(string2);

        boolean isAnagramVar = Arrays.equals(a1, a2);

        // we need this to persist the data for this run,
        // so we can later return anagrams for a given string input
        if (isAnagramVar) {
            addToAnagramMap(string1, string2);
            addToAnagramMap(string2, string1);
        } else {
            addToAnagramMap(string1, "");
            addToAnagramMap(string2, "");
        }

        return isAnagramVar;

    }

    // returns all prior tested anagrams for input string
    // solution for second exercise
    public List<String> getAllKnownAnagrams(String input){
        Set<String> knownAnagrams = this.anagramMap.get(input);
        List<String> result = new ArrayList<>();
        if (!knownAnagrams.isEmpty()) {
            result.addAll(knownAnagrams);
        }
        return result;
    }


}
