package March_2023.Week2.studentDetailsDisplay;

public class DuplicateStudentException extends Exception{
    DuplicateStudentException(){
        System.out.println("Student already Exists with this Roll no ");
    }
}
