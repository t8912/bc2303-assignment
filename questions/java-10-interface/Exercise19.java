import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

import Pig.Cat;

// Interface
interface Animal {
    void sound(); // interface method (does not have a body)

    void sleep(); // interface method (does not have a body)
}

class Pig implements Animal {

    @Override
    public void sound() {
        System.out.println("Wee Wee");
    }

    @Override
    public void sleep() {
        System.out.println("Zzz Zzz");
    }
}

class Cat implements Animal {

        @Override
        public void sound() {
            System.out.println("Meow MeoW");
        }

        @Override
        public void sleep() {
            System.out.println("Zzz");
        }
    }



// Program a class Pig "implements" the Animal interface

// Program a Class Cat "implements" the Animal interface

/**
 * Expected Output:
 * Wee Wee
 * Zzz Zzz
 * Meow Meow
 * Zzz
 */
class Exercise19 {
    public static void main(String[] args) {
        Pig myPig = new Pig(); // Create a Pig object
        myPig.sound(); // print sound by System.out.println
        myPig.sleep(); // print sleep by System.out.println
        Cat myCat = new Cat(); // Create a Cat object
        myCat.sound(); // print sound by System.out.println
        myCat.sleep(); // print sleep by System.out.println
    }
}