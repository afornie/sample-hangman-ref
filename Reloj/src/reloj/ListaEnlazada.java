package reloj;

public class ListaEnlazada {

	public Nodo primerNodo = new Nodo();

	public static void main(String args[]) {
		ListaEnlazada lista = new ListaEnlazada();
		lista.primerNodo.value = "A";
		
		lista.primerNodo.next = new Nodo();
		lista.primerNodo.next.value = "B";
		
		Nodo tercer = new Nodo();
		tercer.value = "C";
		lista.primerNodo.next.next = tercer;
		
		Nodo iterador = lista.primerNodo;
		while (iterador != null) {
			System.out.println(iterador.value);
			iterador = iterador.next;
		}
	}

	public void agregaNodo(String nuevoValor) {
		
		this.primerNodo.value = nuevoValor;
		
	}

	public void agregaNodo(String nuevoValor, int posicion) {
		
	}

	// Lista enlazada vs Lista estatica o array

	// git init
	// git add MiPrimerArchivo
	// git commit -m "Esto lo hice yo"
	// git add archivoQueMeMandaAnto1
	// git add archivoQueMeMandaAnto2
	// git add archivoQueMeMandaAnto3
	// git commit -m "Esto me lo manda anto"
	// git log
	// ...esto te dice tus commits, que deben ser 2
}
