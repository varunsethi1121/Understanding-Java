// CONDITIONAL STATEMENTS
import java.util.*;

public class printLargestOfTwoNumbersCS {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.println("Enter second number: ");
            int num2 = sc.nextInt();
            if (num1 > num2) {
                System.out.println("Num1: " + num1 + " is greater than " + "Num2: " + num2);
            }
            else{
                System.out.println("Num2: " + num2 + " is greater than " + "Num1: " + num1);   
            }
        }
    }
}
