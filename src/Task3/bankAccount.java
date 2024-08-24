package Task3;
import java.util.Scanner;

public class bankAccount {
    private double balance;

    public bankAccount(double initBalance){
        if(initBalance>0){
            balance=initBalance;
        }else {
            balance=0;
        }
    }
    public void withdraw(double amount){
       if(amount>0 && amount<=balance){
           balance-=amount;
       }
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }
    }
    public double getBalance(){
        return balance;
    }

}
