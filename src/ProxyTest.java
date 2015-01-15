interface Network {	
	public void browse();	
}

interface Drink {
	public void drink();
}

class Real implements Network,Drink {
	@Override
	public void browse() {
		System.out.println("I'm browsing");		
	}

	@Override
	public void drink() {
		System.out.println("I'm drinking");
		
	}	
}

class Proxy implements Network,Drink {
	private Network network;
	private Drink drink;
	public Proxy(Network network,Drink drink) {
		this.network = network;
		this.drink = drink;
	}

	@Override
	public void browse() {
		check();
		this.network.browse();
		
	}
	
	public void check() {
		System.out.println("check");
	}

	@Override
	public void drink() {
		this.drink.drink();
		
	}
	
}



public class ProxyTest {
	public static void main(String[] args) {		
		Proxy proxy = new Proxy(new Real(),new Real());
		proxy.browse();
		proxy.drink();		
	}
}
