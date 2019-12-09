package foundations.hangman;

import java.util.*;
import java.util.stream.Collectors;

public class Game {

    private static final int NUMBER_OF_ALLOWED_GUESSES = 8;
    private static final List<String> WORDS = List.of("BUOY", "COMPUTER", "CONNOISSEUR", "DEHYDRATE", "FUZZY", "HUBBUB", "KEYHOLE", "QUAGMIRE", "SLITHER", "ZIRCON");
    public static final String DASH = "_";

    private String word;
    private int numberOfGuessesLeft;
    private Set<Character> foundLetters;
    private Set<Character> lettersRemainingInWord;

    public void play() {
        welcome();
        initialize();
        Scanner sc = new Scanner(System.in);
        while (!lettersRemainingInWord.isEmpty() && numberOfGuessesLeft > 0) {
            System.out.println("The word now looks like this: " + retrieveCurrentStateOfWord());
            System.out.println("You have " + numberOfGuessesLeft + " guesses left.");
            System.out.print("Your guess: ");
            String guess = sc.next();
            char guessAsUpperCaseChar = guess.toUpperCase().charAt(0);
            if (lettersRemainingInWord.contains(guessAsUpperCaseChar)) {
                System.out.println("That guess is correct!");
                foundLetters.add(guessAsUpperCaseChar);
                lettersRemainingInWord.remove(guessAsUpperCaseChar);
            } else if (foundLetters.contains(guessAsUpperCaseChar)) {
                System.out.println("You already guessed that letter!");
                numberOfGuessesLeft--;
            } else {
                System.out.println("There are no " + guess + "'s in that word.");
                numberOfGuessesLeft--;
            }
        }
        if (lettersRemainingInWord.isEmpty()) {
            System.out.println("Congratulations, you found the word! The word was: " + word);
            System.out.println("You win!");
        } else {
            System.out.println("Sorry, you have used all of your guesses! The word was: " + word);
            System.out.println("You lose!");
        }
    }

    private void welcome() {
        System.out.println("Welcome to Hangman!");
    }

    private void initialize() {
        numberOfGuessesLeft = NUMBER_OF_ALLOWED_GUESSES;
        word = retrieveRandomWord();
        foundLetters = new HashSet<>();
        lettersRemainingInWord = word.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toSet());
    }

    private String retrieveRandomWord() {
        return WORDS.get(new Random().nextInt(WORDS.size()));
    }

    private String retrieveCurrentStateOfWord() {
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (foundLetters.contains(c)) {
                sb.append(c);
            } else {
                sb.append(DASH);
            }
        }
        return sb.toString();
    }
}
