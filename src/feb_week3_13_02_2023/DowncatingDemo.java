package feb_week3_13_02_2023;

/*theory
*  Q . object casting
Q. tpes of casting (downcasting , upcasting (promotion), ----)

// object Specificatiion

parent p= new Parent();
child c= new child();


upcasting:
parent p =new child(); (u can access both child and parent methods)

// polymorphic variabvle: runtime polymorphism
parent p;
p=new Child();
p.show;
p=new child1();
p.show;


mark and sweep algorithm

  we cant refer to parent using child
  but parent can be used to refer child


// downcasting:creating an object of parent and reference of child

	child  c=new parent(); // it gives compile  time error
	 child c=(child) new parent();// typecasting => compile error resolved (but it leads to loss of data)
				if child is having 7 properties and father has 5  then after typecasting father can only hace 5 prop only remaining two prop gets lost.
 	 this will give  you runtime exception  giving class Cast Exception (this exception happens in downcasting)
		 to solve this we use instanceOf keyword





*/
class Parent{
     int drivingLicenceNo=1;
     public void show(){
         System.out.println("parent driving Licence No :" + drivingLicenceNo);
     }

 }
 class Child extends Parent{
     public void show(){
         System.out.println("child driving Licence No :" + drivingLicenceNo);
     }
 }

public class DowncatingDemo {
    public static void main(String[] args) {
        System.out.println("*******specific object ************");
        Child child=new Child();
        child.show();
        System.out.println("*******polymorphic object ************");
        Parent parent=new Child();
        parent.show();
        System.out.println("****Downcasting ***************");
//        Child child1= (Child)new Parent(); this is not allowed
        Child child1= (Child) parent;
        child1.show();;



    }
}
