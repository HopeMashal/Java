/*_______________________________*/
//! Methods with Parameters!!

package Notes;
import java.util.Scanner;;

public class lesson_13 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Start of program");
    drawLine('*',10);
    System.out.println("Welcome to the First Lecture in Functions!!");
    drawLine('-',15);
    System.out.println("End of program");

    /* 
     * The output is:
          Start of program
          **********
          Welcome to the First Lecture in Functions!!
          ---------------
          End of program
     */

     System.out.print("Enter the first number: ");
     int x=input.nextInt();

     System.out.print("Enter the second number: ");
     int y=input.nextInt();

     int total = sum(x, y);
     System.out.println("The Sum of "+x+" & "+y+" is equal "+total);


  }
  public static void drawLine(char ch, int length){
    for(int i=0;i<length;i++){
      System.out.print(ch);
    }
    System.out.println();
  }
  public static int sum (int i, int j){
    int result=i+j;
    return  result;
  }
  
}

/*_______________________________*/