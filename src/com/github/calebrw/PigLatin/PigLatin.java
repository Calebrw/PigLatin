package com.github.calebrw.PigLatin;

public class PigLatin {
    public void LatinMaker(String input) {
        char[] charArray = input.toCharArray();

        if (!isVowel(charArray[0])) {
            System.out.println("This word starts with a consonant.");
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
