package March_2023.Week2.studentDetailsDisplay;

import java.util.Scanner;

import static March_2023.Week2.studentDetailsDisplay.AddStudent.studentList;
import static March_2023.Week2.studentDetailsDisplay.AddStudentMarks.studentMarks;
public class StudentResult {
    public void displayResult() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll no:");
        int rollno = sc.nextInt();
        boolean flag = false;
        for (Student s : studentList) {
            System.out.println("Name: " + s.name);
            System.out.println("Roll No: " + s.rollno);
            if (s.rollno == rollno) {
                for (StudentMarks sm : studentMarks) {
                    if (s.rollno == sm.rollno) {
                        flag = true;
                        System.out.print("Marks: ");
                        int totalmarks=0;
                        for (int mark : sm.Marks) {
                            System.out.print(mark + " ");
                            totalmarks+=mark;

                        }
                        double Percentage= ((double) totalmarks/5) *100;
                        if(Percentage>35 )
                            System.out.println(" \n Passed with " + Percentage +" % ");
                        else
                            System.out.println("Failed !");
                        System.out.println();
                    }

                    }


            }

        }

        if(!flag){
            try{
                throw new StudentNotFoundException();
            } catch (StudentNotFoundException e) {
                System.out.println();
            }
        }
    }
}
