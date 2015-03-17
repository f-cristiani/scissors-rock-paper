package ar.fiuba.tecnicas.rockpaperscissors;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PaperTest {
	
	private Paper paper = new Paper();
	private Rock rock = new Rock();

    @Test
    public void paperBeatsRock() {
        assertEquals(paper, paper.vs(rock));
    }
    
    @Test
    public void paperTieWithPaper() {
        assertEquals(paper, paper.vs(paper));
    }    
}
