package entities;

import org.junit.Test;

import static org.junit.Assert.*;

public class RockTest {

    @Test
    public void losesAgainstPaper() {
        Rock rock = new Rock();
        Paper paper = new Paper();

        assertFalse(rock.winsAgainst(paper));
    }

    @Test
    public void winsAgainstScissors() {
        Rock rock = new Rock();
        Scissors scissors = new Scissors();

        assertTrue(rock.winsAgainst(scissors));
    }
}