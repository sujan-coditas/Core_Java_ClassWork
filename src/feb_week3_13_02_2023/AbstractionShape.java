package feb_week3_13_02_2023;

// rule1: in any simple class if u declare a method,that method need to be declared as abstract method.
// rule2: in any simple class if u declare an abstract(),that class need to be declared as abstract class.
// rule3 : u can declare class as an abstract class  & it may or may not have any abstract methods or concrete methods.
// rule 4:  if any subclass wants to extend this abstract class
// 4.1: then they have to implement all the abstract methods and provide implementation
//4.2: if any subclass fail to do so , that subclass also need to declared itself as an abstract class
// rule5: u can not instanciate an abstract class(u cant create object of abstract class)
abstract class Shape{
    public abstract void area();// abstract method
    public  void display(){
        System.out.println("this is shape class display............"); // concrete / normal metho
    }

    class Circle extends  Shape{

        @Override
        public void area() {
            System.out.println("Circle class area method...........");

        }
    }

}
public class AbstractionShape {
    public static void main(String[] args) {
       // Circle circle=new Circle();


    }
}
