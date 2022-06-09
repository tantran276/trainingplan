package vn.com.tma.trainingplan.example.multithread;

public class Counter {

	private int c = 0;

	public void increment() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        c++;
    }

    public void decrement() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        c--;
    }

    public int value() {
        return c;
    }
}
