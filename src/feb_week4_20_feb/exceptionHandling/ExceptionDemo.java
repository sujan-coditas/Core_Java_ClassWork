package feb_week4_20_feb.exceptionHandling;


class SimpleDemo{
    public  void show(){
        int number1=20,number2=0,result=0;
        System.out.println("this is sujan");
        try {
            result = number1 / number2;
        }
        catch (Exception e ){
//            System.out.println("Arithmetic Exception Occured");
           // e.printStackTrace();
            System.out.println(e);
        }
        finally {
            System.out.println("this is finally");
            System.out.println("due to number2 value is 0 this exception occurs");
        }
        System.out.println("Result is :: "+result);
    }
}
public class ExceptionDemo {
    public static void main(String[] args) {
        SimpleDemo simpleDemo=new SimpleDemo();
        simpleDemo.show();
    }
}
