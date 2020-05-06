
public class Java {
	// types of variables
	static int a;
	 int b;
	char ch;
	float f;
	{
		System.out.println("i am instance block");
		a=30;
		b=40;
	}
	static {
		System.out.println("i am static ");
		a=20;
//b=50; we cannot access instance variable in static context means aastha cannot serve before her birth
		/**use of static block:- 
		 * 1) to initialise static variables
		 * 2)static block is related to class
		 * use of instance block:-
		 * 1)to initialise instance variable
		 * 2)instance block is related to object 
		 * 
		 * 
		 * **/
	}

}
