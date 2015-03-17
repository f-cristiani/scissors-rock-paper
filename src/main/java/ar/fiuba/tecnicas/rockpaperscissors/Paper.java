package ar.fiuba.tecnicas.rockpaperscissors;

public class Paper {

	public Paper vs(Rock rock) {
		return this;
	}

	public Paper vs(Paper paper) {
		return this;
	}

	public Scissors vs(Scissors scissors) {
		return scissors;
	}

}