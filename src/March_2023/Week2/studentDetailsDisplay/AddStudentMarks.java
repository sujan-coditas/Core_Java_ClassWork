package March_2023.Week2.studentDetailsDisplay;

import java.util.ArrayList;
import java.util.Scanner;

import static March_2023.Week2.studentDetailsDisplay.AddStudent.choice;


class StudentMarks{
        static int rollno;
        static int Marks[]=new int[5];

        public StudentMarks(int rollno,int Marks[]){
            this.rollno=rollno;
            this.Marks=Marks;
        }
    }

public class AddStudentMarks {
    public static  ArrayList<StudentMarks> studentMarks=new ArrayList<>();

    public static void addStudentMarks(){
        int rollno;
        int marks[]=new int[5];

        Scanner sc=new Scanner(System.in);

        do {
            System.out.println("Enter roll no: ");
        rollno=sc.nextInt();
        System.out.println("Enter marks of English,Science,Math,Physics,Marathi");
         for(int i=0;i<5;i++){
             marks[i]=sc.nextInt();
             if(marks[i]<0 || marks[i] >100){
                 try
                 {throw new MarksOutOfRangeException();
                 } catch (MarksOutOfRangeException e) {
                     i--;
                     System.out.println("Enter marks carefully");
                 }
             }
             else{
                 if(marks[i] < 35){
                     marks[i]+=5;
                 }
             }
         }
            System.out.println("Marks have been stored ");
         StudentMarks studentMarksList= new StudentMarks (rollno,marks);
         studentMarks.add(studentMarksList);

            System.out.println("Do you want to add other student (y/n)");
            choice=sc.next();
    }while(choice.equalsIgnoreCase("y"));

}


    }




