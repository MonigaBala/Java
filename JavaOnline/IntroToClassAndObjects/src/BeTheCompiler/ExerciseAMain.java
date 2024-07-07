package BeTheCompiler;

/**
 * Main class having object for the ExerciseA and initializing the fields and
 * invoking the methods.
 * 
 * @author Moniga
 */
public class ExerciseAMain {

	public static void main(String[] args) {
		ExerciseA song = new ExerciseA();
		song.artist = "The Beatles";
		song.title = "Come Together";
		song.play();
		song.printDetails();
	}

}
