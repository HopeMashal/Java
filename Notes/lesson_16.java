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
      System.out.print("Enter the salary for employee No. "+(i+1)+" : ");
      salaries[i] = input.nextDouble();
    }
    System.out.println(Arrays.toString(salaries));

    double sum=0,avg=0;
    for(int i=0;i<salaries.length;i++){
      sum += salaries[i];
    }
    avg = sum/noEmp;

    System.out.println("The sum of salaries is "+sum);
    System.out.println("The average of salaries is "+avg);

    double[] sales ={12.5,232.4,21.12};
    System.out.println(Arrays.toString(sales));

    int[] numbers = new int[noEmp];
    int sumPos=0,count=0;
    for(int i=0;i<noEmp;i++){
      System.out.print("Enter the number No. "+(i+1)+" : ");
      numbers[i] = input.nextInt();
      if(numbers[i]>0){
        sumPos+=numbers[i];
        count++;
      }
    }
    System.out.println("The sum of "+noEmp+" numbers is "+sumPos);
    System.out.println("The average of "+noEmp+" numbers is "+(sumPos/count));

    input.close();
    
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

//! Array Initialization

//? When instantiating an array object, the initial values depend on the array type:

//* For numeric types (int/float/..) the elements take the value zero by default
//* For char type, the elements take the value null character ('') by default
//* For boolean type, the elements take the value false by default

/*_______________________________*/