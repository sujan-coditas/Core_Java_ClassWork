package March_2023.Week2.studentDetailsDisplay;

import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int selectOption = 1;
        do {
            System.out.println("Choose your option: \n 0. EXIT \n 1. Add Student  \n 2.Display Students  \n 3.Add Student Marks  \n 4. Display Result");
            int choice = sc.nextInt();
            switch (choice) {

                case 0:
                    selectOption=0;
                    break;

                case 1:
                    AddStudent addStudent = new AddStudent();
                    addStudent.addStudentDetails();
                    break;

                case 2:
                    DisplayStudent displayStudent = new DisplayStudent();
                    displayStudent.displayStudentData();
                    break;

                case 3:
                    AddStudentMarks addMarks = new AddStudentMarks();
                    addMarks.addStudentMarks();
                    break;

                case 4:
                    StudentResult studentResult = new StudentResult();
                    studentResult.displayResult();
                    break;

                default:
                    System.out.println("Enter valid Option");
                    break;
            }

            if(selectOption !=0){
                System.out.println(" \n Press \n 0. EXIT \n 1. Explore options ");
                selectOption= sc.nextInt();
            }

        }while(selectOption == 1);
    }
}
