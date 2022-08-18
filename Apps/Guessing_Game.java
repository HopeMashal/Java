/*_______________________________*/
//! Guessing Game (Word)!!

package Apps;
import java.util.Scanner;

public class Guessing_Game {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String secret_word = "Jofee";   // The secret word value
    String guess = "";   // The guess value
    int guess_count = 0;  // The counter value
    int guess_limit = 3;  // The limit value of guess
    boolean out_of_guesses = false;  // If guess_count = 3 => out_of_guesses = True

    while (!guess.equals(secret_word) && !out_of_guesses){
      if (guess_count < guess_limit){
        System.out.printf("You have %d guesses %n",guess_limit-guess_count);
        System.out.print("Enter guess: ");
        guess = input.next();
        guess_count += 1;
      } else {
        out_of_guesses = true;
      }
    }

    if (out_of_guesses){
      System.out.println("YOU LOSE OUT OF GUESSES!!!");
    } else{
      System.out.println("YOU WIN!!!");
    }

    input.close();

  }
}

/*_______________________________*/