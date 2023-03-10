import java.util.Arrays;
import java.util.Scanner;

/**
 * Input a Index Position: 3
 * Input a new Value: 120
 * Original Array : [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]
 * New Array: [25, 14, 56, 120, 15, 36, 56, 77, 18, 29]
 */
public class Exercise8 {

  public static void main(String[] args) {

    int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };

    Scanner input = new Scanner(System.in);

    System.out.print("Input an Index Position: ");
    int Index_position = input.nextInt();

    System.out.print("Input a new Value: ");
    int newValue = input.nextInt();

    System.out.println("Original Array : " + Arrays.toString(my_array));

    // Write a loop to find the index to insert new value
    // the array size is fixed, what happen to the last element of the array?

    ///int numberToFind = 3;
    ///for (int i = 0; i < my_array.length; i++) {
     /// if (my_array[i] == numberToFind) {
      ///  System.out.printf()
     /// }
   /// }

   for ()

    System.out.println("New Array: " + Arrays.toString(my_array));
  }
}
