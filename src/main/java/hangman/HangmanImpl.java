package hangman;

public class HangmanImpl implements Hangman {

	public void newGame() {
		// Generamos la palabra a adivinar
		WordGenerator wordGenerator = new WordGeneratorImpl();
		String newWord = wordGenerator.generate();

		CharCounter charCounter = new CharCounterImpl();
		// Lee de teclado y ...
		charCounter.addChar(nuevo Char);
	}
}
