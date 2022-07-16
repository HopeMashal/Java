/*_______________________________*/
//! For Loop!!

package Notes;
import java.util.Scanner;

public class lesson_10 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int grade=0,sum=0;
    for(int i=1;i<=6;i++){
      System.out.print("Enter Grade for student no " + i + " : ");
      grade = input.nextInt();
      sum += grade;
    }
    System.out.println("The average grades is "+ (float)sum/6);

    int num,sumEven=0,sumOdd=0;
    for(int i=1;i<=10;i++){
      System.out.print("Enter the number "+ i +" : ");
      num=input.nextInt();
      if(num%2==0){
        sumEven+=num;
      } else{
        sumOdd+=num;
      }
    }
    System.out.println("The sum of Even Numbers is "+sumEven);
    System.out.println("The sum of Odd Numbers is "+sumOdd);

    //! Factorial Number
    int number,factorial=1;
    System.out.print("Enter a positive number to get its factorial: ");
    number = input.nextInt();
    if(number<0){
      System.out.println("Enter Positive Number Only!!!");
    } else {
      for(int i =1; i<=number;i++){
        factorial *=i;
      }
    }
    System.out.println("Factorial = "+factorial);

    //! Print star
    for(int i=1;i<=5;i++){
      for(int j=1;j<=i;j++){
        System.out.print("*");
      }
      System.out.print("\n");
    }
    /* The output is:
        *
        **
        ***
        ****
        *****
     */

  }
}

/*_______________________________*/

//! For statement

/* 
  for(initial counter;test counter; increment counter){
    do this;
    do this;
    ...
  }
*/

/*_______________________________*/