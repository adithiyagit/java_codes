import java.util.Scanner;

class Student {
String name;
int marks;

Student() {
this.name = "Not Provided";
this.marks = 0;
}

Student(String stdName, int stdMarks) {
this.name = stdName;
this.marks = stdMarks;
}

String calculateGrade() {
if (marks >= 90) return "A+";
else if (marks >= 80) return "A";
else if (marks >= 70) return "B";
else if (marks >= 60) return "C";
else if (marks >= 50) return "D";
else return "F";
}

void show() {
System.out.println("STUDENT NAME : " + name );
System.out.println("STUDENT MARKS : " + marks );
System.out.println("STUDENT GRADE : " + calculateGrade());
}
}

public class DemoStudent {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print ("STUDENT NAME : ");
String name = sc.nextLine();
System.out.print ("STUDENT MARKS : ");
int marks = sc.nextInt();

Student s = new Student (name, marks);

System.out.println("\n--- Student Details ---");
s.show();

sc.close();
}
}