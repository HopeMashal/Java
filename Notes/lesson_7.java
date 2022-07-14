/*_______________________________*/
//! While Loop!!

package Notes;
import java.util.Scanner;

public class lesson_7 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int count = 0;
    while (count < 5){
      System.out.println(count);
      count++;
    }

    //! Average grade for 6 students
    int grade=0, sum=0, counter=1;
    while(counter<=6){
      System.out.printf("Enter grade for student no %d : ",counter);
      grade = input.nextInt();
      sum += grade;
      counter++;
    }
    System.out.printf("Average Grade is %.2f",(float)sum/6);

  }
}

/*_______________________________*/