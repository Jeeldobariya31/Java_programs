import java.util.Scanner;

class BankAccount {
    int account_no;
    double balance;

    public BankAccount(int account_no, double balance) {
        this.account_no = account_no;
        this.balance = balance;
    }

    public void deposit(double deposit_amount) {
        this.balance += deposit_amount;
        System.out.println("Deposit is successful");
        System.out.println("Now your account balance is " + this.balance);
    }

    public void withdraw(double withdraw_amount) {
        try {
            if (this.balance < 5000) {
                throw new Exception("Your account does not have sufficient balance");
            } else {
                if (withdraw_amount > this.balance) {
                    throw new Exception("Insufficient funds for withdrawal");
                } else {
                    this.balance -= withdraw_amount;
                    System.out.println("Withdrawal is successful");
                    System.out.println("Now your account balance is " + this.balance);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your bank account number:");
        int bankAccountNo = sc.nextInt();

        System.out.println("Enter your initial balance (should be greater than 6000):");
        double bal = sc.nextDouble();

        try {
            if (bal >= 6000) {
                BankAccount b1 = new BankAccount(bankAccountNo, bal);

                System.out.println("\nChoose an option:");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                if (choice == 1) {
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    b1.deposit(depositAmount);
                } else if (choice == 2) {
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    b1.withdraw(withdrawAmount);
                } else {
                    System.out.println("Invalid choice!");
                }

            } else {
                throw new Exception("Your account does not have sufficient balance");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } 
        finally {
            sc.close();
        }
    }
}
