package March_2023.BankManagementSystem;

public class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(){
        System.out.println("Insufficient Balance in the Account");
    }
}
