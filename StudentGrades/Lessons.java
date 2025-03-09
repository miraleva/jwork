package StudentGrades;
//lesson averaj alınma eklenecek + geçilemeyen dersten "öğrenci kaldı" eklenebilir.
public class Lessons{
    String lessonName;  
    int passingGrade;   


    public Lessons(String lessonName,int passingGrade){
        this.lessonName=lessonName;
        this.passingGrade=passingGrade;
    }

    public void lesson_info(){
        System.out.println("Lesson: " + lessonName + " & Passing grade: " + passingGrade);
    }
}
