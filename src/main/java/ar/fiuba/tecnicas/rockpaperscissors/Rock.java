package ar.fiuba.tecnicas.rockpaperscissors;

public class Rock{
	
	public Rock vs(Rock aRock) {
		return aRock;
	}

	public Paper vs(Paper aPaper) {
		return aPaper;
	}

	public Rock vs(Scissors aScissors) {
		return this;
	}

}
