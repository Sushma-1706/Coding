import java.util.Scanner;
public class Mini_Quiz_Game {
    public static void main(String[] args) {
        // Variables
        String playerName;
        int score = 0;
        String answer;

        // Scanner for input
        Scanner input = new Scanner(System.in);

        // Welcome message
        System.out.print("Enter your name: ");
        playerName = input.nextLine();
        System.out.println("Welcome to the Mini Quiz, " + playerName + "!\n");

        // Question 1
        System.out.println("Q1: What is the capital of France?");
        System.out.print("Your answer: ");
        answer = input.nextLine();
        if(answer.equalsIgnoreCase("Paris")) {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Oops! The correct answer is Paris.\n");
        }

        // Question 2
        System.out.println("Q2: How many continents are there on Earth?");
        System.out.print("Your answer: ");
        answer = input.nextLine();
        if(answer.equals("7")) {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Oops! The correct answer is 7.\n");
        }

        // Question 3
        System.out.println("Q3: What programming language is this quiz written in?");
        System.out.print("Your answer: ");
        answer = input.nextLine();
        if(answer.equalsIgnoreCase("Java")) {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Oops! The correct answer is Java.\n");
        }

        // Final Score
        System.out.println(playerName + ", your final score is: " + score + " out of 3.");

        // Close Scanner
        input.close();
    }
}
