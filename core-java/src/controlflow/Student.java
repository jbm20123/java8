package controlflow;

public class Student {
int rollno;
String name;
double cgpa;
double tenth;
double twelth;
Student(int rollno1,String name1,double cgpa1,double tenth1,double twelth1){
rollno=rollno1;
name=name1;
cgpa=cgpa1;
tenth=tenth1;
twelth=twelth1;
}
int getRollNo() {
	return rollno;
}
String getName() {
	return name;
}
double getCgpa() {
	return cgpa;
}
double getTenth() {
	return tenth;
}
double getTwelth() {
	return twelth;
}
}
