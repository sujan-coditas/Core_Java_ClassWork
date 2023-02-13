package feb_week2_Assignment;

// we cant have more than 1 public in java
// we can have more than 1 main in same program but with different classes
// we cant have 2 main method in 1 class.
class c1{
    public void displayc1(){
        System.out.println(" this is c1");
    }
}
class c2{
    public static void main(String[] args) {
        System.out.println("this is c2 main");
    }
    public void displayc2(){
        System.out.println(" this is c2");
    }

}
  public class MorePublicClasses {
    public static void main(String[] args) {
        c1 c = new c1();
        c.displayc1();
        c2 cc=new c2();
        cc.displayc2();
    }



}
