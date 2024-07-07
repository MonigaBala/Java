package BeTheCompiler;

/**
 * Main class with the object of ExerciseB and own variables and invoking the
 * methods.
 * @author Moniga
 */
public class ExerciseBMain {

	public static void main(String[] args) {

		ExerciseB episode = new ExerciseB();

		episode.seriesNumber = 4;
		episode.skipIntro();
		episode.skipToNext();
	}

}
