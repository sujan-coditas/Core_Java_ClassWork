package feb_week4_20_feb.exceptionHandling.customException;



public class AgeNotValidException extends RuntimeException  {
    AgeNotValidException(){
        System.out.println("default constructor");
    }
    AgeNotValidException(String s){
        System.out.println(" you are minor"+s );
    }
    AgeNotValidException(Throwable cause){
        System.out.println("Throwable causes nonIndianException");
    }
    AgeNotValidException(Throwable cause,String s){

        System.out.println("throwable with string");
}

    }

