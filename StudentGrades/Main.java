package StudentGrades;

public class Main {
    public static void main(String[] args){
        Lessons math = new Lessons("Math",);
        Lessons history = new Lessons("History",);
        Lessons death = new Lessons("Death",);
        

        Student student1 = new Student("Murat",16,1);
        Student student2 = new Student("Fadime",16,2);
        Student student3 = new Student("Muratcan",16,3);
        Student student4 = new Student("Mohammed",17,4);
        Student student5 = new Student("Ayşe",15,5);

        student1.student_info();
        student2.student_info();
        student3.student_info();
        student4.student_info();
        student5.student_info();

        System.out.println(student1.name + " note averajı: " + student1.averajStudent());
        System.out.println(student5.name + " note averajı: " + student5.averajStudent());

        lessons1.lesson_info();
        lessons2.lesson_info();
        lessons3.lesson_info();

      

    }
    
}
