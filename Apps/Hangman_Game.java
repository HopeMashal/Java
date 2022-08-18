/*_______________________________*/
//! Hangman Game!!

package Apps;
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

    while (!word_guess.equals(word_select) && !out_of_guesses){
      if (guess_count < guess_limit){
        System.out.print("Enter Guess: ");
        char guess_input = input.next().charAt(0);
        char guess = Character.toLowerCase(guess_input);
        for (int i = 0; i < word_select.length(); i++){
          if (guess == word_select.charAt(i)){
            if (i == 0){
              word_guess = guess + word_guess.substring(1);
            }
            else if (i > 0 && i < (word_guess.length()-1)){
              word_guess = word_guess.substring(0,i)+ guess +word_guess.substring(i+1) ;
            } else {
              word_guess = word_guess.substring(0,word_guess.length()-1)+ guess;
            }
            System.out.println("The word is: "+word_guess);
          }
        }
        if (word_select.indexOf(guess) == -1) {
          guess_count += 1;
          System.out.println("The word is: "+word_guess);
          System.out.println("You have "+(guess_limit-guess_count)+" guesses");
        }
      } else {
        out_of_guesses = true;
      }
    }
    if (out_of_guesses){
      System.out.println("YOU LOSE OUT OF GUESSES!!!");
      System.out.println("The correct answer is: "+word_select);
    } else {
      System.out.println("YOU WIN!!!");
      System.out.println("The programming language is: "+word_select);
    }

    input.close();
    
  }
  
}

/*_______________________________*/