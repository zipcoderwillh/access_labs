package test_rock_paper_game;

import org.junit.*;
import static org.junit.Assert.*;
import rock_paper_game.*;

/**
 * Created by will on 1/24/16.
 */
public class TestComputer {

    @Test
    public void testGetTurn() {

        // Test that getTurn return a valid Choice
        assertTrue(Computer.getTurn() instanceof Choice);


    }

}
