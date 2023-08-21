package Task_1;
/**
 * @author Aya Shibbi
 * 
 * Email: ayashibbi@gmail.com
 */

import java.util.Scanner;
public class NumberGame_AyaShibbi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rand, x, numberOfRounds = 0, attempts = 0, score = 0, totalAttempts = 0;
        String play = " ";
        
        System.out.println("Start the game!!!\n--------------------------------------------");
        
        do{
            rand = 0 + (int) (Math.random() * (100 - 0 + 1)); //generating a random number
            
            System.out.print("Enter an integer: ");
            x = input.nextInt(); //user input -- guess the random number
            
            //repeat until the user guess the random number AND number of attempts didn't exceed the accepted max. attempts(which is 5)
            while(x != rand && attempts < 5){
                System.out.println("ATTEMPTS: " + attempts);

                if(x > rand)
                    System.out.println("Your guess was too high.");
                else
                    System.out.println("Your guess was too low.");

                System.out.print("Try again. Enter an integer: ");
                x = input.nextInt();
            
                attempts++;
            }
            
            //if attempts exceeded the accepted max. attempts --> reset attempts to 0
            if(attempts >= 5){
                totalAttempts += attempts;
                attempts = 0;
            }
            
            if(x != rand)
                System.out.println("You lost all your 5 attempts. The generated number was: " + rand);
        
            if(x == rand){
                System.out.println("Your guess is correct!");
            
                if(attempts == 0)
                    score += 50;
                else if(attempts == 1)
                    score += 40;
                else if(attempts == 2)
                    score += 30;
                else if(attempts == 3)
                    score += 20;
                else if(attempts == 4)
                    score += 10;
                else if(attempts == 5)
                    score += 0;
            }
            
            numberOfRounds++;
        
            System.out.print("Want to play again? (Enter Yes or No):  ");
            play = input.next();
        }while(play.equalsIgnoreCase("Yes"));
        
        System.out.println("--------------------------------------------");
        System.out.println("Your Score: " + score);
        System.out.println("Number of rounds: " + numberOfRounds);
        System.out.println("Number of attempts: " + totalAttempts);
        System.out.println("--------------------------------------------");
    } 
}
