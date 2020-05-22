package datatype;

public class LossOfValue {
public static void main(String[]args) {
	int a=140;
	byte b=(byte)a;
	System.out.println(b);
	byte c=(byte)0b11111111;
	System.out.println(c);
}
}
