/*_______________________________*/
//! Methods with Parameters!!

package Notes;

public class lesson_13 {
  public static void main(String[] args){
    System.out.println("Start of program");
    drawLine();
    System.out.println("Welcome to the First Lecture in Functions!!");
    drawLine();
    System.out.println("End of program");

    /* 
     * The output is:
          Start of program
          **********
          Welcome to the First Lecture in Functions!!
          **********
          End of program
     */
  }
  public static void drawLine(){
    for(int i=0;i<10;i++){
      System.out.print("*");
    }
    System.out.println();
  }
  
}

/*_______________________________*/