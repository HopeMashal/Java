/*_______________________________*/
//! Guessing Game (Number)!! 

package Apps;
import java.util.Scanner;

public class GuessingGame {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int guess,rand;
    rand = (int)(Math.random()*100);
    boolean stillplaying = true;
    while (stillplaying){
      System.out.print("Guess a number between 0 to 100: ");
      guess = input.nextInt();
      if (guess > rand){
        System.out.println("Guess too large!!");
      } else if (guess < rand){
        System.out.println("Guess too small!!");
      } else {
        System.out.println("Great!!!!!");System.out.println("YOU WIN :)");
        stillplaying =false;
      }
    }

  }
}

/*_______________________________*/