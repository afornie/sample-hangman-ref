package threads;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Competitor implements Runnable {

	public static final int NUM_THREADS = 2;

	public static final Object semaphore = new Object();

	public String check() {
		return Thread.currentThread() + " " + new Date();
	}
	public void compete() {
		for (int i = 0; i < 2; i++) {
			synchronized (semaphore) {
				System.out.println("Estoy corriendo, y voya dormir reteniendo el lock " + check());
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				System.out.println("Estoy corriendo, ahora me duermo y dejo a otro" + check());
			}
			System.out.println("Fin del bucle, espero un instante y vuelvo " + check());
		}
		System.out.println("He terminado " + check());
		try {
			Thread.sleep(200);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}

	public void run() {
		this.compete();
	}

	public static void main(String args[]) {
		List<Thread> threads = new ArrayList<Thread>();
		for (int i = 0; i < NUM_THREADS; i++) {
			threads.add(new Thread(new Competitor()));
		}
		for (int i = 0; i < NUM_THREADS; i++) {
			threads.get(i).start();
		}
	}
}
