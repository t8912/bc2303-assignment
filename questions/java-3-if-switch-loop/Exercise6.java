import java.util.Scanner;

/*
Expected Output: (When input = 4)
   *
  ***
 *****
*******
 *****
  ***
   *
Expected Output: (When input = 7)
      *
     ***
    *****
   *******
  *********
 ***********
*************
 ***********
  *********
   *******
    *****
     ***
      *
 */
public class Exercise6 {

  public static void main(String[] args) {
    int i, j, r;
    
    System.out.print("Input number of rows (half of the diamond) : ");
    Scanner in = new Scanner(System.in);
    r = in.nextInt();

    // Upper Part: increasing parttern
    // Think about how to print " " and "*"
    // and when to new line
    for (i = 0; i < r; i++) {
      for (j = 0; j < r-i-1; j++) {
          System.out.print(" ");
      }
      for (j = 0; j < 2*i+1; j++) {
          System.out.print("*");
      }
      System.out.println();
  }

    // Lower Part: decreasing parttern
    // Think about how to print " " and "*"
    // and when to new line

    for (i = r-2; i >= 0; i--) {
      for (j = 0; j < r-i-1; j++) {
          System.out.print(" ");
      }
      for (j = 0; j < 2*i+1; j++) {
          System.out.print("*");
      }
      System.out.println();
  }

  }
}
