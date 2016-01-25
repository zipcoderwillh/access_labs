package rock_paper_game;

/**
 * Created by will on 1/24/16.
 */
public class Computer {

    public static Choice getTurn() {

        Choice choice = null;
        int guess = (int)Math.ceil(Math.random() * 3);

        switch(guess) {
            case 1: choice = Choice.ROCK;
                break;
            case 2: choice = Choice.PAPER;
                break;
            case 3: choice = Choice.SCISSORS;
                break;
        }

        return choice;

    }

}
