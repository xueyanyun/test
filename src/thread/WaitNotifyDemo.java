package thread;

public class WaitNotifyDemo {
	public static void main(String[] args) throws InterruptedException {
		Object obj = new Object();
		Object lock = new Object();
		synchronized (lock) {
			obj.wait();
			obj.notifyAll();
		}
		
	}
	

}
