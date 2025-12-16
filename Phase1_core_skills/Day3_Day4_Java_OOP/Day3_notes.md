# Constructor() vs Main() :
    - Constructor is a initializer which initializes the required parameter when it is called. 
    Whereas, main() is a method which an entry point of the program in java.
    - You can think of Constructor in java as __init__ in python. Both, serves the same purpose
    but in constructors can use the same name with different parameters whereas __init__ in python
    can be used throughout the class using self as argument.
    - Java main method is like Main method in python (if __name__ == '__main__':). both serves the
     same purpose.
    - Constructors are used by main method in java.
    - Example usage: main() BankAccount acc = new BankAccount("Sanjay","123", 1000) -> calls the 
    constructor.
    - Constructor doesn't return anything not even void, main returns void explicitly.
    - Class name and constructor name should be same in java.

## Method Signatures
    - In java we have access modifiers which are used to control the access. It uses (public, 
    private, protected).
        - public accessible in and out of class - anywhere.
        - private accessible within the class and only when its called - only in class when called.
        - protected - same package + subclasses.
        - default - no access modifier used ( packages only).
    - Format: `accessModifier returnType methodName(parameters)`
    - Parameter rules: `type name`, multiple: `(String name, double balance, int id)
    - used keywords -
        public     → Who can call it
        void       → What it returns (void = nothing)
        deposit    → Name you call it by
        (double amount) → What it needs to work
    - Examples -
        1. public void deposit(double amount)           → Main calls: acc.deposit(500)
        2. private void validateAmount(double amt)      → deposit() calls internally
        3. public double getBalance()                   → double bal = acc.getBalance()
        4. public BankAccount(String name, double bal)  → Constructor: new BankAccount("John", 1000)
        5. private String getAccountNumber()            → Internal use only
        6. public boolean withdraw(double amount)       → if(acc.withdraw(200)) { ... }
        7. protected double calculateInterest()         → SavingsAccount can override
        8. void printDetails()                          → Default access (package only)
        9. public String toString()                     → System.out.println(acc)
        10. private static int nextAccountId()          → Shared class utility

## Scanner Input
    - Scanner method used to import values
    - Import: `import java.util.Scanner;`
    - Create: `Scanner sc = new Scanner(System.in);`
    - we don't need to create scanner object multiple times instead we have some methods in 
    scanner that can help in taking input multiple times as below read types. 
    - Read types:
        - `String name = sc.nextLine();` - full line (spaces OK)
        - `double amount = sc.nextDouble();` - numbers only
        - `int id = sc.nextInt();`
    - Close: `sc.close();` (good practice) - we need to close the scanner object when the usage 
    is done.
    - BankAccount example: Read holderName + initialBalance in main()
        - Scanner sc = new Scanner();
        - System.out.println("Enter the Name: ");
        - String name = sc.nextline();
        - System.out.println("Enter the amount: ");
        - String int_input = sc.nextline();
        - double amount = Double.parseDouble(init_input);
    Pitfall: nextDouble() → nextLine() skips input
    FIX: `Double.parseDouble(sc.nextLine())`

## Basic Exceptions
    - Exceptions handle errors gracefully instead of crashing program.
    - Below is the one error exception.
        - Throw custom errors: `throw new IllegalArgumentException("Negative balance not allowed");`
    - error can be thrown inside the methods and applied in main function.
    - these exceptions are applied in main method using try{ //logic} catch (IllegalArgumentException e)
    { //outputs error}.

    - Common BankAccount cases:
        | Scenario | Exception |
        |----------|-----------|
        | balance < 0 | `IllegalArgumentException` |
        | deposit <= 0 | `IllegalArgumentException` |
        | withdraw > balance | `IllegalArgumentException` |
    
    - Handle in main(): `try { acc.deposit(-100); } catch (Exception e) { System.out.println(e.getMessage()); }`

# BankAccount Mastery ✅

## 1. Private Fields (Encapsulation)
    private int account;
    private double balance;
    private String name;
    // ONLY accessible via methods (data hiding)

## 2. Constructor Validation
    public BankAccount(int account, double balance, String name) {
    if (balance < 0) {
    throw new IllegalArgumentException("Initial balance >= 0");
    }
    this.account = account; // Parameter → Permanent Field
    this.balance = balance;
    this.name = name;
    }

## 3. `this` Keyword Mastery 
    | Usage | Example | Purpose |
    |-------|---------|---------|
    | Field assignment | `this.balance = balance;` | Avoid parameter shadowing |
    | Method calls | `this.deposit(100);` | Explicit object reference |
    | Constructor chaining | `this(account, 0);` | Call another constructor |
    - in python self serves the same instincts as this in java

## 4. Instance Methods (No Account Parameter!)
    **Key**: `acc1.deposit(500)` → `this` = `acc1`
    - here to get the balance we don't need any parameters.

## 5. Exception Hierarchy
    Constructor: IllegalArgumentException (balance < 0)
    deposit(): IllegalArgumentException (amount <= 0)
    withdraw(): IllegalArgumentException (insufficient funds)

## 6. toString() Override (Auto-Magic)
    @Override
    public String toString() {
    return "Account " + account + " (" + name + "): $" + balance;
    }
    // println(acc1) → AUTO calls toString()
## 7. Switch-Case for Menus (vs If-Else)
    switch(choice) {
    case 1: deposit(); break;
    case 2: withdraw(); break;
    default: error();
    }
    // O(1) jump table vs O(n) if-else chain
## 8. Complete CLI Main.java
    switch(choice) {
    case 1:
    double amt = sc.nextDouble();
    acc.deposit(amt);
    break;
    case 2: /* try-catch withdraw */ break;
    case 3: System.out.println(acc); break;  // toString() magic!
    case 4: return;
    }

## 9. Cross-Language Comparison
    | Feature | Java | Python 3.10+ | JavaScript |
    |---------|------|--------------|------------|
    | Private | `private` | `_field` | `#private` |
    | toString | `@Override toString()` | `__str__()` | `toString()` |
    | Switch | `switch(choice)` | `match choice:` | No native |
    | this | `this.field` | `self.field` | `this.field` |

## 10. Java Annotations
    @Override // Verify overriding parent method
    @Deprecated // Warn: Don't use this
    @SuppressWarnings // Disable specific compiler warnings