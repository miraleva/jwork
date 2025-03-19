package StudentGrades;
//burası tm gibi sadece constructorda notlar derslere özgü onu tekleştirsem mi bilemedim 

public class Student {
    String name;
    int age;
    int ID;
    public Student(String name, int age, int ID) { // 3 ders olcak + 5 öğrenci
        this.name = name;
        this.age = age;
        this.ID= ID;

    }

    public void student_info() {
        System.out.println("Student: " + this.name + " Age: " + this.age + " Math: " + this.mathNote + " History: "
                + this.historyNote + " Death: " + this.deathNote);

    }

    public int averajStudent() {
        return (mathNote + historyNote + deathNote) / 3;
    }

}