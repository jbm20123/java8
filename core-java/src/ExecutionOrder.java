
public class ExecutionOrder {
	{
		System.out.println("instance block7");
	}
	static{
		System.out.println("static block3");
	}
	int a=m2();
	{
		System.out.println("instance block6");
	}
	int b;
	static int c=m3();
	static int d=60;
	{
		System.out.println("instance block1");
		System.out.println(a);
	}
	{
		System.out.println("instance block2");
		System.out.println(b);
	}
	static {
		System.out.println("static block1");
		System.out.println(c);
	}
	static {
		System.out.println("static block 2");
		System.out.println(d);
	}

	void m1() {
		System.out.println("m1");
	}

	int m2() {
		System.out.println("m2");
		System.out.println(a);
		return 10;
	}

	static int m3() {
		System.out.println("swarna gadhi");
		System.out.println(c);
		return 20;
	}
	static {
		System.out.println("static block5");
	}

	static int m4() {
		System.out.println("m4");
		return 30;
	}

	public ExecutionOrder() {
		System.out.println("constructor");
	}
	{
		System.out.println("instance block5");
	}

	public static void main(String[] args) {
		System.out.println("start");
		new ExecutionOrder();
		System.out.println("finish");

	}
	static {
		System.out.println("static block4");
	}
	{
		System.out.println("instance block3");
	}
}
