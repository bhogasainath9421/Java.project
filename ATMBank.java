import java.util.Scanner;

class BankAccount
 {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) 
     {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
     }

    public double getBalance()
    {
        return balance;
    }

    public void deposit(double amount)
     {
        if (amount > 0)
        {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
        else
        {
            System.out.println("Invalid amount for deposit....");
        }
    }

    public void withdraw(double amount) 
        {
          if (amount > 0 && balance >= amount)
           {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
           } 
          else 
           {
            System.out.println("Invalid amount for withdrawal or insufficient balance!");
           }
        }
 }

class ATMbankinterface
     {
       public static void main(String[] args)
       {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        BankAccount account = new BankAccount(accountNumber, initialBalance);

        while (true)
          {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();

            switch (choice) 
              {
                case 1:
                    System.out.println("Current Balance: $" + account.getBalance());
                    break;
                case 2:
                    System.out.print("Enter the deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter the withdrawal amount: $");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
             }
          }
      }
}
