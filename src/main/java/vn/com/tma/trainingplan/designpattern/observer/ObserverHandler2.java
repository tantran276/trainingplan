package vn.com.tma.trainingplan.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverHandler2 implements Observer {
	String resp;

	@Override
	public void update(Observable o, Object arg) {
		if (arg instanceof String) {
			resp = (String) arg;
			System.out.println("\nReceived Response: " + resp);
		}
	}
}
