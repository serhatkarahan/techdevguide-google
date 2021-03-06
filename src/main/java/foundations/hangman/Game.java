package foundations.hangman;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Game {

    private static final int NUMBER_OF_ALLOWED_GUESSES = 8;
    private static List<String> WORDS = new ArrayList<>();
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
            printCurrentState();
            String guess = retrieveGuess(sc);
            char guessAsUpperCaseChar = guess.toUpperCase().charAt(0);
            if (lettersRemainingInWord.contains(guessAsUpperCaseChar)) {
                System.out.println("That guess is correct!");
                foundLetters.add(guessAsUpperCaseChar);
                lettersRemainingInWord.remove(guessAsUpperCaseChar);
            } else if (foundLetters.contains(guessAsUpperCaseChar)) {
                System.out.println("You already guessed that letter!");
            } else {
                System.out.println("There are no " + guess + "'s in that word.");
                numberOfGuessesLeft--;
            }
        }
        finishGame();
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
        try {
            Path path = Paths.get("src/main/java/foundations/hangman/HangmanLexicon.txt");
            BufferedReader bufferedReader = Files.newBufferedReader(path);
            String word;
            while ((word = bufferedReader.readLine()) != null) {
                WORDS.add(word);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return WORDS.get(new Random().nextInt(WORDS.size()));
    }

    private void printCurrentState() {
        System.out.println("The word now looks like this: " + retrieveCurrentStateOfWord());
        System.out.println("You have " + numberOfGuessesLeft + " guesses left.");
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

    private String retrieveGuess(Scanner sc) {
        System.out.print("Your guess: ");
        String guess = sc.next();
        while (isNotLetter(guess)) {
            System.out.println("Your guess is not valid, please enter a letter!");
            System.out.print("Your guess: ");
            guess = sc.next();
        }
        return guess;
    }

    private boolean isNotLetter(String s) {
        return s.length() != 1 || !Character.isLetter(s.charAt(0));
    }

    private void finishGame() {
        if (lettersRemainingInWord.isEmpty()) {
            System.out.println("Congratulations, you found the word! The word was: " + word);
            System.out.println("You win!");
        } else {
            System.out.println("Sorry, you have used all of your guesses! The word was: " + word);
            System.out.println("You lose!");
        }
    }
}
