class Student {
String name;
int rollNo;
String course;

Student(String StudentName, int StdrollNo, String Stdcourse) {
this.name = StudentName;
this.rollNo = StdrollNo;
this.course = Stdcourse;
}

void displayDetails() {
System.out.println("Name of student: " + name + ", Rollno: " + rollNo + ", student's course: " + course );
}
}

public class Demo {
public static void main(String[] args) {
Student s1 = new Student ("Sonat", 1, "BCA");
Student s2 = new Student ("Sneha", 2, "MCA");
Student s3 = new Student ("Joice", 3, "MBA");
s1.displayDetails();
s2.displayDetails();
s3.displayDetails();
}
}
