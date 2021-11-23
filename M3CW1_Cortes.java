
package m3cw1_cortes;

/**
 *
 * @author lourd
 */
import java.util.Scanner;

public class M3CW1_Cortes 
{

    public static void main(String[] args) 
    {
        
        Scanner keyboard = new Scanner(System.in);
        String name;
        double payRate;
        int hours;
        double total;
        //PYI is projected yearly income
        double PYI;
        double TAX;
        double AT;
        
        System.out.print("Enter your name: ");
        name = keyboard.nextLine();
        
        System.out.print("Enter your hourly rate: ");
        payRate = keyboard.nextDouble();
        
        System.out.print("Enter the number of hours worked this week: ");
        hours = keyboard.nextInt();
        
        total = payRate * hours;
        
        PYI = total * 52;
        
        TAX = PYI * 0.40;
        
        AT = PYI - TAX;
        
        System.out.println("Here are the values that you entered: ");
        System.out.println(name);
        System.out.println("$" + payRate);
        System.out.println(hours);
        System.out.println("Your weekly earnings are: $" + total);
        System.out.println("Your projected yearly income is: $" + PYI);
        System.out.println("After tax: $" + AT);
                
    }
    
}
