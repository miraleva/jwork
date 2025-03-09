package StudentGrades;

public class Lessons{
    String lessonName;
    int passingGrade;


    public Lessons(String lessonName, int passingGrade){
        this.lessonName=lessonName;
        this.passingGrade= passingGrade;

    }

    public int averajGrade(){


    }
    
    public void lesson_info(){
        System.out.println("lesson:" + lessonName + "Passing grade:" + passingGrade);
    }
}
