import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * This program will demonstrate the switch statement, decimal format and
 * printf method.
 */

public class SwitchDecimalPrintf
{
 public static void main(String[] args)
 {
   Scanner keyboard = new Scanner(System.in);
   DecimalFormat formatter = new DecimalFormat("#,##0.00");
   double cost;
   int numInt;
   
   // Ask the user for a number to demonstrate the switch Statement
   System.out.println("Please enter a number between 1 - 3.");
   numInt = keyboard.nextInt();
   
   // Switch statement will determine where the program branches.
   switch (numInt)
   {
     case 1:
       System.out.println("You entered 1.");
       break;
     case 2:
       System.out.println("You entered 2.");
       break;
     case 3:
       System.out.println("You entered 3.");
       break;
     default:
       System.out.println("Your number is not 1, 2, or 3.");
   }
   
   
   // Demonstrate the decimal format by asking the user to enter a cost.
   System.out.println("Enter a dollar amount, with cents. Use an amount that " +
                      "uses a comma. Include 4 digits in the cents portion.");
   cost = keyboard.nextDouble();
   System.out.println("Your amount is $" + (formatter.format(cost)) + ".");
     
  
   // Show the printf method in action.
   int number1 = 10;
   int number2 = 20;
   int number3 = 2343;
   int number4 = 29938;
   System.out.printf("There is no special formatting here using the printf method.\n");
   System.out.printf("This uses the printf method's ability to insert int variables such as %d and %d.\n",
                    number1, number2);
   // The digit between the % and d are the spaces allocated for the number.
   System.out.printf("You can create a table using printf, like so:\n");
   System.out.printf("%6d %6d\n", number1, number3);
   System.out.printf("%6d %6d\n", number2, number4);
     
   
 }
  
}
