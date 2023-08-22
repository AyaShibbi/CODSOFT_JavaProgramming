package Task_3;
/**
 * @author Aya Shibbi
 * 
 * Email: ayashibbi@gmail.com
 */

public class ATM extends BankAccount{
    private double balance = super.accountBalance;
    
    public double checkBalance(){
        return super.accountBalance;
    }
    
    public void withdraw(double amount){
            balance -= amount;
            super.setAccountBalance(balance);
    }
    
    public void deposit(double amount){
        balance += amount;
        super.setAccountBalance(balance);
    }
}
