import java.util.Scanner;

public class randomMathGame {
    public static void main(String[] args){
        int num1 = (int) (Math.random()*10);
        int num2 = (int) (Math.random()*10);
        System.out.println("What is " + num1 + " + " + num2 + " ?");
        Scanner inputLine = new Scanner(System.in);
        int answer = inputLine.nextInt();
        if(answer == (num1 + num2)){
            System.out.println("That is Correct!");
        }else{
            System.out.println("That is Incorrect. Try Again Next Time.");
        }
    }
}
