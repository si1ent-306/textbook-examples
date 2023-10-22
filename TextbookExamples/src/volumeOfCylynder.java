import java.util.Scanner;

public class volumeOfCylynder {
    public static void main(String[] args){
        Scanner inputLine = new Scanner(System.in);
        System.out.println("Enter a radius and length of cylender: ");
        double radius = inputLine.nextDouble();
        double length = inputLine.nextDouble();
        final double PI = 3.14159;
        double area = PI * radius * radius;
        double volume = area * length;
        System.out.println(area);
        System.out.println(volume);
    }
}
