package thread;


class MyThread implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName() + "run-->" + i);
		}
		
	}
}

public class ThreadJoinDemo {
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		
		Thread t1 = new Thread(thread, "线程1");
		t1.start();
		
		Thread t2 = new Thread(thread, "线程2");
		t2.start();
		
		for (int i = 0; i < 50; i++) {
			if (i > 10) {
				try {
					t1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			System.out.println("main 线程运行-->" +i);
		}
			
	}

}
