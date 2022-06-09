package vn.com.tma.trainingplan.example.multithread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.locks.ReentrantLock;

public class Worker implements Runnable {

	String name;
	ReentrantLock re;

	public Worker(ReentrantLock re,String name) {
		this.name = name;
		this.re = re;
	}

	@Override
	public void run() {
		boolean done = false;
		while(!done) {
			boolean  ans = re.tryLock();
			if(ans) {
				try {
					Date d = new Date();
					SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");
					System.out.println("task name - " + name 
							+ " outer lock required at " + ft.format(d) 
							+ " Doing outer work");
					Thread.sleep(5000);
					re.lock();
					try {
                        d = new Date();
                        ft = new SimpleDateFormat("hh:mm:ss");
                        System.out.println("task name - " + name
                            + " inner lock acquired at " + ft.format(d)
                            + " Doing inner work");
                        System.out.println("Lock Hold Count - " 
                            + re.getHoldCount());
                        Thread.sleep(5000);
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    finally {
                        System.out.println(
                            "task name - " + name
                            + " releasing inner lock");
                        re.unlock();
                    }
					System.out.println("Lock Hold Count - " 
                    + re.getHoldCount());
					System.out.println("task name - " + name + " work done");
					done = true;
				} catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println( "task name - " + name
                        + " releasing outer lock");
                    re.unlock();
                    System.out.println("Lock Hold Count - "
                    + re.getHoldCount());
                }
			} else {
				System.out.println("task name - " + name + " waiting for lock");
				try {
						Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
