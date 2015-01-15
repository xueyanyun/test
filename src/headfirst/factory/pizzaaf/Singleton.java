package headfirst.factory.pizzaaf;

//public class Singleton {
//	private static Singleton instance = null;
//	private Singleton() {
//		
//	}
//	
//	public static Singleton getInstance() {
//		if(instance == null){
//			instance = new Singleton();
//		}
//		return instance;
//	}
//}
//
//但是以上实现没有考虑线程安全问题。
//所谓线程安全就是：如果你的代码所在的进程中有多个线程在同时运行，而这些线程可能会同时运行这段代码。
//如果每次运行结果和单线程运行的结果是一样的，而且其他的变量的值也和预期的是一样的，就是线程安全的
//一个类或者程序所提供的接口对于线程来说是原子操作或者多个线程之间的切换不会导致该接口的执行结果存在二义性,也就是说我们不用考虑同步的

//class Singleton{
//	public static String staticString;
//	String nameString;
//	int number;
//	public String getNameString() {
//		return nameString;
//	}
//	public int getNumber() {
//		return number;
//	}
//}

//public class Singleton{
//	private static Singleton instance = null;
//	private Singleton(){
//		
//	}
//	//getInstance()加上同步锁，一个线程必须等待另外一个线程创建完成后才能使用这个方法，这就保证了单例的唯一性。
//	public static synchronized Singleton getIntance() {
//		if(null == instance){
//			instance = new Singleton();
//		}
//		return instance;		
//	}
//}
//synchronized修饰的同步块可是要比一般的代码段慢上几倍的！

//原因就是检测null的操作和创建对象的操作分离了。如果这两个操作能够原子地进行，那么单例就已经保证
//public class Singleton{
//	private static Singleton instance = null;
//	
//	private Singleton(){
//		
//	}
//	
//	public static Singleton getIntance() {
//		synchronized (Singleton.class) {
//			if(instance == null){
//				instance = new Singleton();
//			}			
//		}
//		
//		return instance;		
//	}
//}



public class Singleton{
	private static Singleton instance = null;
	
	private Singleton(){		
	}
	
	public static Singleton getIntance() {		
		if(instance == null){
			synchronized (Singleton.class) {
				if(instance == null)
					instance = new Singleton();
			}			
		}		
		return instance;		
	}
}