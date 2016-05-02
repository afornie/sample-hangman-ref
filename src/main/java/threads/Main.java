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
	}
}
