import java.util.Scanner;

class Student {
 String name;
    int rollNo;
    double marks;

void setDetails(String n, int r, double m) {
name = n;
        rollNo = r;
        marks = m;
    }

 void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Marks       : " + marks);
    }
}

 public class StudentDemo {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Student s1 = new Student();  // Create object

        // Taking input
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();

        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();

        // Setting details
        s1.setDetails(name, roll, marks);

        // Displaying details
        s1.displayDetails();
        
        sc.close();
    }
}