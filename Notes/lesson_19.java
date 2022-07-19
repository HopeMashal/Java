/*_______________________________*/
//! Two Dimensional Arrays(Passing Arrays as a method Parameters)!!!!

package Notes;
import java.util.*;

public class lesson_19 {
  public static Scanner input = new Scanner(System.in);
  public static void main(String[] args){

    System.out.print("Enter the number of row: ");
    int row = input.nextInt();

    System.out.print("Enter the number of column: ");
    int col = input.nextInt();

    int[][] matrix = new int[row][col];
    fillArray(matrix);
    printArray(matrix);
    System.out.print("Enter the number to search for: ");
    int searchId=input.nextInt();
    search(matrix, searchId);

  }

  public static void fillArray(int[][] list){
    for(int i =0;i<list.length;i++){
      for(int j=0;j<list[0].length;j++){
        System.out.print("Enter data for row no. "+i+" and column no. "+j+" : ");
        list[i][j]=input.nextInt();
      }
    }
  }

  public static void printArray(int[][] list){
    for(int i =0;i<list.length;i++){
      for(int j=0;j<list[0].length;j++){
        System.out.print(list[i][j]+" ");
      }
      System.out.println();
    }
  }

  public static void search (int[][] list, int target){
    boolean findValue = false;
    for(int i =0;i<list.length;i++){
      for(int j=0;j<list[0].length;j++){
        if(list[i][j]==target){ 
          System.out.println("The index of "+target+" is in row no. "+i+" and column no. "+j);
          findValue = true; 
        }
      }
    }
    if (!findValue) System.out.println("The item "+target+" isn't found"); 
  }
}

/*_______________________________*/