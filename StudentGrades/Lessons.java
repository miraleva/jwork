package StudentGrades;
//lesson averaj alınma eklenecek + geçilemeyen dersten "öğrenci kaldı" eklenebilir.
public class Lessons{
    String lessonName;  
    int passingGrade;   
    int mathNote;
    int historyNote;
    int deathNote;



    public Lessons(String lessonName,int passingGrade,int mathNote,int historyNote, int deathNote){
        this.lessonName=lessonName;
        this.passingGrade=passingGrade;
        this.mathNote=mathNote;
        this.historyNote=historyNote;
        this.deathNote=deathNote;
    }

    public void lesson_info(){
        System.out.println("Lesson: " + lessonName + " & Passing grade: " + passingGrade);
    }

    public void averajLesson(){
        
    }


    public void averajComp(){
        if(){ //eğer student note<ders ortalaması öprenci kaldı else ıdk 
        

        }
    }

    public int averajStudent() {
        return (mathNote + historyNote + deathNote) / 3;
    }


}
