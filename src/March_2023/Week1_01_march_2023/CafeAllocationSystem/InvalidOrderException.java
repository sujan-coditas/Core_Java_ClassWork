package March_2023.Week1_01_march_2023.CafeAllocationSystem;

public class InvalidOrderException extends  RuntimeException{
    InvalidOrderException(){
        System.out.println("Please order the coffee");
    }
}
