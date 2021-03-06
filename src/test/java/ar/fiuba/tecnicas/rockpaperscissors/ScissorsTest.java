package ar.fiuba.tecnicas.rockpaperscissors;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScissorsTest {
	
	private Scissors scissors = new Scissors();
	private Paper paper = new Paper();
	private Rock rock = new Rock();

    @Test
    public void scissorsBeatsPaper() {
        assertEquals(scissors, scissors.vs(paper));
    }
    
    @Test
    public void scissorsLostWithRock() {
        assertEquals(rock, scissors.vs(rock));
    }    
	
    @Test
    public void scissorsTieWithScissors() {
        assertEquals(scissors, scissors.vs(scissors));
    }
}
