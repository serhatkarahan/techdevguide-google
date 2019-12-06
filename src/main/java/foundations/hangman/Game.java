package foundations.hangman;

import java.util.List;
import java.util.Random;

public class Game {

    private static final int NUMBER_OF_ALLOWED_GUESSES = 8;
    private static final List<String> WORDS = List.of("BUOY", "COMPUTER", "CONNOISSEUR", "DEHYDRATE", "FUZZY", "HUBBUB", "KEYHOLE", "QUAGMIRE", "SLITHER", "ZIRCON");

    private String word;
    private int numberOfGuessesLeft;

    public void play(){
        welcome();
        initialize();
    }

    private void welcome() {
        System.out.println("Welcome to Hangman!");
    }

    private void initialize() {
        numberOfGuessesLeft = NUMBER_OF_ALLOWED_GUESSES;
        word = retrieveRandomWord();
    }

    private String retrieveRandomWord() {
        return WORDS.get(new Random().nextInt(WORDS.size()));
    }
}
