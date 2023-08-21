package Task_3;
/**
 * @author Aya Shibbi
 * 
 * Email: ayashibbi@gmail.com
 */

public class ATM extends BankAccount{
    private double balance = super.accountBalance;
    
    public void checkBalance(){
        System.out.println("Your balance is: " + super.accountBalance);
    }
    
    public void withdraw(double amount){
        if(amount <= super.accountBalance && amount >= 0){
            balance -= amount;
            super.setAccountBalance(balance);
        }
        else
            System.out.println("Not enough funds.");
    }
    
    public void deposit(double amount){
        balance += amount;
        super.setAccountBalance(balance);
    }
}
