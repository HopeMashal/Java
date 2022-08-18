/*_______________________________*/
//! Methods and Variable Scope!!

package Notes;
import java.util.Scanner;

public class lesson_14 {
  static int globalVar=100;
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

    //! Local & Global Variable
    int globalVar=200;
    System.out.println("The local variable is "+globalVar); //* The output is The local variable is 200
    display1(); //* The output is The global variable is 100
    System.out.println(lesson_14.globalVar); //* The output is 100 --> (class_name.global_variable)

    input.close();

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

  public static void display1(){
    System.out.println("The global variable is "+globalVar);
  }
}

/*_______________________________*/

//! Scope of a variable

//? Scope is the context within a program in which a variable is valid and can be used
//? 1- Local variable: declared within a function (or block {...})
//* can be accessible only within the function or from declaration to the end of the block
//* within nested blocks if no variable with same name exists

//? 2- Global variable: declared outside of every function definition 
//* can be accessed from any function that has no local variables with the same name. In case the function has a local variable with the same name as the global variable.
//* بتم تعريفة داخل الكلاس وخارج الفانكشن وبتقدر تستخدمه باي فانكشن موجود داخل هاد الكلاس ويتم تعريفه كالتالي
//* static int variable-name; --> (int/float/..)

/*_______________________________*/