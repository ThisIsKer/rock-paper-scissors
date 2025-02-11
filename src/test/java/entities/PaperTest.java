package entities;

import org.junit.Test;

import static org.junit.Assert.*;

public class PaperTest {

    @Test
    public void losesAgainstScissors() {
        Scissors scissors = new Scissors();
        Paper paper = new Paper();

        assertFalse(paper.winsAgainst(scissors));
    }

    @Test
    public void winsAgainstRock() {
        Rock rock = new Rock();
        Paper paper = new Paper();

        assertTrue(paper.winsAgainst(rock));
    }
}