package rock_paper_game;

import java.util.Scanner;

/**
 * Created by will on 1/24/16.
 */
public class Human {

    // Should really be private, but needs to be public for testing??
    public static Choice parseInput(String input) {

        Choice choice = null;

            switch (input) {
                case "r":
                    choice = Choice.ROCK;
                    break;
                case "p":
                    choice = Choice.PAPER;
                    break;
                case "s":
                    choice = Choice.SCISSORS;
                    break;
                default: choice = null;
                    break;
            }

        return choice;

    }

    // Called from RockPaperScissors to get human input and return as a Choice
    public static Choice getInput() {

        Choice finalChoice = null;
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Please make your choice ('r', 'p', or 's'): ");
            Choice input = parseInput(sc.nextLine());
            if(input != null) {
                finalChoice = input;
                break;
            }
            System.out.println("Invalid input, human. Make another amusing attempt to outwit me if you are capable.\n");
        }

        return finalChoice;

    }

}
