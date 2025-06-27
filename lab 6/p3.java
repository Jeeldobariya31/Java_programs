
        class Bank_Account {
                // Data members
                private String accountNo;
                private String userName;
                private String email;
                private String accountType;
                private double accountBalance;
            
                // Method to get account details
                public void getAccountDetails(String accountNo, String userName, String email, String accountType, double accountBalance) {
                    this.accountNo = accountNo;
                    this.userName = userName;
                    this.email = email;
                    this.accountType = accountType;
                    this.accountBalance = accountBalance;
                }
            
                // Method to display account details
                public void displayAccountDetails() {
                    System.out.println("Account Number: " + accountNo);
                    System.out.println("User Name: " + userName);
                    System.out.println("Email: " + email);
                    System.out.println("Account Type: " + accountType);
                    System.out.println("Account Balance: " + accountBalance);
            }
        }
        public class p3 {
        
                public static void main(String[] args) {
                        Bank_Account account = new Bank_Account();
                        account.getAccountDetails("123456789", "John Doe", "john.doe@example.com", "Savings", 5000.0);
                        account.displayAccountDetails();
                    }
        }
            
