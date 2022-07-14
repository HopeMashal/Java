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
    System.out.printf("Average Grade is %.2f %n",(float)sum/6);

    //Average grade for 5 students or ends the program by entering -1
    int myGrade=0, mySum=0, Counter=1;
    System.out.println("Enter positive number to get average grade for 5 students or -1 To Exit");
    System.out.print("Enter the value: ");
    myGrade = input.nextInt();
    while(Counter<=5 && myGrade !=-1){
      System.out.printf("Enter grade for student no %d : ",Counter);
      myGrade = input.nextInt();
      mySum += myGrade;
      if (myGrade == -1){
        mySum -= myGrade;
        Counter -= 1;
        System.out.printf("Average Grade is %.2f for %d students",(float)mySum/Counter,Counter);
      } else if (Counter == 5){
        System.out.printf("Average Grade is %.2f for 5 students",(float)mySum/5);
      }
      Counter++;
    }

    if (myGrade == -1 && Counter ==1){
      System.out.println("EXIT!!");
    }

  }
}

/*_______________________________*/