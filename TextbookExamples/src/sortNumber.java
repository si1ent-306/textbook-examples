import java.util.Scanner;

public class sortNumber {
    public static void main(String[] args) {
        //Input 3 numbers
        Scanner inputLine = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double num1 = inputLine.nextDouble();
        double num2 = inputLine.nextDouble();
        double num3 = inputLine.nextDouble();
        //Sort The Numbers
        //Find Max value of three
        double max =  Math.max(num3 , Math.max(num1, num2));
        //Find Min value of three
        double min = Math.min(num3 , Math.min(num1, num2));
        //Find the middle value by adding all numbers and subtracting min and max
        double mid = (num1 + num2 + num3) - (max + min);
        System.out.println(max + " "+ mid + " "+ min);

    }
}
