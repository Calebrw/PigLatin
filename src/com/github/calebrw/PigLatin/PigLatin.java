package com.github.calebrw.PigLatin;

import java.util.Arrays;

/**
 * PigLatin class
 * <p>
 * ::LatinMaker translates a word into Pig Latin
 */
public class PigLatin {

    /**
     * Translate a word into Pig Latin
     *
     * @param input The word to translate.
     * @return The translated word.
     */
    public String LatinMaker(String input) {
        char[] charArray = input.toCharArray();
        int arrayLength = charArray.length;

        String result;

        if (!isVowel(charArray[0])) {
            char[] charArray2 = Arrays.copyOfRange(charArray, 1, arrayLength);

            if (!isVowel(charArray2[0])) {
                String newString = String.valueOf(charArray2) + charArray[0];
                result = LatinMaker(newString);
                return result;
            }

            result = String.valueOf(charArray2) + charArray[0] + "ay";
        } else {
            result = input;
        }

        return result;
    }

    /**
     * Determine whether a character is a vowel or not
     *
     * @param c The character to check
     * @return true if a vowel
     */
    private Boolean isVowel(char c) {
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
        }
        return false;

    }
}
