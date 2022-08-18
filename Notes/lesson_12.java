/*_______________________________*/
//! Introduction of Methods!!

package Notes;
import java.util.Scanner;

public class lesson_12 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Number to calculate square root of its: ");
    double a = input.nextDouble();
    double result = Math.sqrt(a);
    System.out.println("The square root of "+a+" is equal "+result);

    input.close();
    
  }
  
}

/*_______________________________*/

//! Functions - Methods

//? A function: is a self-contained block of statements that perform a specific

//? Using a function is something like hiring a person to do specific job for you

/*_______________________________*/

//! Function Definition

/*  
  return-value-type function-name (parameter-list){
      Lines of code to be executed
      ... (BODY)
  } 
*/

//? return-value-type ==> Mandatory/Void

/*_______________________________*/

//? Example: Calculate and print out the sum and the average of 3 student marks
// TODO --> Task 1 -> Get_Marks()
// TODO --> Task 2 -> Calc_Sum()
// TODO --> Task 3 -> Calc_Avg()
// TODO --> Task 4 -> Print_Out()

/*_______________________________*/

//! Invoking Function (From the main())

//? function-name(Actual Parameter-list)

/*_______________________________*/

//! Function Types

//? 1- Built in Function (Ready Made) --> ex. Math Functions Like 

/* 
 * int abs(int number);
 * double pow(double base, double exponent);
 * double floor(double number);
 * double sqrt(double number);
 */


/*_______________________________*/