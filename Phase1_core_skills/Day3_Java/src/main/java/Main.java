import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        BankAccount acc1 = new BankAccount(123,1000,"Sanjay");
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("\n===== Bank Menu =====");
            System.out.println("1. deposit");
            System.out.println("2. withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. exit");
            System.out.println("choose 1-4");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the amount: ");
                    double depositAmt = sc.nextDouble();
                    acc1.deposit(depositAmt);
                    System.out.println("Deposited Amount: $ " + depositAmt);
                    break;
                case 2:
                    System.out.println("Enter the amount");
                    double withdrawAmt = sc.nextDouble();
                    try {
                        acc1.Withdraw(withdrawAmt);
                        System.out.println("Withdrawn Amount: $ " + withdrawAmt);
                    }catch (IllegalArgumentException e){
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Balance: $ " + acc1.getBalance());
                    break;
                case 4:
                    System.out.println("Thank You !!!");
                    return;
                default:
                    System.out.println("Invalid choice! Try 1-4.");
            }
        }
    }
}
