import java.util.Scanner;

public class BMI {
    public static void main (String[] args){
        //Write a program that prompts the user to enter a weight in pounds and height in feet and inches and displays the BMI.
        System.out.println("Enter a weight in pounds: ");
        Scanner inputLine = new Scanner(System.in);
        double pounds =  inputLine.nextDouble();
        System.out.println("Enter a height in feet: ");
        double feet =  inputLine.nextDouble();
        System.out.println("Enter a height in inches: ");
        double inches =  inputLine.nextDouble();
        inches = inches + (feet * 12);
        double bmi = 730 * (pounds / Math.pow(inches, 2));
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5){
            System.out.println("Underweight");
        }else if (bmi >= 18.5 && bmi < 25.0){
            System.out.println("Normal");
        }else if (bmi >= 25.0 && bmi < 30 ){
            System.out.println("Overwieght");
        }else if (bmi >= 30){
            System.out.println("Obese");
        }
        // Note that one pound is  kilograms, and one inch is  meters
    }
}
