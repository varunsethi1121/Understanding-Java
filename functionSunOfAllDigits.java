import java.util.*;
public class functionSunOfAllDigits {
    public static void sumOfDigits(int num){
        int sum=0;
        while(num>0){
            int lastDigit = num%10;
            sum = sum + lastDigit;
            num = num/10;
        }
        System.out.print("Sum of the digits of the number you have enterd is: " + sum);
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number: ");
            int x= sc.nextInt();
            sumOfDigits(x);
        }
    }
}
