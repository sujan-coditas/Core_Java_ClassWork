package March_2023.BankManagementSystem;

import java.util.Scanner;

import static March_2023.BankManagementSystem.BankAccount.accountHolders;

public class WithdrawAmount {
    public void withdrrawCash() {
        System.out.println("Withdraw");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Account number ");
        long userAccountNo = sc.nextLong();

        boolean foundAccount = false;
        for (Customer c : accountHolders) {
            if (userAccountNo == c.AccountNo) {
                System.out.println("Enter the Amount you want to Withdraw ");
                int withdraw = sc.nextInt();
                if (withdraw > c.Amount) {
                    try {
                        throw new InsufficientBalanceException();
                    } catch (InsufficientBalanceException e) {
                        System.out.println();
                    }
                } else {
                    c.Amount -= withdraw;
                    System.out.println("Total Balance is: " + c.Amount);
                }
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
