package feb_week2_Assignment;

class Parent{
    int drivingLicenceId=131;

    public  void displayData(){
        System.out.println("Parent Driving licence id is " + drivingLicenceId);
    }
}
 class Child extends Parent{
     int aadharCardNumber=111;

     public  void displayData(){
         super.drivingLicenceId=122;

         super.displayData();
         System.out.println("Child aadhar card id is " + aadharCardNumber);
         System.out.println("parent Driving licence id is " + drivingLicenceId);//parent
         drivingLicenceId=132;
         System.out.println("child Driving licence id is " + drivingLicenceId);


     }
 }
public class InheritanceDemo {
    public static void main(String[] args) {

        Child child=new Child();
        child.displayData();

    }
}
