package rock_paper_game;

/**
 * Created by will on 1/24/16.
 */
public class RockPaperScissors {

    // Main game controller. Keeps track of score totals and current round, calls playRound() for each round.
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

        result = humanWins > computerWins ? "You won this game human, but watch your back next time." : "HAHAHA, computer wins the game. Prepare to render tribute to your new robot overlords, human scum.";

        return result;

    }

    // Called for each individual round. Gets choices from human and computer and evaluates the winner.
    private String playRound() {

        String result = "";
        Choice computerChoice = Computer.getTurn();
        Choice humanChoice = Human.getInput();

        if(computerChoice.equals(humanChoice)) {
            result = "tie";
            System.out.println("Computer choice was " + computerChoice + ". " + "This round was a tie and will be repeated");
        } else {
            switch(computerChoice) {
                case ROCK: result = humanChoice.equals(Choice.PAPER) ? "Human" : "Computer";
                    break;
                case PAPER: result = humanChoice.equals(Choice.SCISSORS) ? "Human" : "Computer";
                    break;
                case SCISSORS: result = humanChoice.equals(Choice.ROCK) ? "Human" : "Computer";
                    break;
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
