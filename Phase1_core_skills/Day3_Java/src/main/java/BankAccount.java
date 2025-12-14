public class BankAccount {
    private int account;
    private double balance;
    private String name;

    public BankAccount(int account, double balance, String name){
        if (balance < 0){
            throw new IllegalArgumentException("Initial balance should not be negative");
        }
        this.account = account;
        this.balance = balance;
        this.name = name;
    }

    public void deposit(double amount){
        if (amount <= 0){
            throw new IllegalArgumentException("Amount should be positive");
        }
        this.balance += amount;
    }

    public void Withdraw(double amount){
        if (this.balance < amount) {
            throw new IllegalArgumentException("Insufficient Balance");
        }
        this.balance -= amount;
    }

    public double getBalance(){
        return this.balance;
    }

    @Override
    public String toString(){
        return "Account " + account + " ( " + name + " ) : $" + balance;
    }

    public static void main(String[] args){
        BankAccount acc1 = new BankAccount(123,1000,"Sanjay");
        acc1.deposit(200);
        acc1.Withdraw(500);
        System.out.println(acc1);
    }
}
