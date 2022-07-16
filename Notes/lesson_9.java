/*_______________________________*/
//! Do While Loop!!

package Notes;
import java.util.Scanner;

public class lesson_9 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    //!Average Grade
    int counter =1;
    int grade = 0, sum=0;
    do{
      System.out.print("Enter grade for student no "+counter +" : ");
      grade = input.nextInt();
      sum +=grade;
      counter++;
    }while(counter<=6);

    System.out.println("Average Grade is "+sum/counter);

    //! Menu & Select Action
    int option;
    int num1=20, num2=10;
    do{
      System.out.println("Select an option from the MENU");
      System.out.println("1. Sum 2 numbers");
      System.out.println("2. Subtract 2 numbers");
      System.out.println("3. Divide 2 numbers");
      System.out.println("0. Exit");
      option = input.nextInt();

      switch(option){
        case 1:
          System.out.println("Sum of the 2 numbers is "+(num1+num2));
          break;
        case 2:
          System.out.println("Subtract of the 2 numbers is "+(num1-num2));
          break;
        case 3:
          System.out.println("Divide of the 2 numbers is "+(num1/num2));
          break;
        case 0:
          System.out.println("Good Bye!!");
          break;
        default:
          System.out.println("Invalid Option");
      }
    } while(option !=0);

  }
  
}

/*_______________________________*/

//! Do While Loop:

/* 
  do{
    this;
    and this;
    ...
  } while(this condition is true)
*/

/*_______________________________*/

//! While Loop

/* 
  while(this condition is true){
    this;
    and this;
    ...
  } 
*/

/*_______________________________*/