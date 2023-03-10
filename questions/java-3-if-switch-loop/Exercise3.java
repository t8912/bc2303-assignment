import java.util.Scanner;

/**
 * Expected Output:
 * 
 * Input a month number: 2
 * Input a year: 2016
 * February 2016 has 29 days
 * 
 * Input a month number: 12
 * Input a year: 2014
 * December 2014 has 31 days
 */
// Program toExercise3Ansumber of days that the month of a year has.
public class Exercise3 {

  public static void main(String[] strings) {

    Scanner input = new Scanner(System.in);

    int number_Of_DaysInMonth = 0;
    String MonthOfName = "Unknown";

    System.out.print("Input a month number: ");
    int month = input.nextInt();

    System.out.print("Input a year: ");
    int year = input.nextInt();

    // Complete the switch statement
    switch (month) {
      case 1:
        MonthOfName = "January";
        number_Of_DaysInMonth = 31;// Code here
        break;
      case 2:
        MonthOfName = "February";
        //if (year % 4 == 0) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
          number_Of_DaysInMonth = 29;// Code here
        } else {
          number_Of_DaysInMonth = 28;// Code here
        }
        break;
      case 3:
        MonthOfName = "March";
        number_Of_DaysInMonth = 31;// Code here
        break;
      case 4:
        MonthOfName = "April";
        number_Of_DaysInMonth = 30;// Code here
        break;
      case 5:
        MonthOfName = "May";
        number_Of_DaysInMonth = 31;// Code here
        break;
      case 6:
        MonthOfName = "June";
        number_Of_DaysInMonth = 30;// Code here
        break;
      case 7:
        MonthOfName = "July";
        number_Of_DaysInMonth = 31;// Code here
        break;
      case 8:
        MonthOfName = "Augest";
        number_Of_DaysInMonth = 31;// Code here
        break;
      case 9:
        MonthOfName = "September";
        number_Of_DaysInMonth = 30;// Code here
        break;
      case 10:
        MonthOfName = "October";
        number_Of_DaysInMonth = 31;// Code here
        break;
      case 11:
        MonthOfName = "November";
        number_Of_DaysInMonth = 30;// Code here
        break;
      case 12:
        MonthOfName = "December";
        number_Of_DaysInMonth = 31;// Code here
        break;
      // The February has 29 days: (Every 4 years and the year cannot divded by 100)
      // or The year can divided by 400
      // otherwise the February should have 28 days only
      // how about other months, December?

    }
    System.out.print(MonthOfName + " " + year + " has " + number_Of_DaysInMonth + " days\n");
  }
}
