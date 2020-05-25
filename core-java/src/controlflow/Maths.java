package controlflow;

public class Maths {
	int a;
	int b;
	int sum;
	int c;
	int d;
	int minus;
	int e;
	int f;
	int into;
	int x;
	int remainder;
	int y=0;
int add(int a,int b) {
	sum=a+b;
	return sum;
	
}
int substraction(int c,int d) {
	minus=c-d;
	return minus;
}
int multiplication(int e,int f) {
	into=e*f;
	return into;
}
void divisibility(int x) {
	if(x%2==0) {
	  System.out.println("the number is divisible by 2");
	}
	else {
		System.out.println("the number is not divisible by 2");
	}
}
 
public static void main(String[]args) {
	Maths m=new Maths();
	int none=m.add(24,45);
	System.out.println(none);
	int none1=m.substraction(67,45);
	System.out.println(none1);
	int none2=m.multiplication(7,8);
	System.out.println(none2);
    m.divisibility(37);
}
}
