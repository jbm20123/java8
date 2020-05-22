
public class ExecutionOrder {
static	{
		System.out.println("instance block7");
	}
	{
		System.out.println("static block3");
	}
	int a=m2();
	{
		System.out.println("instance block6");
	}
	int b=22;
	static int c=m4();
	static int d=m3();
	int e;
	{
		System.out.println("instance block1");
		System.out.println(b);
	}
	{
		System.out.println("instance block2");
		System.out.println(b);
		System.out.println(a);
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
		System.out.println("m3");
		System.out.println(d);
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
