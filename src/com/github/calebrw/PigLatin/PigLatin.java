package com.github.calebrw.PigLatin;

import java.util.Arrays;

public class PigLatin {
    public void LatinMaker(String input) {
        char[] charArray = input.toCharArray();
        int arrayLength = charArray.length;

        if (!isVowel(charArray[0])) {
            char[] charArray2 = Arrays.copyOfRange(charArray, 1, arrayLength);

            System.out.println(String.valueOf(charArray2) + charArray[0] + "ay");
        }

    }

    private Boolean isVowel(char c){
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
