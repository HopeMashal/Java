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

    String[][] marks = new String[row+1][col+1];
    marks[0][0]="Name";
    
    for(int j=1;j<marks[0].length;j++){
      System.out.print("Please enter the course no. "+(j)+" name : ");
      marks[0][j]=input.next();
    }

    for(int i=1;i<marks.length;i++){
      System.out.print("Please enter the student no. "+(i)+" name : ");
      marks[i][0]=input.next();
    }

    for(int i=1;i<marks.length;i++){
      for(int j=1;j<marks[0].length;j++){
        System.out.print("Please enter the mark of course no. "+(j)+" for student no. "+(i)+" : ");
        marks[i][j]=input.next();
      }
    }

    for(int i=0;i<marks.length;i++){
      for(int j=0;j<marks[0].length;j++){
        System.out.print(marks[i][j] + "     ");
      }
      System.out.println();
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

//! Initialization:

//? int[][] array = {{2,1,4},{3,5,4},{4,3,2}}

/* Array =[2 1 4
           3 5 4
           4 3 2]
 */

/*_______________________________*/