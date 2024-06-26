import java.util.*;
public class functionFactorilOfANaumber {
    public static int factorialNumber(int num) {
        if (num == 0) {
            return 1; 
        } else {
            return num * factorialNumber(num - 1);
        }
    }
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number whose factorial you want to calculate: ");
            int x = sc.nextInt();
            if (x < 0) {
                System.out.println("Factorial of a negative number is INVALID");
            } else {
                int result = factorialNumber(x);
                System.out.println("Factorial of the number you have entered is " + result);
            }
        }
    }
}