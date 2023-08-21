package Task_2;
/**
 * @author Aya Shibbi
 * 
 * Email: ayashibbi@gmail.com
 */

import java.util.Scanner;
public class StudentGradeCalculator_AyaShibbi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfSubjects;
        double  average, x, sum = 0;
        char grade;
        
        System.out.print("Enter number of subjects: ");
        numberOfSubjects = input.nextInt();
        
        double[] marks = new double[numberOfSubjects]; //create an array of marks
        
        for(int i = 0; i <= marks.length - 1; i++){
            System.out.print("Enter the mark: ");
            x = input.nextDouble(); //fill the array from user input
            
            //check if the entered mark is valid (in range of 0 - 100)
            while(x > 100 || x < 0){
                System.out.println("Invalid mark. Mark must be out of 100");
                System.out.print("Enter the mark: ");
                x = input.nextDouble();
            }
            
            marks[i] = x; //if x is valid add it to the array
            sum += marks[i]; //total marks
        }
        
        average = sum / numberOfSubjects; //average percentage
        
        //corresponding grade according to the average
        if(average >= 90)
            grade = 'A';
        else if(average >= 80)
            grade = 'B';
        else if(average >= 70)
            grade = 'C';
        else if(average >= 60)
            grade = 'D';
        else
            grade = 'F';
        
        //display results
        System.out.println("Results: ");
        System.out.println("Total marks: " + sum);
        System.out.println("Average percentage: " + average + "%");
        System.out.println("Grade: " + grade);
        
    }
}
