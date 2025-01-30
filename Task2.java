import java.util.Scanner;

public class BankingApplication {

    
    private static double balance = 0.0;

    public static void displayMenu() {
        System.out.println("\n----- Banking Application -----");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.print("Please choose an option (1-4): ");
    }

    public static void deposit(Scanner scanner) {
        System.out.print("Enter the amount to deposit: Rupees");
        double depositAmount = scanner.nextDouble();
        if (depositAmount > 0) {
            balance += depositAmount;
            System.out.println("Successfully deposited Rupees" + depositAmount);
        } else {
            System.out.println("Invalid amount. Deposit must be greater than 0.");
        }
    }

    public static void withdraw(Scanner scanner) {
        System.out.print("Enter the amount to withdraw: Rupees");
        double withdrawAmount = scanner.nextDouble();
        if (withdrawAmount > 0 && withdrawAmount <= balance) {
            balance -= withdrawAmount;
            System.out.println("Successfully withdraw Rupees" + withdrawAmount);
        } else if (withdrawAmount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid amount. Withdrawal must be greater than 0.");
        }
    }
    public static void checkBalance() {
        System.out.println("Current balance: Rupees" + balance);
    }

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            displayMenu();

            
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number between 1 and 4.");
                scanner.next(); 
            }
            choice = scanner.nextInt();

            
            switch (choice) {
                case 1:
                    deposit(scanner); 
                    break;
                case 2:
                    withdraw(scanner); 
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting the system."); 
                 
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 4); 

        scanner.close();
    }
}
