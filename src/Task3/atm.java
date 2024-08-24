package Task3;
import java.util.Scanner;

public class atm {
    private bankAccount account;
    public atm(bankAccount account){
        this.account=account;

    }
    public void withdraw(double amount){
        if(amount>0 &&  account.getBalance()>=amount){
            account.withdraw(amount);
            System.out.println("Withdrawal successful! Amount withdrawn: " + amount);
            System.out.println("Available Balance : "+account.getBalance());
        }else {
            System.out.println("Insufficient Balance! or Invalid Amount!");
        }
    }

    public void deposit(double amount){
        if(amount>0){
            account.deposit(amount);
            System.out.println("Deposit successful! Amount deposited: " + amount);
            System.out.println("Available Balance : "+account.getBalance());
        }
        else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public  void checkBalance(){
        System.out.println("Your current Balance : "+account.getBalance());
    }

}
