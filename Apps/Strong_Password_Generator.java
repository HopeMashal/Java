/*_______________________________*/
//! Strong Password Generator!!

package Apps;
import java.util.*;

public class Strong_Password_Generator {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    char[] s1 = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    char[] s2 = new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    int[] s3 = new int[]{1,2,3,4,5,6,7,8,9,0};
    char[] s4 = new char[]{'~','!','@','#','$','%','^','&','*','(',')','-','_','+','=','[',']','{','}',':',';','"','<','>',',','.','/','?','|'};

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

  }
  
}

/*_______________________________*/