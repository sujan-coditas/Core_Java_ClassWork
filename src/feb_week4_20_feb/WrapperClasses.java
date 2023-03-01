package feb_week4_20_feb;

public class WrapperClasses {
    public static void main(String[] args) {
        short number1=50; int number3=0;
        Integer number2= (int) number1;//autoboxing
        System.out.println("unboxing : "+number1);
        System.out.println("hashcode : "+number2.hashCode());
        number3=number1;
        System.out.println("AutoBoxing : "+number3);
        System.out.println("immutability  : "+(number2+10));


    }
}
