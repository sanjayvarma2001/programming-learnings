public SavingsAccount extends BankAccount{
    private double interestRate;
    public SavingAccount(int account, double balance, String name, double interestRate){
        super(int account, double balance, String name);
        this.interestRate = interestRate;
    }
    public void AddInterest(){
        double interest = this.getBalance() * this.interestRate /100;
        this.deposit() += interest;
    }
}