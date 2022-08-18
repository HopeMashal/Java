/*_______________________________*/
//! Break and Continue Statements!!

package Notes;
import java.util.Scanner;

public class lesson_11 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int counter=1,num,sum=0;
    while(counter<=7){
      System.out.print("Enter the number "+counter+" : ");
      num = input.nextInt();
      if(num<0){
        System.out.println("Negative Number are not allowed!");
        break;
      }
      sum+=num;
      counter++;
    }
    System.out.println("Sum = "+sum);

    int num1=0, count=1,sum1=0;
    while(count<=5){
      System.out.print("Enter a positive number "+count+" : ");
      num1=input.nextInt();
      if(num1<0){
        System.out.println("Negative numbers are not allowed");
        continue;
      }
      sum1+=num1;
      count++;
    }
    System.out.println("Sum = "+sum1);

    input.close();

  }
}

/*_______________________________*/

//! The break statement

//? The break statement is typically used to exit early from a loop (for,while,do..while)
//? After the break statement, the remaining of the statements inside the loop are skipped. Then, execution continues starting at the first statement after the loop

/*_______________________________*/

//! The continue statement

//? The continue statement may be used in all loop statements (for,while,do..while)
//? The continue statement skips the remaining statement inside the loop; and proceeds with the next iteration, if any.

/*_______________________________*/