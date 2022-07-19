/*_______________________________*/
//! Two Dimensional Arrays!!

package Notes;
import java.util.*;

public class lesson_18 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Please enter the number of courses: ");
    int col=input.nextInt();

    System.out.print("Please enter the number of students: ");
    int row=input.nextInt();

    double[][] marks = new double[row][col];

    for(int i=0;i<marks.length;i++){
      for(int j=0;j<marks[0].length;j++){
        System.out.print("Please enter the mark of course no. "+(j+1)+" for student no. "+(i+1)+" : ");
        marks[i][j]=input.nextInt();
      }
    }


  }
  
}

/*_______________________________*/

//! Declaration:

//? dataType[][] arrayName = new dataType[#row][#column];

/*_______________________________*/

//! Accessing Array Elements:

//? arrayName[row][column]=value;
//? Ex- marks[1][2]=65.3;

/*_______________________________*/

//! Array Length:

//? dataType[][] arrayName = new dataType[#rows][#columns];
//? arrayName.length = #rows;
//? arrayName[0].length = #columns;

/*_______________________________*/