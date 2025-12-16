import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // creating an object account and next line input using scanner
        BankAccount acc1 = new BankAccount(123,1000,"Sanjay");
        Scanner sc = new Scanner(System.in);
        //using for loop until we return a void
        while(true){
            System.out.println("\n===== Bank Menu =====");
            System.out.println("1. deposit");
            System.out.println("2. withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. exit");
            System.out.println("choose 1-4");
            //this is input for the choice to switch case
            int choice = sc.nextInt();
            //using switch case instead of applying if-else without bruteforce
            switch(choice){
                //here we are using cases instead of conditions
                case 1:
                    System.out.println("Enter the amount: ");
                    double depositAmt = sc.nextDouble();
                    acc1.deposit(depositAmt);
                    System.out.println("Deposited Amount: $ " + depositAmt);
                    break;
                case 2:
                    System.out.println("Enter the amount");
                    double withdrawAmt = sc.nextDouble();
                    //exceptional handling using try, catch
                    try {
                        acc1.withdraw(withdrawAmt);
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
                case 5:
                    System.out.println("Enter Interest rate: ");
                    int interestRate = sc.nextInt();
                    acc1.AddInterest();
                    System.out.println("Updated Balance: " + acc1.getBallance());
                default:
                    System.out.println("Invalid choice! Try 1-4.");
            }
        }
    }
}
