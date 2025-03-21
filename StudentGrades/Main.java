package StudentGrades;

public class Main {
    public static void main(String[] args){
        int[] studentIDs = {1,2,3,4,5};
        int[] mathNote = {10,20,30,44,33};
        int[] historyNote = {13,20,30,74,33};
        int[] deathNote = {15,50,89,45,33};

        Lessons math = new Lessons("Math",studentIDs,mathNote);
        Lessons history = new Lessons("History",studentIDs,historyNote);
        Lessons death = new Lessons("Death",studentIDs,deathNote);

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

        System.out.println(student1.name + " Math" + math.getStudentNotes(student1.ID) );
        System.out.println(student5.name + " History" + history.getStudentNotes(student5.ID) );

        System.out.println("death lesson averajı: " + death.averajLesson());
        System.out.println("death lesson averajı: " + history.averajLesson());


      

    }
    
}
