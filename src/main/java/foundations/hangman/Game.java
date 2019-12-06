package foundations.hangman;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {

    private static final int NUMBER_OF_ALLOWED_GUESSES = 8;
    private static final List<String> WORDS = List.of("BUOY", "COMPUTER", "CONNOISSEUR", "DEHYDRATE", "FUZZY", "HUBBUB", "KEYHOLE", "QUAGMIRE", "SLITHER", "ZIRCON");

    private String word;
    private int numberOfGuessesLeft;
    private List<Character> foundLetters;

    public void play(){
        welcome();
        initialize();
        displayCurrentStateOfWord();
    }

    private void welcome() {
        System.out.println("Welcome to Hangman!");
    }

    private void initialize() {
        numberOfGuessesLeft = NUMBER_OF_ALLOWED_GUESSES;
        word = retrieveRandomWord();
        foundLetters = new ArrayList<>();
    }

    private String retrieveRandomWord() {
        return WORDS.get(new Random().nextInt(WORDS.size()));
    }

    private void displayCurrentStateOfWord() {
        for (char c : word.toCharArray()) {
            if (foundLetters.contains(c)) {
                System.out.print(c);
            } else {
                System.out.print("_");
            }
            System.out.print(" ");
        }
    }
}
