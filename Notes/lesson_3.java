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
    //? You can use { %d } with { System.out.printf() }

    String firstName, lastName;
    float salary, netSalary;
    System.out.print("Enter your first name: ");
    firstName = input.next();
    System.out.print("Enter your last name: ");
    lastName = input.next();
    System.out.print("Enter your salary: ");
    salary = input.nextFloat();
    netSalary = salary - (salary * 0.17f);
    System.out.printf("Your name is %s %s, and your net salary is %.2f",firstName,lastName,netSalary);

    input.close();
    
  }
  
}

/*_______________________________*/

//! Java Data Types

//? character --> char
//? integer --> int 
//? short integer --> short int (OR short)
//? long integer --> long int (OR long)
//? boolean value (true OR false) --> boolean
//? floating point number --> float
//? double precision floating point number --> double
//? long double precision floating point number --> long double
//? string (sentence or word or char) --> String

/*_______________________________*/