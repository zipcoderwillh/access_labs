package rock_paper_game;

import java.util.Scanner;

/**
 * Created by will on 1/24/16.
 */
public class Human {

    // Should really be private, but needs to be public for testing??
    public Choices parseInput(String input) {

        Choices choice = null;

            switch (input) {
                case "r":
                    choice = Choices.ROCK;
                    break;
                case "p":
                    choice = Choices.PAPER;
                    break;
                case "s":
                    choice = Choices.SCISSORS;
                    break;
                default: choice = null;
                    break;
            }

        return choice;

    }

    public Choices getInput() {

        Choices finalChoice = null;
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Please make your choice ('r', 'p', or 's'): ");
            Choices input = parseInput(sc.nextLine());
            if(input != null) {
                finalChoice = input;
                break;
            }
            System.out.println("Invalid input, human. Make another amusing attempt to outwit me if you are capable.\n");
        }

        return finalChoice;

    }

}
