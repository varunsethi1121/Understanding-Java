import java.util.*;
public class functionPrintPrimeNumbersInRange {
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

    public static void primeRange(int start , int end){
        if (start>end){
            System.out.print("Invalid Range given");
        }
        else{
            System.out.print("Prime numbers in the given range are: ");
            for(int i=start;i<=end;i++){
                if(isPrime(i)==true){
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter Starting number: ");
            int start = sc.nextInt();
            System.out.print("Enter Ending number: ");
            int end = sc.nextInt();
            primeRange(start , end);


        }
    }
}
