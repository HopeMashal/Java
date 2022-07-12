// In this app, I used switch and if/else if/else statement

package Apps;
import java.util.Scanner;

public class calculator {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the first integer: ");
    float number1 = input.nextFloat(); // read first number from user

    System.out.print("Enter the second integer: ");
    float number2 = input.nextFloat(); // read second number from user

    System.out.println("\n ____________________________________");
    System.out.println("|  Please enter the operator number  |");
    System.out.println("|        Enter 1 for sum (+)         |");
    System.out.println("|        Enter 2 for sub (-)         |");
    System.out.println("|        Enter 3 for div (/)         |");
    System.out.println("|        Enter 4 for mul (*)         |");
    System.out.println("|        Enter 5 for rod (%)         |");
    System.out.println("|        Enter 6 for pow (^)         |");
    System.out.println("|____________________________________|\n");
    System.out.print("Enter the operator: ");
    int operator = input.nextInt(); // read operator from user

    switch (operator){
      case 1:
        System.out.printf("The equation is: %.2f + %.2f = %.2f%n", number1, number2, number1+number2);
        break;
      case 2:
        System.out.printf("The equation is: %.2f - %.2f = %.2f%n", number1, number2, number1-number2);
        break;
      case 3:
        System.out.printf("The equation is: %.2f / %.2f = %.2f%n", number1, number2, number1/number2);
        break;
      case 4:
        System.out.printf("The equation is: %.2f * %.2f = %.2f%n", number1, number2, number1*number2);
        break;
      case 5:
        System.out.printf("The equation is: %.2f %% %.2f = %.2f%n", number1, number2, number1%number2);
        break;
      case 6:
        System.out.printf("The equation is: %.2f ^ %.2f = %.2f%n", number1, number2, Math.pow(number1, number2));
        break;
      default:
        System.out.println("Incorrect operator, please enter (1 -> + , 2 -> - , 3 -> / , 4 -> * , 5 -> % , 6 -> ^)");
    }

  }
}
