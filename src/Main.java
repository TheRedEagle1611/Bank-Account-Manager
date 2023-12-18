import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.println("Welcome to the bank.");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");

            System.out.println("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Account Number: ");
                    String accNumber = scanner.nextLine();
                    System.out.println("Enter Account Holder Name: ");
                    String accHolder = scanner.nextLine();
                    System.out.println("Enter Initial Balance: ");
                    double initialBalance = scanner.nextDouble();
                    scanner.nextLine();

                    BankAccount newAccount = new BankAccount(accNumber, accHolder, initialBalance);
                    bank.addAccount(accNumber, newAccount);
                    System.out.println("Account created successfully.");
                    break;

                case 2:
                    System.out.println("Enter Account Number: ");
                    String depositAccNumber = scanner.nextLine();
                    System.out.println("Enter Deposit Amount: ");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine();

                    BankAccount depositAccount = bank.getAccount(depositAccNumber);
                    if (depositAccount != null) {
                        depositAccount.deposit(depositAmount);
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;

                case 3:
                    System.out.println("Enter Account Number: ");
                    String withdrawAccNumber = scanner.nextLine();
                    System.out.println("Enter Withdrawl Amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine();

                    BankAccount withdrawAccount = bank.getAccount(withdrawAccNumber);
                    if (withdrawAccount != null) {
                        withdrawAccount.withdraw(withdrawAmount);
                    } else {
                        System.out.println("Account not found.");
                    }

                    break;

                case 4:
                    System.out.println("Enter Account Number: ");
                    String checkAccNumber = scanner.nextLine();

                    BankAccount checkAccount = bank.getAccount(checkAccNumber);
                    if (checkAccount != null) {
                        System.out.println("Account holder: " + checkAccount.getAccountHolder());
                        System.out.println("Account balance: $" + checkAccount.getBalance());
                    } else {
                        System.out.println("Account not found.");
                    }

                    break;

            }
        }
    }
}
