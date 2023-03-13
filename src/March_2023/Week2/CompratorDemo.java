//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//class Student{
//    int rno;
//    String name , city;
//
//    public Student(int rno, String name, String city){
//        this.rno=rno;
//        this.name=name;
//        this.city=city;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "rno=" + rno +
//                ", name='" + name + '\'' +
//                ", city='" + city + '\'' +
//                '}';
//    }
//}
//
//class SortByRoll implements Comparator<Student>{
//
//    @Override
//    public int compare(Student o1, Student o2) {           //Abstract method compare so only one funtional interface
//        return o1.rno-o2.rno;    //For interger - use minus
//    }
//}
//
//public class Comparraterdemo {
//    public static void main(String[] args) {
//
//        ArrayList<Student>list = new ArrayList<Student>();
//        list.add(new Student(1,"Mrunmai","Pune"));
//        list.add(new Student(2,"Amai","Pune"));
//        list.add(new Student(3,"yekti","Pune"));
//        list.add(new Student(4,"Pyisn","Pune"));
//        list.add(new Student(5,"Ravi","Pune"));
//
//        for (int i=0;i<list.size(); i++){
//            System.out.println(list.get(i));
//
//        }
//
//        Collections.sort(list,new SortByRoll());
//
//
//    }
//}