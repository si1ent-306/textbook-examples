import java.util.Scanner;

public class terneraryOperaters {
    public static void main(String[] args){
        //Boolean-Expression ? True Expression : False Expression
        Scanner inputLine = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = inputLine.nextInt();
        String msg = num > 10 ? "Number is greater than 10" : "Number is less than or equal to 10";
        System.out.println(msg);
    }
}
