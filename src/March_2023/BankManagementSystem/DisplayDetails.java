package March_2023.BankManagementSystem;


import static March_2023.BankManagementSystem.BankAccount.accountHolders;

public class DisplayDetails {
    public void showdetails() {
        for(Customer c: accountHolders) {
            if(c.AccountType.equalsIgnoreCase("Current")) {
                System.out.println("Company Name: " + c.CompanyName);
                System.out.println("Account Number: " + c.AccountNo);
                System.out.println("Account Type: " + c.AccountType);
                System.out.println("Account Holder Name: " + c.name);
                System.out.println("Address: " + c.Address);
                System.out.println("Phone No: " + c.PhoneNo);
                System.out.println("Total Balance: " + c.Amount);
                System.out.println("----------------------------------------");
            }
            else {
                System.out.println("Account Number: " + c.AccountNo);
                System.out.println("Account Type: " + c.AccountType);
                System.out.println("Account Holder Name: " + c.name);
                System.out.println("Address: " + c.Address);
                System.out.println("Phone No: " + c.PhoneNo);
                System.out.println("Total Balance: " + c.Amount);
                System.out.println("----------------------------------------");

            }

            System.out.println();
        }
    }
    }


