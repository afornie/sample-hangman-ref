package reloj;

public class ListaEnlazada {

	public Nodo primerNodo = new Nodo();
	

public void agregaNodo(String nuevoValor) {
		 Nodo nuevoNodo = new Nodo(); // Istancio un nuevo nodo para poder 
		 //ponerlo al final de la lista
		 nuevoNodo.value = nuevoValor; //Le asigno el valor que me da el usuario
		 
		 Nodo aux = primerNodo;
		 
		 while(aux != null && aux.next != null){
			 aux = aux.next;
		 }
			 aux.next = nuevoNodo; // pongo el nuevo nodo al final de la lista
			 
	}

public void agregaNodo(String nuevoValor, int posicion) {
	
}

	public static void main(String args[]) {
		ListaEnlazada lista = new ListaEnlazada();
		lista.primerNodo.value = "A";
		
		lista.primerNodo.next = new Nodo();
		lista.primerNodo.next.value = "B";
		
		Nodo tercer = new Nodo();
		tercer.value = "C";
		lista.primerNodo.next.next = tercer;
		
		lista.agregaNodo("D");
		
		Nodo iterador = lista.primerNodo;
		while (iterador != null) {
			System.out.println(iterador.value);
			iterador = iterador.next;
		}
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
