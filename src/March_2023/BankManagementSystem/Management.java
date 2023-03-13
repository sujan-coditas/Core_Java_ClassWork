package March_2023.BankManagementSystem;

import java.util.Scanner;

public class Management {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean Exit=false;
        while(!Exit){
            System.out.println("Enter choice : \n 0 : EXIT \n 1 : Add Bank Account \n 2.Deposit Amount \n 3.Withdraw Cash \n 4. Account Details ");
            int choice=sc.nextInt();
            switch (choice){
                case 0:
                    Exit=true;
                    break;

                case 1:
                    BankAccount bankAccount=new BankAccount();
                    bankAccount.menuSelection();
                    break;

                case 2:
                    DepositAmount depositAmount=new DepositAmount();
                    depositAmount.depositCash();
                    break;

                case  3:
                    WithdrawAmount withdrawAmount=new WithdrawAmount();
                    withdrawAmount.withdrrawCash();
                    break;

                case 4 :
                    DisplayDetails displayDetails=new DisplayDetails();
                    displayDetails.showdetails();
                    break;

                default:
                    System.out.println("Enter Valid Input");
                    break;

            }
        }
    }}
    /*
Enter choice :
 0 : EXIT
 1 : Add Bank Account
 2.Deposit Amount
 3.Withdraw Cash
 4. Account Details
1
Enter choice :
 0 : EXIT
 1 : Saving Account
 2.Current Account
1
Enter Name
sujan
Enter Address
nanded
Enter Email
sujan@gmail.com
Enter Phone NUmber
4567882345
Congratulations !! sujan your Savings Account has been created
 your account number is :: 5771349025039
Enter choice :
 0 : EXIT
 1 : Saving Account
 2.Current Account
2
Enter Name
pratiksha
Enter Address
karad
Enter Email
pratiksha@gmail.com
Enter Phone NUmber
5432167896
Enter Company Name
Coditas
Congratulations !! pratiksha your Current Account has been created
 your account number is :: 3463929257884
Enter choice :
 0 : EXIT
 1 : Saving Account
 2.Current Account

0
Enter choice :
 0 : EXIT
 1 : Add Bank Account
 2.Deposit Amount
 3.Withdraw Cash
 4. Account Details
2
deposit
Enter your Account number
233456665555
Account Not Found

Account Not Found

Enter choice :
 0 : EXIT
 1 : Add Bank Account
 2.Deposit Amount
 3.Withdraw Cash
 4. Account Details
2
deposit
Enter your Account number
3463929257884
Account Not Found

Enter the Amount you want to Deposit
1000
Total Balance is : 1000
Enter choice :
 0 : EXIT
 1 : Add Bank Account
 2.Deposit Amount
 3.Withdraw Cash
 4. Account Details
2
deposit
Enter your Account number
5771349025039
Enter the Amount you want to Deposit
56789
Total Balance is : 57789
Account Not Found

Enter choice :
 0 : EXIT
 1 : Add Bank Account
 2.Deposit Amount
 3.Withdraw Cash
 4. Account Details
3
Withdraw
Enter your Account number
5771349025039
Enter the Amount you want to Withdraw
1000000
Insufficient Balance in the Account

Account Not Found

Enter choice :
 0 : EXIT
 1 : Add Bank Account
 2.Deposit Amount
 3.Withdraw Cash
 4. Account Details
4
Account Number :5771349025039
Account Type :Savings
Account Holder Name : sujan
Address : nanded
Phone No : 4567882345
Total Balance : 0

----------------------------------------

Account Number :3463929257884
Account Type :Current
Account Holder Name : pratiksha
Address : karad
Phone No : 5432167896
Total Balance : 0

----------------------------------------

Enter choice :
 0 : EXIT
 1 : Add Bank Account
 2.Deposit Amount
 3.Withdraw Cash
 4. Account Details
0

Process finished with exit code 0*/
