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

    double part_30 = Math.round((float)characters_number * (30.0/100));
    double part_20 = Math.round((float)characters_number * (20.0/100));

    ArrayList<String> passList = new ArrayList<String>();

    for (int i=0;i<part_30;i++){
      passList.add(s1.get(i));
      passList.add(s2.get(i));
    }
    for (int i=0;i<part_20;i++){
      passList.add(s3.get(i));
      passList.add(s4.get(i));
    }
    if(characters_number%2==1){
      int y =(int) Math.round(Math.random()*4);
      List<String> z = Arrays.asList();
      if (y ==0 || y==1) z=s1;
      else if (y ==2)  z=s2;
      else if (y ==3)  z=s3;
      else if (y ==4)  z=s4;
      int x = (int) Math.round(Math.random()*z.size());
      passList.add(z.get(x));
    }

    Collections.shuffle(passList);

    String str = passList.toString().replaceAll(", ", ""); 
    str = str.substring(1, str.length() - 1);

    System.out.println("Your password is:  "+str);

  }
  
}

/*_______________________________*/