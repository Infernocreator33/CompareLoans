
package compareloans;

import java.util.Scanner;

/**
 *
 * @author zs087
 */
public class CompareLoans 
{
    public static void main(String[] args)
    {
         double annualInterestRate = 5.00;
        
        //scanner
        Scanner input = new Scanner(System.in);
        
        //getting loan amount
        System.out.printf("Loan amount: ");
        double loanAmount = input.nextDouble();
        
        //ask number of years
        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();
        
        //formatting title display
        
        System.out.printf("%-1s%20s%20s\n", "Interest Rate", "Monthly Payment", "Total Payment");
        //making loop to display different interest rates
        for( ; annualInterestRate <= 8.00; annualInterestRate += 0.125)
        {
            //calculating monthly and total payment rates
            double monthlyInterestRate = annualInterestRate / 1200;
            double monthlyPayment = loanAmount * monthlyInterestRate / ( 1- 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
            
            double totalPayment = monthlyPayment * numberOfYears * 12;
            
            //making % string for formatting reasons
            String str = "%";
            
            //displaying formatted info
            System.out.printf("%-1.3f%s%17.2f%24.2f \n", annualInterestRate, str, ((int)(monthlyPayment * 100) / 100.0), ((int)(totalPayment * 100) / 100.0));
            
        }
    }
}
