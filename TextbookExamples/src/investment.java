import java.util.Scanner;

public class investment {
    public static void main(String[] args){
        Scanner inputLine = new Scanner(System.in);
        System.out.println("Enter an investment value");
        double investmentValue = inputLine.nextDouble();
        System.out.println("Enter an interest percentage");
        double interestRate = inputLine.nextDouble();
        System.out.println("Enter a year");
        double years = inputLine.nextInt();
        double futureInvestmentValue = investmentValue * Math.pow((1 + interestRate),(years * 12));
        System.out.println("The future investment value is: " + futureInvestmentValue);
    }
}
