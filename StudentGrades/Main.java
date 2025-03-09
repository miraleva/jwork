package StudentGrades;

public class Main {
    public static void main(String[] args){
        Lessons lessons1 = new Lessons("Math",50);
        Lessons lessons2 = new Lessons("History",60);
        Lessons lessons3 = new Lessons("Death",30);
        

        Student student1 = new Student("Murat",16,49,84,7);
        Student student2 = new Student("Fadime",16,72,65,21);
        Student student3 = new Student("Muratcan",16,63,38,3);
        Student student4 = new Student("Mohammed",17,14,100,0);
        Student student5 = new Student("Ayşe",15,91,84,38);

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
