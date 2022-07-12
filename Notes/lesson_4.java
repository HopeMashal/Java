/*_______________________________*/
//! Arithmetic Operators!! 

package Notes;

public class lesson_4 {
  public static void main(String[] args){
    System.out.println(2+3*5); //* The output is 17
    System.out.println((2+3)*5); //* The output is 25
    System.out.println(2*5*5+3*5+7); //* The output os 72 --> (10*5+15+7 = 50+22 = 72)

    System.out.println(5/2); //* The output is 2

    int i=9, j=2;
    System.out.println(i/j); //* The output is 4

    System.out.println(5.0/2); //* The output is 2.5

    System.out.println(5f/2); //* The output is 2.5 --> f = float

    float k=9, l=2;
    System.out.println(k/l); //* The output is 4.5

    System.out.println((float)i/j); //* The output is 4.5
    System.out.println(i/(float)j); //* The output is 4.5
  }
  
}

/*_______________________________*/

//! Arithmetic Operators

//? Addition --> +
//? Subtraction --> -
//? Multiplication --> *
//? Division --> /
//? Remainder --? %

/*_______________________________*/

//! Precedence of arithmetic operations (--> L to R)

//? 1- Parentheses ()
//? 2- *,/,%
//? 3- +,-

/*_______________________________*/

//! Data Type of an arithmetic expression

//? Integer --> If all operands are integer
//? Float --> If at least one operand is float and there is no double
//? Double --> If at least one operand is double

/*_______________________________*/