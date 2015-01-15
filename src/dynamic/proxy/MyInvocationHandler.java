package dynamic.proxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Subject {
	 public String say(String name, int age);
	
}

class RealSubject implements Subject {

	@Override
	public String say(String name, int age) {
		return "hello";
	}	
}

public class MyInvocationHandler implements InvocationHandler {
	private Object obj;
	public Object bind(Object obj) {
		this.obj = obj;
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);

	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		return method.invoke(this.obj, args);
	}
	
	public static void main(String[] args) {
		MyInvocationHandler handler = new MyInvocationHandler();
		Subject sub = (Subject)handler.bind(new RealSubject());
		System.out.println(sub.say("xxx", 10));
		
	}
	

}

 
 

