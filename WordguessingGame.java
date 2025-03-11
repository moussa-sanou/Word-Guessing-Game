import java.util.*;

public class WordguessingGame {

    // Create some members variables for this class
    private String wordToGuess;
    private char[] guessedLetters;
    private int attempts;

    // Create a constructor with an array for the list of word to guess and max attp
    public WordguessingGame(String[] wordList, int maxAttempts)
    {
        Random rand = new Random();
        this.wordToGuess = wordList[rand.nextInt(wordList.length)];
        this.guessedLetters = new char[this.wordToGuess.length()];
        for (int i = 0; i < this.guessedLetters.length; i++)
        {
            this.guessedLetters[i] = '_';
        }
        this.attempts = maxAttempts;
    }

    // Create a method to play the game
    public void play()
    {
        System.out.println("The word is: " + wordToGuess);
        Scanner scanner = new Scanner(System.in);

        while (attempts > 0)
        {
            System.out.println("You have " + attempts + " attempts left...");
            System.out.println("Guess a letter: ");

            attempts--;
        }
    }

}
