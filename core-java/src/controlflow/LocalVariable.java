package controlflow;

public class LocalVariable {
	int d=40;
public static void main(String[]args) {
	int a=10;
	System.out.println(a);
}
public void m1(int i) {
	System.out.println(i);
	{
		int a=20;
		System.out.println(a);
		System.out.println(i);
	}
	//System.out.println(a);
}
}
