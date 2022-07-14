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