import java.util.Scanner;

public class dateFinder {
    public static void main (String[] args){
        // Write a program that prompts the user to enter an integer for today’s day of the week
        System.out.print("Enter a day of the week (Sunday is 0, Monday is 1,and Saturday is 6): ");
        Scanner inputLine = new Scanner(System.in);
        int dayOfWeek = inputLine.nextInt();
        String dayOfWeekString = "";
        if (dayOfWeek == 0){
            dayOfWeekString = "Sunday";
        } else if (dayOfWeek == 1){
            dayOfWeekString = "Monday";
        } else if (dayOfWeek == 2){
            dayOfWeekString = "Tuesday";
        } else if (dayOfWeek == 3){
            dayOfWeekString = "Wednesday";
        } else if (dayOfWeek == 4){
            dayOfWeekString = "Thursday";
        } else if (dayOfWeek == 5){
            dayOfWeekString = "Friday";
        } else if (dayOfWeek == 6){
            dayOfWeekString = "Saturday";
        }
        // (Sunday is 0, Monday is 1,and Saturday is 6).
        // Also prompt the user to enter the number of days after today for a future day
        System.out.print("Enter days elapsed since this day: ");
        int daysElapsed = Math.floorDiv(inputLine.nextInt(), 7);
        String daysElapsedString = "";
        if (daysElapsed == 0){
            daysElapsedString = "Sunday";
        } else if (daysElapsed == 1){
            daysElapsedString = "Monday";
        } else if (daysElapsed == 2){
            daysElapsedString = "Tuesday";
        } else if (daysElapsed == 3){
            daysElapsedString = "Wednesday";
        } else if (daysElapsed == 4){
            daysElapsedString = "Thursday";
        } else if (daysElapsed == 5){
            daysElapsedString = "Friday";
        } else if (daysElapsed == 6){
            daysElapsedString = "Saturday";
        }
        // and display the future day of the week.
        System.out.println("The day is " + dayOfWeekString + " and the future day is " + daysElapsedString);
    }
}
