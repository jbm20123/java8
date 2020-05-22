
public class Teacher {
	String saveData(int id, String name, int hno, String city, String state, int phno, int age) {
		System.out.println(id);
	System.out.println(name);
	System.out.println(hno);
	System.out.println(city);
	System.out.println(state);
	System.out.println(phno);
	System.out.println(age);
		return "data saved";

	}
Address getAddress(){
	return new Address();
}
int getAge(){
	return 10;
}
String getName() {
	return "sneha";
}
String getCity() {
	return "bhopal";
}
int getPhno() {
	return 67890;
}
void printMessage(){
	System.out.println("print message");
}
}
class Address{
	static int hno=123;
	static String city="bhopal";
	static String state="madhya pradesh";
	static int phno=6234566;
}







