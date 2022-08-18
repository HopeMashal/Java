/*_______________________________*/
//! Switch statement!!

package Notes;
import java.util.Scanner;

public class lesson_6 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Your Grade: ");
    char grade = input.next().charAt(0);

    switch (Character.toUpperCase(grade)){
      case 'A':
        System.out.println("Excellent");
        break;
      case 'B':
        System.out.println("Very Good");
        break;
      case 'C':
        System.out.println("Good");
        break;
      case 'D':
        System.out.println("Fair");
        break;
      case 'F':
        System.out.println("Failed");
        break;
      default:
        System.out.println("Invalid Grade!!!");
    }

    int choice;
    System.out.println("The Choices are:");
    System.out.println("1. Add two numbers");
    System.out.println("2. Sub two numbers");
    System.out.println("3. Get the square of a number");
    System.out.print("Enter Your Choice: ");
    choice = input.nextInt();

    int num1,num2;

    switch (choice){
      case 1:
        System.out.print("Enter the first number: ");
        num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        num2 = input.nextInt();
        System.out.printf("The equation is %d + %d = %d %n",num1,num2,num1+num2);
        break;
      case 2:
        System.out.print("Enter the first number: ");
        num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        num2 = input.nextInt();
        System.out.printf("The equation is %d - %d = %d %n",num1,num2,num1-num2);
        break;
      case 3:
        System.out.print("Enter the number: ");
        num1 = input.nextInt();
        System.out.printf("The equation is %d ^ 2 = %.0f %n",num1,Math.pow(num1, 2));
        break;
      default:
        System.out.println("Invalid Value!!");
    }

    System.out.print("Enter any character: ");
    char myChar=input.next().charAt(0);

    switch (Character.toLowerCase(myChar)){
      case 'a':
      case 'i':
      case 'e':
      case 'u':
      case 'o':
        System.out.printf("%c is vowel!!",myChar);
        break;
      default:
        System.out.printf("%c is normal character!!", myChar);
    }

    input.close();

  }
}

/*_______________________________*/

//! The switch Statement:

/* 
  switch (Expression){ //? Expression data type is integer
    case constant 1: //?constant 1 is integer
      Action Statements;
      break;
    case constant 2: //?constant 2 is integer
      Action Statements;
      break;
    ...
    default:
      Action Statements;
  }
 */

/*_______________________________*/