/*_______________________________*/
//! Baggage Charge for the Passenger!!

//? Turkish Airlines permit each passenger to hold one bag. The maximum weight allowed for the bag depends on the class of the passenger which is: 30kg for First class ("F"), 25kg for Business class ("B") and 20kg for Economy ("E"). If the weight of the bag excesses the allowed one, the passenger should pay 10 TRY for each kg. (USE SWITCH STATEMENT)

package Apps;
import java.util.Scanner;

public class BaggageCharge {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Please Enter Number of Passengers: ");
    int numberOfPassengers= input.nextInt();

    for(int i=1;i<=numberOfPassengers;i++){

      System.out.println("\n _____________________________________");
      System.out.println("|    Please Enter Passenger's Class   |");
      System.out.println("|       Enter F for First class       |");
      System.out.println("|       Enter B for Business Class    |");
      System.out.println("|       Enter E for Economy Class     |");
      System.out.println("|_____________________________________|\n");

      System.out.print("Please Enter Passenger's "+i+" Class: ");
      char passClass = input.next().charAt(0);
  
      System.out.print("Enter the Weight of Passenger's "+i+" Bag: ");
      double bagWeight = input.nextDouble();
  
      double excessWeight = 0;
      double charge = 0;

      switch(Character.toUpperCase(passClass)){
        case 'F':
          if(bagWeight>30){
            excessWeight = bagWeight - 30;
            charge = excessWeight * 10;
          }
          break;
        case 'B':
          if(bagWeight>25){
            excessWeight = bagWeight - 25;
            charge = excessWeight * 10;
          }
          break;
        case 'E':
          if(bagWeight>20){
            excessWeight = bagWeight - 20;
            charge = excessWeight * 10;
          }
          break;
        default :
          System.out.println("Entered Invalid Class!! Please Enter (F/B/E)!!!");
          break;
      }
      if(charge==0){
        System.out.println("Passenger "+i+" has no excess baggage");
      } else {
        System.out.println("\nPassenger No. "+i+" has excess baggage");
        System.out.println("Excess weight equals "+excessWeight);
        System.out.println("He/She has to pay extra charge equal  "+charge+"\n");
      }

    }

  }
  
}

/*_______________________________*/