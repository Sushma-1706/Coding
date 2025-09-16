import java.util.Scanner;
public class Enhanced_Mini_Quiz_Game_with_Exception_Handling {
    public static void main(String[] args) {
        // Declare variables
        String playerName;
        int score = 0;
        String answer;

        Scanner input = new Scanner(System.in);

        try {
            // Ask for player's name
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

            // Question 2 (integer input example)
            System.out.println("Q2: How many continents are there on Earth?");
            System.out.print("Your answer (number): ");
            int continents = input.nextInt();
            if(continents == 7) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Oops! The correct answer is 7.\n");
            }

        } catch (Exception e) {
            // Catch any exception and display a friendly message
            System.out.println("An error occurred: " + e.getMessage());
            System.out.println("Please restart the program and enter valid input.");
        } finally {
            // Close the Scanner in all cases
            input.close();
        }

        System.out.println("Your final score is: " + score + " out of 2.");
    }
}
