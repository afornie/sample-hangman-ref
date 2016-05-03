package threads;

public class Car implements Runnable {
	public static Thread winner;
	public static int numWinners;

	public void declareWinner() {
		numWinners++;
		System.out.println("WINNER!!");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		winner = Thread.currentThread();
	}

	public void startRace() {
		for (int i = 0; i < 30; i++) {
			System.out.println("Progressing in thread " + 
		        Thread.currentThread() + " and iteration " + i);
		}
		if (winner == null) {
			this.declareWinner();
		}
		System.out.println("He acabado " + Thread.currentThread());
	}

	public void run() {
		this.startRace();
	}
}
