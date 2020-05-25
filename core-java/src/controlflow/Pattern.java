package controlflow;

public class Pattern {
public static void rightAngleTriangle() {
	int rc=5;//total row count
	int sc=1;//available column in first row
	for(int i=0;i<rc;i++) {
		for(int j=0;j<sc;j++) {
			System.out.print("*");
		}
		System.out.println();//for new line
		sc++;//increase column count by 1
	}
}
public static void triangle() {
	int rc=5;
	int bc=4;
	int sc=1;
	for(int i=0;i<rc;i++) {
		for(int j=0;j<bc;j++) {
			System.out.print(" ");
		}
		for(int k=0;k<sc;k++) {
			System.out.print("* ");
		}
		System.out.println();
		sc++;
		bc--;
	}
}
public static void main(String[] args) {
	//rightAngleTriangle();
	triangle();
}
}
