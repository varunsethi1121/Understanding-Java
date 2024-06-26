import java.util.*;

public class calcualatorUsingS {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.println("Enter second number: ");
            int num2 = sc.nextInt();
            System.out.println("Enter the operation among '+, -, *, /' that you want to perform: ");
            char symbol = sc.next().charAt(0);

            int result;
            switch (symbol) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Addition of the two numbers that you have entered is: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Subtraction of the two numbers that you have entered is: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Multiplication of the two numbers that you have entered is: " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Division of the two numbers that you have entered is: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("ERROR: Invalid operation symbol.");
                    break;
            }
        }

    }
}
