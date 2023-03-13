package March_2023.Week2.studentDetailsDisplay;

public class StudentNotFoundException extends Exception {
    StudentNotFoundException(){
        System.out.println("Please enter the Student details first");
    }
}
