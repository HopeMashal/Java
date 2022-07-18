/*_______________________________*/
//! Translator!!

package Apps;
import java.util.*;

public class Translator {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    //! Replace ( a , i , o , e , u) --> z

    System.out.print("Enter a phrase: ");
    String words = input.nextLine();
    System.out.println(translate(words));

  }
  public static String translate(String str){
    String translation = "";
    char[] vowel = new char[]{'a','i','e','o','u'};
    for (int letter = 0; letter < str.length(); letter++){
      char l = Character.toLowerCase(str.charAt(letter));
        if (search(vowel, l)){
          if (Character.isUpperCase(str.charAt(letter))){
            translation = translation + "Z";
          } else {
            translation = translation + "z";
          }
        } else {
          translation = translation + str.charAt(letter) ; }  
    }
    return translation;
  }
  public static boolean search (char[] list, char target){
    for(int i =0;i<list.length;i++){
      if(list[i]==target) return true;
    }
    return false;
  }
}

/*_______________________________*/