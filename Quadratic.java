//---------------------------------------------------------------------------------------------------------------------
// QUADRATIC FUNCTION CALCULATOR
//---------------------------------------------------------------------------------------------------------------------

import java.util.*;

public class Quadratic
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);

    double a,b,c;
    double answer1 = 0.0;
    double answer2 = 0.0;
    double real = 0.0;
    double imaginary = 0.0;

    System.out.println("Please enter an integer value for a, b , then c for the form "
                         + "ax^2 + bx + c.");
    a = scan.nextDouble();
    b = scan.nextDouble();
    c = scan.nextDouble();

    if ((Math.pow(b,2)-(4*a*c))>=0) {
      answer1 = ((-1*b) + (Math.sqrt(Math.pow(b,2)-(4*a*c))))/(2*a);
      answer2 = ((-1*b) - (Math.sqrt(Math.pow(b,2)-(4*a*c))))/(2*a);
      System.out.println("The roots are " + answer1 +" and " + answer2 + ".");
    } else {
      real = ((-1*b)/(2*a));
      imaginary = ((Math.sqrt(Math.abs(Math.pow(b,2)-(4*a*c))))/(2*a));
      System.out.println("The first root is "+real+" + "+imaginary+"i.");
      System.out.println("The second root is "+real+" - "+imaginary+"i.");
      }


    scan.close();

  }
}

