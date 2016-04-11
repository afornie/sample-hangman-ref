package hangman;

import java.util.List;

public interface CharCounter {

	// Agregar metodos que hagan lo que yo nocesito
	public void addChar(Character c);
	
	// Busca Java Generics
	// Puedes usar una List a secas, pero es mejor
	// usar una List<Char> de modo que se sepa que trata solo con Chars
	/**
	 * Nos devuelve los Chars que el usuario ha introducido hasta ahora
	 * @return
	 */
	public List<Character> getCurrentChars();
}
