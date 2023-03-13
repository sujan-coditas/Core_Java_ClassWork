package March_2023.BankManagementSystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Customer{
    String name,Address,Email,PhoneNo,AccountType,CompanyName;
    int Amount;
    long AccountNo;

    Customer(String name,String Address,String Email, String PhoneNo,String AccountType, int Amount, long AcccountNo){
        this.name=name;
        this.Address=Address;
        this.Email=Email;
        this.PhoneNo=PhoneNo;
        this.AccountType=AccountType;
        this.Amount=Amount;
        this.AccountNo=AcccountNo;
    }
    Customer(String name,String Address,String Email, String PhoneNo,String AccountType, int Amount,long AcccountNo,String CompanyName){
        this.name=name;
        this.Address=Address;
        this.Email=Email;
        this.PhoneNo=PhoneNo;
        this.AccountType=AccountType;
        this.Amount=Amount;
        this.AccountNo=AcccountNo;
        this.CompanyName=CompanyName;
    }
    }
public class BankAccount {

 public static ArrayList<Customer> accountHolders=new ArrayList<>();
    Scanner sc = new Scanner(System.in);
     int Amount=0;

    public void menuSelection() {
        boolean Exit = false;
        while (!Exit) {
            System.out.println("Enter choice : \n 0 : EXIT \n 1 : Saving Account  \n 2.Current Account ");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    Exit = true;
                    break;

                case 1:
                    savingsAccount();
                    break;

                case 2:
                    currentAccount();
                    break;


                default:
                    System.out.println("Enter Valid Input");
                    break;

            }
        }
    }

    public void savingsAccount(){
        String name,Address,Email,PhoneNo,AccountType;
        long AccountNo;
        int Amount=0;
        System.out.println("Enter Name");
        name=sc.next();
        System.out.println("Enter Address");
        Address=sc.next();

        System.out.println("Enter Email");
        Email=sc.next();

        System.out.println("Enter Phone NUmber");
        PhoneNo=sc.next();

        AccountType="Savings";
        AccountNo=generateAccountNo();
        System.out.println("Congratulations !! "+name +" your Savings Account has been created \n your account number is :: "+AccountNo);

        Customer customerBankAccount= new Customer(name,Address,Email,PhoneNo,AccountType,Amount,AccountNo);
        accountHolders.add(customerBankAccount);


    }

    public long generateAccountNo(){
        Random random = new Random();
        long generatedAccountNo = (long) (random.nextDouble() * 9_000_000_000_000L) + 1_000_000_000_000L;
        return generatedAccountNo;
    }


    public void currentAccount(){
        String name,Address,Email,PhoneNo,AccountType,CompanyName;
        long AccountNo;

        System.out.println("Enter Name");
        name=sc.next();
        System.out.println("Enter Address");
        Address=sc.next();

        System.out.println("Enter Email");
        Email=sc.next();

        System.out.println("Enter Phone NUmber");
        PhoneNo=sc.next();
        AccountType="Current";
        System.out.println("Enter Company Name");
        CompanyName=sc.next();
        AccountNo=generateAccountNo();
        System.out.println("Congratulations !! "+name +" your Current Account has been created \n your account number is :: "+AccountNo);

        Customer customerBankAccount= new Customer(name,Address,Email,PhoneNo,AccountType,Amount,AccountNo,CompanyName);
        accountHolders.add(customerBankAccount);
    }
}
