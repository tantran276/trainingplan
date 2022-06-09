package vn.com.tma.trainingplan.example.multithread;

public class ThreadDemo {
	
	public static void main(String[] args) {
		
//		NonSynchronized
//		Counter counter = new Counter();
		
//		Synchronized
		SynchronizedCounter counter = new SynchronizedCounter();
		
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				while(counter.value() < 10) {
					counter.increment();
					System.out.println(counter.value());
				}
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				while(counter.value() < 10) {
					counter.increment();
					System.out.println(counter.value());
				}
			}
		});
		thread1.start();
		thread2.start();
		try {
			System.out.println("Begin count");
			thread1.join();
			thread2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Count End");
	}
}
