package com.github.calebrw.PigLatin;

public class PigLatin {
    public void LatinMaker(String input) {
        char[] charArray = input.toCharArray();

        switch (charArray[0]) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(input);
        }
        System.out.println("This word starts with a consonant.");
    }
}
