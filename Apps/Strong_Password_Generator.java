/*_______________________________*/
//! Strong Password Generator!!

package Apps;
import java.util.*;

public class Strong_Password_Generator {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    List<String> s1 = Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z");
    List<String> s2 = Arrays.asList("A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z");
    List<String> s3 = Arrays.asList("1","2","3","4","5","6","7","8","9","0");
    List<String> s4 = Arrays.asList("~","!","@","#","$","%","^","&","*","(",")","-","_","+","=","[","]","{","}",":",";","'","<",">",",",".","/","?","|");

    System.out.print("How many characters do you want for the password? ");
    int characters_number = input.nextInt();

    while (true){
      try {
        if (characters_number < 6){ 
          System.out.println("You need at least 6 characters!!!");
          System.out.print("Please enter the number again: ");
          characters_number= input.nextInt();
        } else {
          break;
        }
      } catch (Exception e) {
        //TODO: handle exception
        System.out.println("Please enter numbers only!!!!");
        System.out.print("How many characters do you want for the password? ");
        characters_number = input.nextInt();
      }
    }

    Collections.shuffle(s1);
    Collections.shuffle(s2);
    Collections.shuffle(s3);
    Collections.shuffle(s4);

    

  }
  
}

/*_______________________________*/