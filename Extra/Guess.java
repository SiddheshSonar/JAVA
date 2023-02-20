import java.util.*;
import java.util.Random;

class Game {
    Random rand = new Random();
    int guess;
    int noguess = 1;

    public Game() {
        guess = rand.nextInt(100);
    }

    int takeUserInput() {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter your guess (1-100) - ");
        num = sc.nextInt();
        return num;
    }

    int isCorrectNumber(int num) {
        if (num == guess) {
            System.out.println("\nBingo! Your guess is correct!");
            System.out.println("Number of guesses taken " + noguess);
            return 1;
        } else if (num > guess) {
            System.out.println("Its lower than that!");
            noguess++;
            return 0;
        } else if (num < guess) {
            System.out.println("Its higher than that!");
            noguess++;
            return 0;
        } else {
            return 0;
        }
    }
}

public class Guess {
    public static void main(String[] args) {
        int input, ans = 0;
        Game gm = new Game();
        while (ans != 1) {
            input = gm.takeUserInput();
            ans = gm.isCorrectNumber(input);
        }
    }
}
