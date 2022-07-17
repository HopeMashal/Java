/*_______________________________*/
//! Hangman Game!!

package Apps;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Hangman_Game {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    String[] Words = new String[] {"html","css","java","javascript","react","node","python","csharp","linux"};

    String word_select = Words[(int)(Math.random()*Words.length)];

    String word_guess = "";
    for(int i = 0; i < word_select.length(); i++){
      word_guess = word_guess + "*"; 
    }

    int guess_count = 0;
    int guess_limit = 6;
    boolean out_of_guesses = false;

    System.out.println("Welcome in Hangman Game!!");
    System.out.println("Guess the Programming Language:");
    System.out.println("Please!! Enter One Letter");
    System.out.println("You have "+guess_limit+" guesses");
    System.out.println("The word length is: "+word_guess);


  }
  
}

/*_______________________________*/