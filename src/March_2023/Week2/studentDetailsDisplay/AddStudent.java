package March_2023.Week2.studentDetailsDisplay;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
     int rollno,age;
     String name,division;
     String address;

    public Student(int rollno,String name, int age,String division,String address)
    {
        this.rollno=rollno;
        this.name=name;
        this.age=age;
        this.division=division;
        this.address=address;
    }
}
public class AddStudent {

    static String choice;
    public static ArrayList<Student> studentList = new ArrayList<>();

    public static void addStudentDetails() {
        Scanner sc = new Scanner(System.in);

        int rollno;
        String name;
        String division;
        String address;
        do {
            System.out.println("Enter Roll no : ");
            rollno = sc.nextInt();
            boolean check=false;
            for(Student s:studentList){
                if(s.rollno==rollno){
                    check=true;
                }
            }
            if(check){
                try  {
                    throw new DuplicateStudentException();
                } catch (DuplicateStudentException e) {
                    System.out.println();
                }

            }
            if(!check) {
                System.out.println("Enter Name :");
                sc.nextLine(); // consume the newline character left by sc.nextInt()
                name = sc.nextLine();

                System.out.println("Enter Age :");
                int age = sc.nextInt();

                System.out.println("Enter Division :");
                division = sc.next();

                System.out.println("Enter Address :");
                sc.nextLine(); // consume the newline character left by sc.next()
                address = sc.nextLine();

                Student student = new Student(rollno, name, age, division, address);
                studentList.add(student);

            }

            System.out.println("Do you want  to enter other student (y/n) ? ");
            choice=sc.next();
        }
        while(choice.equalsIgnoreCase("y"));
    }

}



