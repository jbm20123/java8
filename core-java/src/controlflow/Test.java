package controlflow;

public class Test {
	public static void main(String[] args) {
		Student st=new Student(456,"sneha",8,80,75);
	boolean valid=Validator.isEligible(st);
	if(valid) {
		System.out.println(st.getName()+" is eligible");
	}
	else {
		System.out.println(st.getName()+" is not eligible");
	}
	Calculator cl=new Calculator();
	double percentage = cl.calculatePercentage(325,500);
	System.out.println(percentage);
	}

}
