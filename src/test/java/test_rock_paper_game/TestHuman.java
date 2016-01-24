package test_rock_paper_game;

import org.junit.*;
import static org.junit.Assert.*;
import rock_paper_game.*;

/**
 * Created by will on 1/24/16.
 */
public class TestHuman {

    @Test
    public void testGetChoice() {

        Human testHuman = new Human();
        assertTrue(testHuman.parseInput("r").equals(Choices.ROCK));
        assertTrue(testHuman.parseInput("p").equals(Choices.PAPER));
        assertTrue(testHuman.parseInput("s").equals(Choices.SCISSORS));
        assertTrue(testHuman.parseInput("n") == null);

    }

}
