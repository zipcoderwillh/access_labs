package rock_paper_game;

/**
 * Created by will on 1/24/16.
 */
public class Computer {

    public Choices getTurn() {

        Choices choice;
        int guess = (int)Math.ceil(Math.random() * 3);

        switch(guess) {
            case 1: choice = Choices.ROCK;
                break;
            case 2: choice = Choices.PAPER;
                break;
            case 3: choice = Choices.SCISSORS;
                break;
            default: choice = Choices.ERROR;
                break;
        }

        return choice;

    }

}
