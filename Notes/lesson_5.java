/*_______________________________*/
//! If statement!!

package Notes;
import java.util.Scanner;

public class lesson_5 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int marks;
    System.out.print("Enter Your Marks: ");
    marks = input.nextInt();

    if (marks >= 60){
      System.out.println("Congratulations :), you passed!!");
      System.out.println("Go to the next level!");
    } else {
      System.out.println("Ohh no :(, you failed!!");
    }

    int number;
    System.out.print("Enter number to test: ");
    number = input.nextInt();
    if (number % 2 == 0){
      System.out.printf("%d is even number! %n",number);
    } else {
      System.out.printf("%d is odd number! %n",number);
    }

    int num;
    System.out.print("Enter number to test: ");
    num = input.nextInt();
    if (num > 0){
      System.out.printf("%d is positive number! %n",num);
    } else {
      System.out.printf("%d is negative number! %n",num);
    }

    int number1;
    System.out.print("Enter number to test: ");
    number1 = input.nextInt();
    if (number1 >=0){
      if (number1 % 2 == 0){
        System.out.printf("%d is positive number! %n",number1);
        System.out.printf("%d is even number! %n",number1);
      } else {
        System.out.printf("%d is positive number! %n",number1);
        System.out.printf("%d is odd number! %n",number1);
      }
    } else {
      System.out.printf("%d is negative number! %n",number1);
    }

    int num1,num2;
    System.out.print("Enter Number 1: ");
    num1 = input.nextInt();
    System.out.print("Enter Number 2: ");
    num2 = input.nextInt();
    if (num1 == num2){
      System.out.println("Both are equal!!");
    } else if (num1>num2){
      System.out.println("Number 1 is greater than Number 2!!");
    } else {
      System.out.println("Number 2 is greater than Number 1!!");
    }


  }
  
}

/*_______________________________*/

//! The control statements are categorized in almost two groups:

//? 1- Selection control statements --> like If Statement
//? 2- Repetition control statements

/*_______________________________*/

//! Relational Expression and Relational Operators 

//? == --> Equal to
//? != --> Not Equal to
//? < --> Less than
//? <= --> Less than or Equal to
//? > --> Greater than
//? >= --? Greater than or Equal to

/*_______________________________*/