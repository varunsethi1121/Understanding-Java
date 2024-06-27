import java.util.*;
public class functionPrimeNumber {
    public static boolean isPrime(int num){
        boolean isPrime = true;
        if (num==2){
            isPrime = true;
        }
        for (int i=2; i<=Math.sqrt(num); i++){
            if (num % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number you want to check for: ");
            int x = sc.nextInt();
            System.out.println(isPrime(x));
        }
    }
}
