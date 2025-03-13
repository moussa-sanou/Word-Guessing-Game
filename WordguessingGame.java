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

        Scanner scanner = new Scanner(System.in);
        boolean userHasWon = false;


        while (attempts > 0 && !userHasWon)
        {
            displayState();
            System.out.println("You have " + attempts + " attempts left...");
            System.out.println("Guess a letter: ");

            char guess = scanner.nextLine().toLowerCase().charAt(0);

            if (processGuess(guess))
            {
                System.out.println("Your guess is correct");
                if (new String(guessedLetters).equals(wordToGuess))
                {
                    System.out.println("Correct guess you win");
                    userHasWon = true;
                }
            } else
            {
                System.out.println("Incorrect guess!");
                attempts--;
            }


        }
        if (!userHasWon)
        {
            System.out.println("You are out of guesses you lose");
        }
    }

    // Create a method that will check if a character is present in our list
    private boolean processGuess(char letter)
    {
        boolean letterFound = false;
        for (int i = 0; i < wordToGuess.length(); i++)
        {
            if (wordToGuess.charAt(i) == letter)
            {
                guessedLetters[i] = letter;
                letterFound = true;
            }
        }
        return letterFound;
    }

    // Create a new method to display the user choices if they're correct
    private void displayState(){
        System.out.println("Guessed Letters to find the hidden word: " + new String(guessedLetters));
    }

}
