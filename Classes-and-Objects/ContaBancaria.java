    public class ContaBancaria {
        public static void main(String[] args) {
           BankAccount account = new BankAccount("123456", 
           1000.0, "Bernardo Martins");
            account.displayDetails();
            account.deposit(500.0);
            account.withdraw(200.0);
            account.displayDetails();
    }
}

class BankAccount{
    String accountNumber;
    Double balance;
    String customerName;

    public BankAccount(String accountNumber, Double balance, String customerName){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
    }
    public void deposit(Double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(Double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
    public void displayDetails(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Customer Name: " + customerName);
    }
}


    