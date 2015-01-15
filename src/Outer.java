
//public class Outer {
//	private String info = "hello world";
//	class Inner {
//		public void print() {
//			System.out.println(info);
//		}
//	};
//	public void fun() {
//		new Inner().print();
//	}
//	
//	
//	public static void main(String[] args) {
//		new Outer().fun();
//	}
//}


class Outer{
	private String info = "hello world";
	public String getInfo() {
		return info;
	}
	public void fun(){
		new Inner(this).print();
	}
}
class Inner {
	private Outer out = null;
	public Inner(Outer out) {
		this.out = out;
	}
	public void print()  {
		System.out.println(out.getInfo());
	}
}
