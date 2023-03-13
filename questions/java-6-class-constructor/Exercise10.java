/**
 * Expected Output: 8
 */
public class Exercise10 {
    int x; // Create an instance attribute

    // Create a class constructor for the Main class
    public Exercise10(int x) {
        this.x = x; // Set the value for the instance attribute x to expected output
    }

    public static void main(String[] args) throws Exception {
        Exercise10 ex10 = new Exercise10(8); // Create an instance of this class Exercise10

        System.out.println("Expected Output: " + ex10.x); // Print the value of instance attribute

    }
}
