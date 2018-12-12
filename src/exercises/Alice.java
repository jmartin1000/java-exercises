package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        String excerpt = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        String phrase;
        Scanner in = new Scanner(System.in);
        Boolean result;

        System.out.println("Enter a substring to search for in the passage:");
        phrase = in.next();
        phrase = phrase.toLowerCase();
        excerpt = excerpt.toLowerCase();
        result = excerpt.contains(phrase);
        System.out.println(result);
    }
}
