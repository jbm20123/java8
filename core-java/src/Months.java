
public class Months {
	static transient int a;
	String namesOfMonths;
	
	String m1(String s,float f,double d) {
 return"adf";
}

	static String m2(long l) {
		return "febraury";
	}

	public static void main(String[] args) {
		Months mon = new Months();
		System.out.println(Months.a);
		System.out.println(mon.namesOfMonths);
		String y = mon.m1("tiya", 80.9f, 9.0);
		System.out.println(y);
		String h = Months.m2(10);
		System.out.println(h);
	}
}
