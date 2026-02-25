package Module3;

public class BankAccount {
        private int accountNumber;
        private double balance;

        // Constructor
        public BankAccount (int accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        // Deposit method
        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }

        // Withdraw method
        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient Balance!");
            }
        }

        // Getter method
        public double getBalance() {
            return balance;
        }

        public static void main(String[] args) {
            BankAccount obj = new BankAccount(101, 5000);
            obj.deposit(2000);
            obj.withdraw(1000);
            System.out.println("Final Balance: " + obj.getBalance());
        }
    }

