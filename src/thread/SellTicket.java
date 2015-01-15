package thread;

public class SellTicket implements Runnable {
	private int ticket = 5;

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			if (ticket > 0) {
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("卖票： ticket=" + ticket-- + Thread.currentThread().getName());
			
			}
		}
	}
	
	
	public static void main(String[] args) {
		SellTicket ticket = new SellTicket();
		new Thread(ticket).start();
		new Thread(ticket).start();
		new Thread(ticket).start();
	}

}
