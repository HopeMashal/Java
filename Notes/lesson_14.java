/*_______________________________*/
//! Methods and Variable Scope!!

package Notes;
import java.util.Scanner;;

public class lesson_14 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    //! ask the user to enter 3 integer numbers and print out their sum and average

    int num1,num2,num3;
    System.out.print("Enter the first numbers: ");
    num1 = input.nextInt();
    System.out.print("Enter the second numbers: ");
    num2 = input.nextInt();
    System.out.print("Enter the third numbers: ");
    num3 = input.nextInt();

    int Sum=sum(num1, num2, num3);
    double Avg =avg(num1, num2, num3);
    display(Sum, Avg);

  }

  public static int sum(int n1,int n2, int n3){
    int result = n1+n2+n3;
    return result;
  }

  public static double avg(int n1,int n2, int n3){
    double result=(float)sum(n1,n2,n3)/3;
    return result;
  }

  public static void display(int s, double a){
    System.out.println("The sum of the 3 numbers is "+s);
    System.out.printf("The average of the 3 numbers is %.2f %n",a);
  }
}

/*_______________________________*/