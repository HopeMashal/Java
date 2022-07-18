/*_______________________________*/
//! One Dimensional Arrays!!

package Notes;
import java.util.*;

public class lesson_16 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of employees: ");
    int noEmp = input.nextInt();

    double[] salaries = new double[noEmp];

    for(int i=0;i<noEmp;i++){
      System.out.print("Enter the salary of employee no. "+(i+1)+" : ");
      salaries[i] = input.nextDouble();
    }
    System.out.println(Arrays.toString(salaries));


  }
  
}

/*_______________________________*/

//! Array declaration

//? dataType[] arrayName = new dataType [intExp]
//? Ex- String[] Words = new String[]{'..','..',...etc};
//? Ex- int[] num = new int[5]; --> num[0],..,num[4] (index from 0 to intExp-1)

//* In java, an array is an object that must be instantiated using the new operation
//* arrayName is the reference variable
//* dataType is the data type of the array; which is the same type of all elements in the array
//* intExp is any expression that evaluates to a positive int type.
//* intExp represents the size of the array: this is the number of elements in the array

/*_______________________________*/