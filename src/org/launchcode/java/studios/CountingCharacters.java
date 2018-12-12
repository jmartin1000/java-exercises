package org.launchcode.java.studios;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class CountingCharacters {
    public static void main(String[] args){
        int userOption;
        String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, " +
                "dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        String userPassage;
        String passage;
        char[] charactersInString;
        ArrayList<Character> counted = new ArrayList<>();
        HashMap<Character, Integer> counts = new HashMap<>();
        Scanner in = new Scanner(System.in);

        System.out.println("Choose Default Passage [1] or your own passage [2]");
        userOption = in.nextInt();
        in.nextLine();
        if (userOption == 1){
            userPassage = loremIpsum.toLowerCase();
        } else {
            System.out.println("Enter your passage: ");
            userPassage = in.nextLine();
        }

        passage = userPassage.toLowerCase();
        passage = passage.trim();
        charactersInString = passage.toCharArray();
        Arrays.sort(charactersInString);

        for (char character : charactersInString){
            //System.out.println("character:" + character);
            //System.out.println("counted.contains(character):" + counted.contains(character));
            if (!counted.contains(character) && Character.isAlphabetic(character) ) {
                int counter = 0;
                for (char thisCharacter : charactersInString) {
                    if (thisCharacter == character) {
                        counter++;
                        counted.add(thisCharacter);
                        counts.put(thisCharacter, counter);
                    }
                }
            }
        }

        System.out.println("Letter Count:");
        for (Map.Entry<Character, Integer> count : counts.entrySet()) {
            System.out.println("\t" + count.getKey() + ": " + count.getValue());
        }


    }
}
