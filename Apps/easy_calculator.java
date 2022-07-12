// In this app, I used if/else if/else statement

package Apps;
import java.util.Scanner;

public class easy_calculator {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the first integer: ");
    float number1 = input.nextFloat(); // read first number from user

    System.out.print("Enter the second integer: ");
    float number2 = input.nextFloat(); // read second number from user

    System.out.print("Enter the operator: ");
    String operator = input.next(); // read operator from user

    if (operator.equals("+")){
      System.out.printf("The equation is: %.2f + %.2f = %.2f%n", number1, number2, number1+number2);
    } else if (operator.equals("-")){
      System.out.printf("The equation is: %.2f - %.2f = %.2f%n", number1, number2, number1-number2);
    } else if (operator.equals("/")){
      System.out.printf("The equation is: %.2f / %.2f = %.2f%n", number1, number2, number1/number2);
    } else if (operator.equals("*")){
      System.out.printf("The equation is: %.2f * %.2f = %.2f%n", number1, number2, number1*number2);
    } else if (operator.equals("%")){
      System.out.printf("The equation is: %.2f %% %.2f = %.2f%n", number1, number2, number1%number2);
    } else if (operator.equals("^")){
      System.out.printf("The equation is: %.2f ^ %.2f = %.2f%n", number1, number2, Math.pow(number1, number2));
    } else {
      System.out.println("PLEASE ENTER (+,-,*,/,%,^) !!!");
    }

  }
  
}
