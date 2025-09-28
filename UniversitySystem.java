abstract class Person {
private String name;
private String id;

public Person(String name, String id) {
this.name = name;
this.id = id;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

    
public abstract String getRole();
}

class Student extends Person {
public Student(String name, String id) {
super(name, id);
}

public String getRole() {
return "Student";
}
}


class Professor extends Person {
public Professor(String name, String id) {
super(name, id);
}

public String getRole() {
return "Professor";
}
}

public class UniversitySystem {
public static void main(String[] args) {
     
Student student = new Student("Adhi", "S123");
Professor professor = new Professor("Dr. Arun", "P456");

      
System.out.println("Name: " + student.getName() + ", ID: " + student.getId() + ", Role: " + student.getRole());
System.out.println("Name: " + professor.getName() + ", ID: " + professor.getId() + ", Role: " + professor.getRole());
}
}
