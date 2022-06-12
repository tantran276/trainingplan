package vn.com.tma.trainingplan.designpattern.observer;

public class ObserverPatternDemo {
	public static void main(String[] args) {
        System.out.println("Enter Text >");
 
        // create an event source - reads from stdin
        final EventSource eventSource = new EventSource();
 
        // create first observer
        final ObserverHandler1 ObserverHandler1 = new ObserverHandler1();
 
        // subscribe the observer to the event source
        eventSource.addObserver(ObserverHandler1);
        
        
        // create second observer
        final ObserverHandler2 ObserverHandler2 = new ObserverHandler2();
 
        // subscribe the observer to the event source
        eventSource.addObserver(ObserverHandler2);
 
        // starts the event thread
        Thread thread = new Thread(eventSource);
        thread.start();
    }
}
