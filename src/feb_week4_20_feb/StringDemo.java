package feb_week4_20_feb;

class StringWays{
    public  void displaay(){
        // way1
        String name="Sujan";
        String name1="Sujan";
        String name2="Pratiksha";
        String name3="sujan";
        System.out.println("First Name is : "+ name);
      // name= name.concat("Shaikh");
        System.out.println("Concat Name is : "+ name);


        //way2
        String name4= new String("How are you ?");
        System.out.println("Message1 Name is :" + name1);
       String message= name1.concat("I am fine ");
        System.out.println("\n" +message);


        // methods : 1.equals
        System.out.println("Equals() : "+name.equals(name1));
        System.out.println("Equals() : "+name1.equals(name2));

        // way2: "==" double equals to
        System.out.println(" == "+name==name1);
        System.out.println(" == "+name==name3);
        System.out.println(" == "+name==name2);

        // way3: compareTo
        System.out.println(" == "+name.compareTo(name1));
        System.out.println(" == "+name.compareTo(name2));
        System.out.println(" == "+name.compareTo(name3));


        // way 2:  for objects

        String name11= new String("Sujan");
        String name22= new String("Sujan");
        String name33= new String("sujan");
        String name44= new String("Pratiksha");

        // methods : 1.equals for objects

        System.out.println("Equals() : "+name11.equals(name22));
        System.out.println("Equals() : "+name11.equals(name33));
        System.out.println("Equals() : "+name11.equals(name44));


        // way2: "==" double equals to
        System.out.println(" == "+name==name11);
        System.out.println(" == "+name==name22);
        System.out.println(" == "+name==name33);

        // way3: compareTo
        System.out.println("Compares TO : "+name11.compareTo(name22));
        System.out.println("Compares TO :"+name11.compareTo(name33));
        System.out.println("Compares TO :"+name11.compareTo(name44));

  String nameArya="Arya";
  String Aryaman="Aryaman";
        System.out.println("nameArya value : " + nameArya.compareTo(Aryaman) );







    }
}
public class StringDemo {
    public static void main(String[] args) {
         StringWays stringWays=new StringWays();
         stringWays.displaay();
    }
}
