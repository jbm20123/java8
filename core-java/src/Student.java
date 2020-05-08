
public class Student {
	int age=16;
	int id=123;
	String name="vivek";
	void read() {
	System.out.println("I am reading a book");
	}
	void speak() {
	System.out.println("I can speak english");
	}
	String getName(){
		return name;
		
	}
	void setName(String sname){
    name=sname;		
	}
	int setData(int sage,String sname,int sid){
		 age=sage;
		name=sname;
	return	id=sid;
	}
	public static void main(String[]args) {
		Student student=new Student();
		System.out.println(student.name);
		
	}
}