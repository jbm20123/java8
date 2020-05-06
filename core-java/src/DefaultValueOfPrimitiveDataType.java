//when you declare a variable then compiler initialize that variable with their default value
public class DefaultValueOfPrimitiveDataType {
byte b;
short s;
int i;
long l;
float f;
double d;
boolean bo;
char ch;
String str;
public static void main(String[]args) {
	DefaultValueOfPrimitiveDataType type=new DefaultValueOfPrimitiveDataType();
	System.out.println(type.b);	//0
	System.out.println(type.s); //0
	System.out.println(type.i); //0
	System.out.println(type.l); //0
	System.out.println(type.f); //0.0
	System.out.println(type.d); //0.0
	System.out.println(type.bo); //false
	System.out.println(type.ch); //a blank space
	System.out.println(type.str); //null
}
}

