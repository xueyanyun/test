package dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


interface CalculateProtocal {
	public int add(int a, int b);
	public int sub(int a, int b);
}


class Server implements CalculateProtocal {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int sub(int a, int b) {
		return a - b;
	}
	
}


class CalculatorHandler implements InvocationHandler {
	
	private Object objOriginal;	
	public CalculatorHandler(Object objOriginal) {
		this.objOriginal = objOriginal;
	}	

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		return method.invoke(this.objOriginal, args);
	}
	
}

public class DynamicProxyTest {
	public static void main(String[] args) {
		
		CalculateProtocal server = new Server();
		InvocationHandler hander = new CalculatorHandler(server);
		CalculateProtocal client = (CalculateProtocal)Proxy.newProxyInstance(server.getClass().getClassLoader(), server.getClass().getInterfaces(),hander );
		System.out.println(client.add(1, 1));
		System.out.println(client.sub(1, 1));
	}

}
