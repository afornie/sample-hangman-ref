package hangman;

import ejemploherencia.Animal;
import ejemploherencia.Entrenador;
import ejemploherencia.Galgo;
import ejemploherencia.Perro;

/**
 * Hello world!
 *
 */
public class App {
    public static void oldMain( String[] args ) {
    	Entrenador entrenador = new Entrenador();
    	Animal animal = new Galgo();
    	entrenador.entrena(animal);
    	animal = new Perro();
    	entrenador.entrena(animal);
    }

    public static void main( String[] args ) {
    }
}
