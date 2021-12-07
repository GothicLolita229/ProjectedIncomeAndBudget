package linaresfinalexam;

/**
 * Lourdes Linares
 * 12.7.2021
 * Final Exam
 * Calculate gross pay for user
 * 
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class LinaresFinalExam {

   
    public static void main(String[] args) 
    {
        displayInfo();
        double rate = getRate();
        double hours = getHours();
        double grossPay = calculateGrossPay(rate, hours);
        displayRHGrossPay(rate, hours, grossPay);
        
    }
    public static void displayInfo()
    {
        System.out.println("Lourdes Linares");
        System.out.println("December 7th, 2021");
        System.out.println("This program calculates the gross pay "
                + "for an individual");
    }
    public static double getRate()
    {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter your pay rate: $");
        rate = k.nextDouble();
        return rate;
    }
    public static double getHours()
    {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter your hours worked: ");
        hours = k.nextDouble();
        return hours;
    }
    public static double calculateGrossPay(double rate, double hours)
    {
        return rate * hours;
    }
    public static void displayRHGrossPay(double rate, double hours, double grossPay)
    {
        DecimalFormat df = new DecimalFormat("#,###,###,##0.00");
        System.out.println("The pay rate is $" + df.format(rate));
        System.out.println("The hours worked are $" + df.format(hours));
        System.out.println("The gross pay is $" + df.format(grossPay));
    }
}
