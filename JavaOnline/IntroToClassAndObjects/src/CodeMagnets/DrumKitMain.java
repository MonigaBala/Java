package CodeMagnets;

/**
 * Main class with object for DrumKit and the given output is done with the
 * mixed blocks of code.
 * @author Moniga
 */
public class DrumKitMain {

	public static void main(String[] args) {

		DrumKit drumkit = new DrumKit();

		if (drumkit.snare == true) {
			drumkit.playSnare();
		}

		drumkit.snare = false;
		drumkit.playSnare();
		drumkit.playTopHat();

	}

}
