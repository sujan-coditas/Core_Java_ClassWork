package March_2023.Week2.studentDetailsDisplay;

import java.util.ArrayList;

import static March_2023.Week2.studentDetailsDisplay.AddStudent.studentList;


public class DisplayStudent {

    public void displayStudentData() {
        for (Student student : studentList) {
            System.out.println("Roll No: " + student.rollno);
            System.out.println("Name: " + student.name);
            System.out.println("Age: " + student.age);
            System.out.println("Division: " + student.division);
            System.out.println("Address: " + student.address);
            System.out.println("---------------------------");
        }
    }
}
