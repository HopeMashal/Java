/*_______________________________*/
//! Methods Overloading!!

package Notes;
import java.util.Scanner;

public class lesson_15 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int a =10, b=20, c=30;
    char x='g', y='A';

    System.out.println(larger(a, b)); //* The output is 20
    System.out.println(larger(a, b, c)); //* The output is 30
    System.out.println(larger(x, y)); //* The output is g

  }

  public static int larger(int n1,int n2){
    if(n1>n2) return n1;
    else return n2;
  }

  public static int larger(int n1,int n2,int n3){
    if(n1>n2 && n1>n3) return n1;
    else if(n2>n1 && n2>n3) return n2;
    else return n3;
  }

  public static char larger(char c1,char c2){
    if(c1>c2) return c1;
    else return c2;
  }
  
}

/*_______________________________*/

//! Method Overloading:

//? Defining several methods within a class with the same name. As lond as every method has a different signature

//? Examples:
/* 
 * public int Sum(int x, int y);
 * public int Sum(int x, int y,int z);
 * public double Sum(double x,double y,double z);
 * public int Sum(int x, double y);
 * public int Sum(double x,int y);
 */

/*_______________________________*/

//! Method Signature:

//? The signature of a method consists of the following:
//* Method name
//* Formal Parameter list

//!! Note that the method type is not part of its signature
//!! Note that the method type and modifiers are not part of the overloading rules

/*_______________________________*/

//! The following methods are incorrectly overloaded; the compiler generates an error:
//? Ex1- The following methods are incorrectly overloaded because they have the same method name and same formal parameter lists:
 /* 
 * public void methodABC(int x,double y);
 * public int methodABC(int x,double y);
 */

//? Ex2- Changing the names of the formal parameters, doesn't allow overloading of the previous counter-example:
 /* 
 * public void methodABC(int x,double y);
 * public int methodABC(int num1,double num2);
 */

//? Ex3- Adding the modifire static doesn't allow overloading of the previous example:
/* 
 * public static void methodABC(int x,double y);
 * public int methodABC(int num1,double num2);
 */

/*_______________________________*/