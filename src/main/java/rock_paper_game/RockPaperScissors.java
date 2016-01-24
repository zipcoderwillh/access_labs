package rock_paper_game;

/**
 * Created by will on 1/24/16.
 */
public class RockPaperScissors {

    private String playGame() {

        String result = "";
        int roundCount = 1;
        int computerWins = 0;
        int humanWins = 0;

        while(roundCount < 4) {
            System.out.println("-------\nROUND " + roundCount + "\n-------");
            String thisRound = playRound();
            if(thisRound.equals("tie")) {
                continue;
            }
            else if(thisRound.equals("Human")) {
                humanWins++;
                roundCount++;
            } else {
                computerWins++;
                roundCount++;
            }
        }

        result = humanWins > computerWins ? "You won this game human, but watch your back next time." : "HAHAHA, computer wins the game. Prepare to render tribute to your new robot overlords.";

        return result;

    }

    private String playRound() {

        String result = "";
        Choices computerChoice = new Computer().getTurn();
        Choices humanChoice = new Human().getInput();

        if(computerChoice.equals(humanChoice)) {
            result = "tie";
            System.out.println("Computer choice was " + computerChoice + ". " + "This round was a tie and will be repeated");
        } else {
            if (computerChoice.equals(Choices.ROCK)) {
                result = humanChoice.equals(Choices.PAPER) ? "Human" : "Computer";
            } else if (computerChoice.equals(Choices.PAPER)) {
                result = humanChoice.equals(Choices.SCISSORS) ? "Human" : "Computer";
            } else if (computerChoice.equals(Choices.SCISSORS)) {
                result = humanChoice.equals(Choices.ROCK) ? "Human" : "Computer";
            }
            System.out.println("Computer choice was " + computerChoice + ". " + result + " wins this round\n");
        }

        return result;

    }

    public static void main(String[] args) {

        RockPaperScissors game = new RockPaperScissors();
        System.out.println(game.playGame());

    }

}
