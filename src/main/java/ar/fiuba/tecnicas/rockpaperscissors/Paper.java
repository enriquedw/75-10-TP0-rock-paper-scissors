package ar.fiuba.tecnicas.rockpaperscissors;

public class Paper{

	public Paper vs(Rock aRock) {
		return this;
	}

	public Paper vs(Paper aPaper) {
		return this;
	}

	public Scissors vs(Scissors aScissors) {
		return aScissors;
	}
}
