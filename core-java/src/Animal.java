
public class Animal {
static void m1() {
	System.out.println("m1");
}
static String m2(String name) {
	return name;
}
static float m3(int a,float b,char ch) {
return 5.5f;	
}
static String m4(String type,int f,double d,String t,long g) {
	return "i am aastha";
}
public static void main(String[] args) {
	Animal obj=new Animal();
	int o=obj.m5(10,1);
	System.out.println(o);//10
	obj.m1();
	Animal.m1();//m1
	String name=Animal.m2("aastha");
	System.out.println(name);//aastha
	float b=Animal.m3(10,5.3f,'a');
	System.out.println(b);//5.5
	String aastha=Animal.m4("dog",5,6.5,"swarna",6);
	System.out.println(aastha);//i am aastha
}
int m5(int s,int i) {
	return 10;
}

}
