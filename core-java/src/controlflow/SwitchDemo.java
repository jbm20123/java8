package controlflow;

public class SwitchDemo {
	byte d=70;
	//d=80;//compile time error
	{
		int i=10;
		i=30;
	}
	public static void main(String[] args) {
		byte a = 50;
		a=60;
	final	byte b=10;
	final	byte c=20;//compile time constant
	long f=10;
//	switch(a);//compilation error
	switch(a) {}
		switch (a) {
		default: System.out.println("nothing");
		case b: {
			System.out.println("aastha");
			System.out.println("shrivastava");
			break;
		}
		case c: {
			System.out.println("prateeksha");
			System.out.println("shrivastava");
			break;
		}
		case 60: {
			System.out.println("swarna");
			System.out.println("shrivastava");
			break;
		}
		case 40: {
			System.out.println("sneha");
			System.out.println("shrivastava");
			break;
		}
		}
	}
}
