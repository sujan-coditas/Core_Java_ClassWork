package feb_week2_Assignment;

class Randheer{
    String grandParentName="Babita";
    public void displaydata(){
        System.out.println(" Kareena's grandparent name is:: "+ grandParentName);
    }
}

class Kareena  extends Randheer{
    String ParentName="Kareena";
    public void displaydata(){
        System.out.println("parent name is:: "+ ParentName);
    }

}

 class Taimur extends  Kareena{
     String childName="Taimur";
     public void displaydata(){
         System.out.println("child name is:: "+ childName);
     }

        }
public class multilevelInheritance {
    public static void main(String[] args) {
        Taimur taimur=new Taimur();
        taimur.displaydata();
        Kareena kareena=new Kareena();
        kareena.displaydata();

    }
}
