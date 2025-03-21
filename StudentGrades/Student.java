package StudentGrades;

public class Student {
    String name;
    int age;
    int ID;
    public Student(String name, int age, int ID) { 
        this.name = name;
        this.age = age;
        this.ID = ID;

    }

    public void student_info() {
        System.out.println("Student: " + this.name + " Age: " + this.age + " ID: " + this.ID);
    }
  
    
}