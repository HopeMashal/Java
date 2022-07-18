/*_______________________________*/
//! One Dimensional Arrays (Passing Arrays as a method Parameters)!!

package Notes;
import java.util.*;

public class lesson_17 {
  public static Scanner input = new Scanner(System.in);
  public static void main(String[] args){

    System.out.print("Enter Size of Array: ");
    int size = input.nextInt();
    double[] ids = new double[size];
    fillArray(ids);
    printArray(ids);
    System.out.print("Enter the id to search for: ");
    double searchId=input.nextDouble();
    double searchRes= search(ids, searchId);
    if(searchRes>=0) System.out.println("The index of "+searchId+" is "+searchRes);
    else System.out.println("The item "+searchId+" isn't found");

  }

  public static void fillArray(double[] list){
    for(int i =0;i<list.length;i++){
      System.out.print("Enter next element: ");
      list[i]=input.nextDouble();
    }
  }

  public static void printArray(double[] list){
    for(int i =0;i<list.length;i++){
      System.out.print(list[i]+" ");
    }
    System.out.println();
  }

  public static double search (double[] list, double target){
    for(int i =0;i<list.length;i++){
      if(list[i]==target) return i;
    }
    return -1;
  }
  
}

/*_______________________________*/

//! Passing Array as a parameter to a method

//? To pass an array argument to a method, specify the name of the array without any brackets.

/*_______________________________*/