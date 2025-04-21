package nl.tudelft.ontesting.examples.blackjack;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BlackJackLineCoverageTest {
    @Test
    public void testBothCardsValid() {
        BlackJack b = new BlackJack();
        assertEquals(10, b.play(10, 5));
    }

    @Test
    public void testLeftCardBust() {
        BlackJack b = new BlackJack();
        assertEquals(5, b.play(22, 5));
    }
}