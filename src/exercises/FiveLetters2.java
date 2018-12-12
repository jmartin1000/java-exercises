package exercises;
import java.util.ArrayList;

public class FiveLetters2 {
    public static void main(String[] args){
        String[] someWords = {"booz", "mio", "cark", "gibli", "irazu", "stipe", "eddic", "helga", "rsr", "cutup", "yap",
                "doura", "daisy", "kayak", "flash", "moron", "bird", "duple", "chaos", "duper"};
        ArrayList<String> words = new ArrayList<>();
        for (String someWord: someWords){
            if (someWord.length() == 5){
                words.add(someWord);
            }
        }
        for (String word: words){
            System.out.println(word);
        }
    }
}
