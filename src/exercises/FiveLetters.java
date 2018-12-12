package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class FiveLetters {
    public static void main(String[] args){
        String[] someWords = {"booz", "mio", "cark", "gibli", "irazu", "stipe", "eddic", "helga", "rsr", "cutup", "yap",
                "doura", "daisy", "kayak", "flash", "moron", "bird", "duple", "chaos", "duper"};
        ArrayList<String> words = new ArrayList<>(Arrays.asList(someWords));
        for (String word:words){
            if (word.length() == 5) {
                System.out.println(word);
            }
        }
    }
}

