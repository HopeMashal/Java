/*_______________________________*/
//! Input & Variables!! 

package Notes;
import java.util.Scanner; //Program uses class Scanner

public class lesson_3 {
  public static void main(String[] args){
    //? Create a scanner to obtain input from the command window
    Scanner input = new Scanner(System.in);

    System.out.print("Enter first integer: ");
    int number1 = input.nextInt(); // read first number from user

    System.out.print("Enter second integer: ");
    int number2 = input.nextInt(); // read second number from user

    int sum = number1 + number2; //add numbers

    System.out.printf("%d + %d = %d%n", number1, number2, sum); // display sum
    //* The output is number1 + number2 = sum
    System.out.printf("Sum is %d%n", sum);
    //? %n --> new line
    //? %d --> integer value
  }
  
}

/*_______________________________*/

//? integer --> int
//? floater --> float
//? string (sentence or word or char) --> string

/*_______________________________*/