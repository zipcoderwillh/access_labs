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

        // Test that input returns correct enum value
        assertTrue(Human.parseInput("r").equals(Choice.ROCK));
        assertTrue(Human.parseInput("p").equals(Choice.PAPER));
        assertTrue(Human.parseInput("s").equals(Choice.SCISSORS));
        assertTrue(Human.parseInput("n") == null);

    }

}
