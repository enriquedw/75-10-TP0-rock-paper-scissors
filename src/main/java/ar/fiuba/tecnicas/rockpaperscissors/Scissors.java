package ar.fiuba.tecnicas.rockpaperscissors;

public class Scissors{

	public Rock vs(Rock aRock) {
		return aRock;
	}

	public Scissors vs(Paper aPaper) {
		return this;
	}

	public Scissors vs(Scissors aScissors) {
		return this;
	}

	
}
