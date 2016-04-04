package hangman2;

import java.util.ArrayList;
import java.util.Scanner;

public class HangmanGame {

	public int attempts = 0;
	
	public ArrayList matches = new ArrayList();

	public Scanner keyboard = new Scanner(System.in);

	public String goal = "destornillador";

	public String readFromKeyboard() {
		return keyboard.nextLine();
	}

	public void getChar() {
		attempts++;
		matches.add(readFromKeyboard().charAt(0));
	}

	public String mask(String goal2) {
		String masked = "";
		for(int i = 0; i < goal.length(); i++) {
			if (matches.contains(goal.charAt(i))) {
				masked = masked + goal.charAt(i);
			} else {
				masked = masked + "?";
			}
		}
		return masked;
	}

	public void newRound() {
		// Pedir input de usuario
		getChar();

		// Procesar el input : ver si acierta, actualizar el "contador"
		

		// Mostrar resultado hasta ahora
		System.out.println("La palabra que buscas es " + goal);
		System.out.println("Tu avance es " + mask(goal));
	}

	public boolean isGameOver() {
		return false;
	}

	/**
	 * Esto empieza la partida y engloba toda la funcionalidad
	 */
	public void start() {
		while(!isGameOver()) {
			// Nuevo turno
			newRound();
		}
	}

	
}
