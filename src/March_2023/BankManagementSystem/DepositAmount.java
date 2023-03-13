package March_2023.BankManagementSystem;

import java.util.Scanner;

import static March_2023.BankManagementSystem.BankAccount.accountHolders;

public class DepositAmount {
    public void depositCash(){
        System.out.println("deposit");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Account number ");
        long UserAccountNo=sc.nextLong();
        boolean foundAccount = false;
        for (Customer c : accountHolders) {
            if (UserAccountNo == c.AccountNo) {
                System.out.println("Enter the Amount you want to Deposit ");
                int deposit = sc.nextInt();
                c.Amount += deposit;
                System.out.println("Total Balance in Account is: " + c.Amount);
                foundAccount = true;
                break;
            }
        }

        if (!foundAccount) {
            try {
                throw new AccountNotFoundException();
            } catch (AccountNotFoundException e) {
                System.out.println();
            }
        }
    }
}

