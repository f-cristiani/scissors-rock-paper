package ar.fiuba.tecnicas.rockpaperscissors;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RockTest {
	
	private Rock rock = new Rock();
	private Scissors scissors = new Scissors();

    @Test
    public void rockBeatsScissors() {
        assertEquals(rock, rock.vs(scissors));
    }
	
    @Test
    public void rockTieWithRock() {
        assertEquals(rock, rock.vs(rock));
    }
    
    
}
