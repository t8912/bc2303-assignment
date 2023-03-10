
/**
 * The sum is 55
 */
public class Exercise7 {
  // Sum values of an array
  public static void main(String[] args) {
    // Declare a int array, with value 1 to 10
    int[] array2 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // code here

    // Write a loop to sum up all value in the int array, the result should be 55
    // code here

    int sum = 0;
    //int i;
    for (int i = 0; i < array2.length; i++ ) {
      sum += array2[i];
      
      }
    System.out.println("The sum is " + sum);
  }
}