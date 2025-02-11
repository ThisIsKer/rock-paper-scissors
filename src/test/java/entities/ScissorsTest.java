package entities;

import org.junit.Test;

import static org.junit.Assert.*;

public class ScissorsTest {

    @Test
    public void losesAgainstRock() {
        Scissors scissors = new Scissors();
        Rock rock = new Rock();

        assertFalse(scissors.winsAgainst(rock));
    }

    @Test
    public void winsAgainstPaper() {
        Scissors scissors = new Scissors();
        Paper paper = new Paper();

        assertTrue(scissors.winsAgainst(paper));
    }
}