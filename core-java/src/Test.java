import static java.lang.System.out;
public class Test {
	public static void main(String[] args) {
		Teacher teach = new Teacher();

		int age = teach.getAge();
		System.out.println(age);
		String name = teach.getName();
		System.out.println(name);
		String city = teach.getCity();
		System.out.println(city);
		int phno = teach.getPhno();
		System.out.println(phno);
		teach.printMessage();
	String result=	teach.saveData(123,"sneha",567,"bhopal","mp",4567,34);
	System.out.println(result);
	Address add=teach.getAddress();
	System.out.println(add.hno);
	System.out.println(add.city);
	System.out.println(add.state);
	out.println(add.phno);
    }
	}

