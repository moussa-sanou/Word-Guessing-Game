
public class App {

    public static void main(String[] args) {

        String[] words = {"java", "programming", "class", "computer", "method"};
        WordguessingGame game = new WordguessingGame(words, 10);
        game.play();
    }
}
