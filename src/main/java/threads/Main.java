package threads;

import java.util.ArrayList;
import java.util.List;


public class Main {

	public static final int NUM_THREADS = 40;

	public static void main(String args[]) {
		List<Thread> threads = new ArrayList<Thread>();
		for (int i = 0; i < NUM_THREADS; i++) {
			Thread t = new Thread(new Car());
			threads.add(t);
			t.start();
		}

		// Cuando todos los hilos acaben, cuenta los winners
		for (int i = 0; i < NUM_THREADS; i++) {
			try {
				threads.get(i).join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Un hilo ha acabado");
		}
		System.out.println("Los que creen ser ganadores son " + Car.numWinners);
	}

	public static void mainEjemplillo(String args[]) {
		System.out.println("A punto de crear un hilo " + Thread.currentThread());
		new MiHilo().start();
		new MiHilo().start();
		// ATENTO : No crea hilo, llama a run directo en el mismo hilo
		new MiHilo().run();
		System.out.println("Hilo creado");
	}
}

class MiHilo extends Thread {
	public void run() {
		System.out.println("Estamos en run " + Thread.currentThread());
	}
}
