package feb_week4_20_feb.exceptionHandling.customException;

public class Register {
   public void checkCriteria(String citizenship,int age) {
           if (!citizenship.equalsIgnoreCase("indian")) {
               try {
                   throw new NonCitizenshipException(" \nYou are not an Indian citizen, so you are not eligible for voting");
               } catch (NonCitizenshipException e) {
                   System.out.println("you need to be an indian to vote");
               }
           } else if (age < 18) {
               try {
                   throw new AgeNotValidException("\n You are not eligible for voting because your age is less than 18");
               } catch (AgeNotValidException e) {
                   System.out.println("you have to wait till 18 to vote :) ");
               }
           } else {
               System.out.println("You are eligible for voting because you are an Indian citizen and your age is greater than or equal to 18");
           }
       }

   }

