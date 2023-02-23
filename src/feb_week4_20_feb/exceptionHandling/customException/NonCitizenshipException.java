package feb_week4_20_feb.exceptionHandling.customException;


public class NonCitizenshipException extends Exception {
    NonCitizenshipException(){
        System.out.println("this is default NonCitizenshipException ............");
    }
    NonCitizenshipException(String s){
        System.out.println("you are not indian citizen"+s);
    }
    NonCitizenshipException(Throwable cause){
        System.out.println("Throwable causes NonCitizenship Exception");
    }
    NonCitizenshipException(Throwable cause ,String s){
        System.out.println("throwable with string");
    }


}
