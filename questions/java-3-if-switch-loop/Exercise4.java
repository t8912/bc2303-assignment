public class Exercise4 {
  /**
   * Exercise: Print first 10 natural numbers, but skip 6
   */
  /**
   * Expected Output:
   * The first 10 natural numbers are, except 6:
   * 1234578910
   */
  public static void main(String[] args) {
    int i;
    System.out.println("The first 10 natural numbers are, except 6:");
    for (i = 1; i < 11; i++) {
      if (i == 6)
        continue; // skip 6
      System.out.print(i);
      //System.out.println();
      // System.out.print(" ");
      // System.out.print("\n");
    }
    // Write a For Loop, skip 6 by if statement
    System.out.println();
  }
}