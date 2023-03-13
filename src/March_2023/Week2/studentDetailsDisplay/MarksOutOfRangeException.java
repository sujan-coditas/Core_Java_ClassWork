package March_2023.Week2.studentDetailsDisplay;

public class MarksOutOfRangeException extends  Exception{
    MarksOutOfRangeException(){
        System.out.println("Please enter marks between 1 - 99 ");
    }
}
