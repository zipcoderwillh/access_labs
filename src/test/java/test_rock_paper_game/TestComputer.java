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

        for(int i = 0; i < 1000000; i++){
            assertFalse(Computer.getTurn().equals(Choice.ERROR));
        }

    }

}
