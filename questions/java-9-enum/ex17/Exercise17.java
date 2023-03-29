package ex17;

enum Level {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    int value;

    Level(int value) {
        this.value = value;
    }

}

/**
 * Expected Output:
 * This is Medium level
 * enum is MEDIUM, and its value is 2
 */
public class Exercise17 {
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;

        // Write a switch statement to print the expected output.
        switch (myVar) {
            case LOW:
            System.out.println("This is Low level");
            break;
            case MEDIUM:
            System.out.println("This is Medium level");
            break;
            case HIGH:
            System.out.println("This is HIGH level");
            break;

        }
    System.out.println("enum is " + myVar + "," + " and its value is " + myVar.value );
    }
}