/*_______________________________*/
//! Flag Controlled While Loop!!

package Notes;
import java.util.Scanner;

public class lesson_8 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    //! Add positive numbers, To stop enter negative number
    System.out.println("Enter some positive numbers to add them together or enter negative number to stop the program: ");
    double sum =0.0; 
    float value;
    boolean nonNegative = true;
    while(nonNegative){
      value = input.nextFloat();
      if (value < 0){
        nonNegative=false;
      } else {
        sum += value;
      }
    }
    System.out.printf("Sum of input numbers is %.2f",sum);


  }
}


/*_______________________________*/
