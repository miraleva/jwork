package StudentGrades;
public class Lessons{
    String lessonName;  
    int[] studentIDs; 
    int[] studentNotes; 



    public Lessons(String lessonName, int[] studentIDs, int[] studentNotes){
        this.lessonName= lessonName;
        this.studentIDs= studentIDs;
        this.studentNotes= studentNotes;
    }

    public String getStudentNotes(int ID){
        for( int i=0; i<studentIDs.length; i++ ){ //length
            if(studentIDs[i] == ID){
                return " notu:" + studentNotes[i];
            } 
        }
           return "Student yok";
        }
            
        

    public int averajLesson(){
        int total = 0;
        for (int note : studentNotes) {
            total += note;
        }
        return (int) total / studentNotes.length;
        
    }


}
