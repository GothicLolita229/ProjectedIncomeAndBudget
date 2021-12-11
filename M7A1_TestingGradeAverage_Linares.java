package m7a1_testinggradeaverage_linares;

/**
 * Lourdes Linares
 * M7A1
 * 11.30.2021
 * this program will ask user for five test scores and then display the letter 
 * grades and the average test score.
 * It will use two functions: calcAverage() and determineGrade()
 * 
 */
import java.util.Scanner;
public class M7A1_TestingGradeAverage_Linares 
{

    
    public static void main(String[] args) 
    {
        Scanner k = new Scanner(System.in);
        double total;
        //String letterGrade;
        getInput();
        //maybe use a while loop here
    }

    
    public static double getInput()
    {
        Scanner k = new Scanner(System.in);
        double grades, average = 0, score, total = 0;
        //char letterGrade;
        System.out.print("Enter scores: ");
        for(grades = 0; grades < 5; grades++ )
        {
        //System.out.println("Enter score: ");
        score = k.nextDouble();
        String message = "Your grade is ";
        determineGrade(score, message);
        total += score;
        }
        //return total;
        calcAverage(total);
        return total;
    }
    
   
    public static double calcAverage(double total)
    {
        double average;
        String message; //new
        average = total/5;
        message = "Your average grade is " + average + "/";
        determineGrade(average, message);
        //System.out.println("Your average grade is " + average);
        
        return average;
        
        
    }
    
    
    public static void determineGrade(double testScore, String message)
    {
        char letterGrade;
        //int testScore = 0;
        if (testScore >= 90)
        {
            letterGrade = 'A';  
        }
        else if (testScore >= 80)
        {
            letterGrade = 'B';
        }
        else if (testScore >= 70)
        {
            letterGrade = 'C';
        }
        else if (testScore >= 60)
        {
            letterGrade = 'D';
        }
        else
        {
            letterGrade = 'F';
        }
        System.out.println(message + letterGrade); 
        //return letterGrade;
    }
    
}
