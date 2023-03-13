package March_2023.BankManagementSystem;

public class AccountNotFoundException extends Exception{
    AccountNotFoundException(){
        System.out.println("Account Not Found");
    }
}
