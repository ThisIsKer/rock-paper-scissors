import entities.GameSettings;
import interfaces.Choice;
import entities.Paper;
import entities.Rock;
import entities.Scissors;

import java.util.*;

public class GameRunner {

    private static final GameSettings gameSettings = GameSettings.getInstance();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Rock, Paper, Scissors!");

        boolean playAgain = true;
        while (playAgain) {
            System.out.println("Please make a choice: Rock, Paper, or Scissors.");
            Choice playerChoice = getPlayerChoice(scanner);
            Choice computerChoice = getComputerChoice(random);

            System.out.println("Computer chose: " + computerChoice.getDescription());

            System.out.println(determineWinner(playerChoice, computerChoice));

            playAgain = askToPlayAgain(scanner);
        }

        System.out.println("Thanks for playing!");

        try {
            scanner.close();
        } catch (IllegalStateException e) {
            System.out.println("Illegal state exception! While closing the scanner! That's pretty unusual.");
        }
    }

    private static Choice getPlayerChoice(Scanner scanner) {
        while (true) {
            try {
                String userInput = scanner.nextLine().trim().toLowerCase();
                if (gameSettings.getUserInputToChoices().containsKey(userInput)) {
                    return gameSettings.getUserInputToChoices().get(userInput);
                } else {
                    System.out.println("Invalid choice. Please choose Rock, Paper, or Scissors.");
                }
            } catch (NoSuchElementException | IllegalStateException e) {
                System.out.println("An error occurred with the input. Please try again.");
            }
        }
    }

    private static Choice getComputerChoice(Random random) {
        int index = random.nextInt(gameSettings.getChoices().length);
        return gameSettings.getChoices()[index];
    }

    private static String determineWinner(Choice playerChoice, Choice computerChoice) {
        try {
            if (playerChoice.equals(computerChoice)) {
                return "It's a tie!";
            }

            return playerChoice.winsAgainst(computerChoice) ? playerChoice.winMessage() : playerChoice.loseMessage();
        } catch (Exception e) {
            return "An error occurred while determining the winner.";
        }
    }

    private static boolean askToPlayAgain(Scanner scanner) {
        System.out.println("Do you want to play again? (yes/no)");
        while (true) {
            String input = scanner.nextLine().trim().toLowerCase();
            switch (input) {
                case "yes":
                    return true;
                case "no":
                    return false;
                default:
                    System.out.println("Please answer with 'yes' or 'no'.");
            }
        }
    }

}
