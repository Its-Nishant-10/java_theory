class Bank_acc {
    double balance;

    void setBalance(double b) {
        balance = b;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void Balance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Bank_acc bank = new Bank_acc();
        bank.setBalance(1000);
        bank.deposit(200);
        bank.withdraw(400);
        bank.Balance();
    }
}
