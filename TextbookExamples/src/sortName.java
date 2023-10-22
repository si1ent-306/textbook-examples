import java.util.Scanner;

public class sortName {
    public static void main(String args[]){
        Scanner inputLine = new Scanner(System.in);
        System.out.println("Enter 2 Names");
        String name1 = inputLine.next();
        String name2 = inputLine.next();
        char char1 = name1.charAt(0);
        char char2 = name2.charAt(0);
        if (char1 < char2){
            System.out.println(name1 + " " + name2);
        } else if (char2 < char1) {
            System.out.println(name2 + " " + name1);
        } else if (char2 == char1) {
            System.out.println("They are the same");
        }
    }
}
