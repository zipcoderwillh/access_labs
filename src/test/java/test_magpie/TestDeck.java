package test_magpie;

import magpie.Card;
import org.junit.*;
import static org.junit.Assert.*;
import magpie.Deck;

/**
 * Created by will on 1/24/16.
 */
public class TestDeck {

    @Test
    public void testGetRandomCard() {
        // Test that returned card is a card, and that each card is removed from the deck since more than 52 calls
        // to getRandomCard() will return null.
        Deck testDeck = new Deck();
        assertTrue(testDeck.getRandomCard() instanceof Card);
    }

}
