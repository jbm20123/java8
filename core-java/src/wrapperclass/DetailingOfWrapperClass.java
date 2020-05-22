package wrapperclass;

public class DetailingOfWrapperClass {
public static void main(String[]args) {
Integer p=new Integer(7);
Integer pr=new Integer("10");
	System.out.println(Integer.MIN_VALUE+" "+Integer.MAX_VALUE);
	
	String obj=Integer.toString(4,5);
	System.out.println(obj);
	
	String obj1=Integer.toUnsignedString(5,7);
     System.out.println(obj1);
     
     String obj2=Integer.toOctalString(157);
     System.out.println(obj2);
     
     String obj3=Integer.toHexString(89);
     System.out.println(obj3);
     
     System.out.println(Integer.SIZE);
     System.out.println(Integer.BYTES);
     System.out.println(Integer.TYPE);
     String obj4=Integer.toString(57,58);
     System.out.println(obj4);
     String obj6=Integer.toString(70);
     System.out.println(obj6);
     String obj8=Integer.toUnsignedString(17);
     System.out.println(obj8);
     int obj9=Integer.stringSize(98);
     System.out.println(obj9);
     byte obj10=p.byteValue();
     System.out.println(obj10);
     
}

}
