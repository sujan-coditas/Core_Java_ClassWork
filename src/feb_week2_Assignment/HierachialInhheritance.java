package feb_week2_Assignment;

class Saif{
    String fathername="Saif";
    public void display(){
        System.out.println("Father's name is " + fathername );
    }
}
class Sara extends Saif{
    String child1="sara";
    public void display(){
        super.display();
        System.out.println("Saif's first child  is " + child1 );
    }

}

class Taimure extends Saif{
    String child2="Taimur";
    public void display(){
        super.display();

        System.out.println("Saif's second child   is " + child2 );
    }

}

public class HierachialInhheritance {
    public static void main(String[] args) {
      Sara sara=new Sara();
      sara.display();
      Taimure taimure=new Taimure();
      taimure.display();
    }
}
/* =========OUTPUT==================
*
Father's name is Saif
Saif's first child  is sara
Father's name is Saif
Saif's second child   is Taimur
Process finished with exit code 0*/
