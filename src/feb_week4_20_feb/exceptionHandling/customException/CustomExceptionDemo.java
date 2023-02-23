package feb_week4_20_feb.exceptionHandling.customException;

public class CustomExceptionDemo {
    public static void main(String[] args) {
        Register register=new Register();
        register.checkCriteria("Indian",9);
    }
}
/*=========output==========

register.checkCriteria("france",89);

* you are not indian citizen
You are not an Indian citizen, so you are not eligible for voting
you need to be an indian to vote

 register.checkCriteria("Indian",89);
 You are eligible for voting because you are an Indian citizen and your age is greater than or equal to 18

register.checkCriteria("Indian",9)
 you are minor
 You are not eligible for voting because your age is less than 18
you have to wait till 18 to vote :)



* */