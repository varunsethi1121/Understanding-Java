import java.util.*;

public class functionBinomialCoefficent {
    public static int factorialNumber(int num) {
        if (num == 0) {
            return 1; 
        } else {
            return num * factorialNumber(num - 1);
        }
    }

    public static int binomialCoefficient(int n, int r) {
        int nFactorial = factorialNumber(n);
        int rFactorial = factorialNumber(r);
        int nMrFactorial = factorialNumber(n - r);
        return nFactorial / (rFactorial * nMrFactorial);
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the upper index (n) of the binomial coefficient: ");
            int n = sc.nextInt();
            System.out.print("Enter the lower index (r) of the binomial coefficient: ");
            int r = sc.nextInt();
            
            if (n < 0 || r < 0 || r > n) {
                System.out.println("Invalid input. Ensure n >= r >= 0.");
            } else {
                int result = binomialCoefficient(n, r);
                System.out.println("Binomial coefficient C(" + n + ", " + r + ") is " + result);
            }
        }
    }
}
