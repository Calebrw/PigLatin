package com.github.calebrw.PigLatin;

public class Main {

    public static void main(String[] args) {

        String[] array = {"pig", "latin", "banana", "trash", "happy", "duck", "dopest", "me", "too", "will", "moist",
                "wet", "real", "simple", "say", "bagel"};

        PigLatin pigLatin = new PigLatin();

        for (String item : array) {
            System.out.println(pigLatin.LatinMaker(item));
        }
    }
}
