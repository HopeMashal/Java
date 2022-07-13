/*_______________________________*/
//! If statement!!

package Notes;
import java.util.Scanner;

public class lesson_5 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int marks;
    System.out.print("Enter Your Marks: ");
    marks = input.nextInt();

    if (marks >= 60){
      System.out.println("Congratulations :), you passed!!");
      System.out.println("Go to the next level!");
    } else {
      System.out.println("Ohh no :(, you failed!!");
    }

  }
  
}

/*_______________________________*/

//! The control statements are categorized in almost two groups:

//? 1- Selection control statements --> like If Statement
//? 2- Repetition control statements

/*_______________________________*/

//! Relational Expression and Relational Operators 

//? == --> Equal to
//? != --> Not Equal to
//? < --> Less than
//? <= --> Less than or Equal to
//? > --> Greater than
//? >= --? Greater than or Equal to

/*_______________________________*/