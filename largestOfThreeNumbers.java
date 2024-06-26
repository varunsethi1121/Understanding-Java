import java.util.*;

public class largestOfThreeNumbers {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first number of your choice: ");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number of your choice: ");
            int num2 = sc.nextInt();
            System.out.println("Enter the third number of your choice: ");
            int num3 = sc.nextInt();

            int largest;

            if (num1 >= num2 && num1 >= num3) {
                largest = num1;
                System.out.println("The largest number among the three numbers that you have entered is num1: " + largest);
            } else if (num2 >= num1 && num2 >= num3) {
                largest = num2;
                System.out.println("The largest number among the three numbers that you have entered is num2: " + largest);

            } else {
                largest = num3;
                System.out.println("The largest number among the three numbers that you have entered is num3: " + largest);

            }

        }
    }
}