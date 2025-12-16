public class BankAccount {
    //access modifier for field names encapsulation
    private static int nextAccountNumber = 1;
    private int account;
    private double balance;
    private String name;
    // Constructor used to perform it while initializing
    public BankAccount(int account, double balance, String name){
        if (balance < 0){
            // this throws an error exception if balance < 0 while initializing
            throw new IllegalArgumentException("Initial balance should not be negative");
        }
        // this is used to address current file or field
        this.account = nextAccountNumber++;
        this.balance = balance;
        this.name = name;
    }
    public int getAccount{
        return account;
    }
    //deposit method
    public void deposit(double amount){
        if (amount <= 0){
            throw new IllegalArgumentException("Amount should be positive");
        }
        //adding the amount to the bank
        this.balance += amount;
    }
    // withdraw method
    public void withdraw(double amount){
        if (this.balance < amount) {
            throw new IllegalArgumentException("Insufficient Balance");
        }
        // making withdraw from acc balance
        this.balance -= amount;
    }
    //Balance enquiry method
    public double getBalance(){
        return this.balance;
    }
    //using override decorator to override the toString() as it is initialized itself when we print
    @Override
    public String toString(){
        //structure of return type of print in console
        return "Account " + account + " ( " + name + " ) : $" + balance;
    }
    // the main method
    public static void main(String[] args){
        //object creation and applying methods
        BankAccount acc1 = new BankAccount(123,1000,"Sanjay");
        acc1.deposit(200);
        acc1.withdraw(500);
        System.out.println(acc1);
    }
}
