package vn.com.tma.trainingplan.example.multithread;

public class SynchronizedCounter {

	private int c = 0;

	public synchronized void increment() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        c++;
    }

    public synchronized void decrement() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        c--;
    }

    public synchronized int value() {
        return c;
    }
}
