import java.util.Scanner;

// Create an application that acts as an ATM machine. The initial balance should start at 0. 
// Ask the user for a deposit/withdrawal and use this to affect the actual balance. Reflect the change in balance using a print out statement.
// This transaction process should loop till the user types done instead of a number.
class Main {
  public static void main(String[] args) {
      boolean finished = false;
      double accountBalance = 0;
      Scanner myScanner = new Scanner(System.in);
    
      System.out.println("Your balance is: " + String.format("%.2f",accountBalance));
      System.out.println("Please input your deposit/withdrawal amount (negative values count as withdrawal):");
      System.out.println("Please type done when transaction is complete or you want to exit");
        
      while(!finished)
      {
        if(myScanner.hasNextDouble())
        {
          double tempDouble = myScanner.nextDouble();
            if(accountBalance + tempDouble >= 0)
            {
              accountBalance = accountBalance + tempDouble;
            }
            else
            {
              System.out.println("Your account can't have negative values");
            }
          
          System.out.println("Your balance is: " + String.format("%.2f",accountBalance));
          System.out.println("Please input your deposit/withdrawal amount (negative values count as withdrawal)");
        }
        else
        {
          
          if(myScanner.next().equals("done"))
          {
            finished = true;
          }
          else
          {
              System.out.println("If you want to exit the program, please make sure to enter 'done'");
          }
        }
          
      }
    
      myScanner.close();
  }
}
