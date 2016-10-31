/* Assignment: A Charge Account Statement Lab
 * Date: 10/7/15
 * Course: AP Comp Sci
 * Author: Kirby Kasischke
 * Purpose: Prepares a charge account statement for a CS CARD International client
*/

import java.util.*;
import java.text.NumberFormat;
public class ChargeAccountStatement{
  public static void main (String[] args){
    Scanner scan = new Scanner (System.in);
    System.out.println("Enter previous balance on card: ");
    double oldBalance = scan.nextDouble();
    System.out.println("Enter total charges during the month: ");
    double totalCharges = scan.nextDouble();
    double newBalance = oldBalance + totalCharges;
    
    double minPayment=0;
    double interest;
    
    if (oldBalance > 0.0)
      interest = newBalance * .002;
    else
      interest = 0.0;
    
    newBalance = newBalance + interest;
    
    if (newBalance < 50.0)
      minPayment = newBalance;
    else if (newBalance >= 50.0 && newBalance <= 300.0)
      minPayment = 50.0;
    else if (newBalance > 300.0)
      minPayment = newBalance * .2;
    
    
    NumberFormat money = NumberFormat.getCurrencyInstance();
    System.out.println("CS CARD International Statement");
    System.out.println("===============================");
    System.out.println();
    System.out.println("Previous Balance:  \t" + money.format(oldBalance));
    System.out.println("Additional Charges:\t" + money.format(totalCharges));
    System.out.println("Interest:          \t" + money.format(interest));
    System.out.println();
    System.out.println("New Balance:       \t" + money.format(newBalance));
    System.out.println();
    System.out.println("Minimum Payment:   \t" + money.format(minPayment));
    scan.close();
  }
}
    