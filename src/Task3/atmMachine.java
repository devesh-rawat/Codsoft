package Task3;
import java.util.*;



public class atmMachine {
    public static void main(String[] args) {
      bankAccount userAccount=new bankAccount(10000);
      atm machine=new atm(userAccount);
      Scanner scanner=new Scanner(System.in);
      int choice;
        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    machine.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    machine.deposit(depositAmount);
                    break;
                case 3:
                    machine.checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting... Thank you for using the ATM!");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (choice != 4);
    }
}
