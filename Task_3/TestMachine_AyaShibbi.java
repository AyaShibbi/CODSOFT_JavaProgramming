package Task_3;
/**
 * @author Aya Shibbi
 * 
 * Email: ayashibbi@gmail.com
 */

import java.util.Scanner;
public class TestMachine_AyaShibbi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n; //number chosen from menu
        double amount;
        ATM am = new ATM();//create an ATM object
        
        //Designing the interface and taking user input
        do{
            System.out.println("Menu: ");
            System.out.println("1. Check your balance \n2. Deposite \n3. Withdraw \n4. Exit ");
            System.out.print("Enter your choice: ");
            n = input.nextInt();
            
            //if n is invalid input (not in the range of 1 - 4)
            while(n < 1 || n > 4){
                System.out.println("Invalid input.");
                System.out.print("Enter your choice: ");
                n = input.nextInt();
            }
            
            if(n == 1) //check balance
                System.out.println("Your balance is: " + am.checkBalance());
            else if(n == 2){ //deposit
                System.out.print("Enter deopsit amount: ");
                amount = input.nextDouble();
                am.deposit(amount);
                System.out.println("Deposit successful.");
            }
            else if(n == 3){ //withdraw
                System.out.print("Enter withdrawal amount: ");
                amount = input.nextDouble();
                if(amount <= am.checkBalance() && amount >= 0){
                    am.withdraw(amount);
                    System.out.println("Withdrawal successful.");
                }
                else
                    System.out.println("Not enough funds.");
            }
        }while(n != 4);
        
        //Exit
        System.out.println("Exiting ATM. Thank you!");
    }
}
