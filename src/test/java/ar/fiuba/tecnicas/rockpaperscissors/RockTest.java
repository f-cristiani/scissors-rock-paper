package ar.fiuba.tecnicas.rockpaperscissors;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RockTest {
	
	private Rock rock = new Rock();
	private Scissors scissors = new Scissors();
	private Paper paper = new Paper();

    @Test
    public void rockBeatsScissors() {
        assertEquals(rock, rock.vs(scissors));
    }
    
    @Test
    public void rockLostWithPaper() {
        assertEquals(paper, rock.vs(paper));
    }    
	
    @Test
    public void rockTieWithRock() {
        assertEquals(rock, rock.vs(rock));
    }
}
