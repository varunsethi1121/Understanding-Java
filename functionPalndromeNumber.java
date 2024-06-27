import java.util.*;

public class functionPalndromeNumber {
    public static void palindromeFunction(int num) {
        int myNum = num;
        int reverseNumber = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            num = num / 10;
        }
        // System.out.print(reverseNumber);
        if (num == reverseNumber){
            System.out.print("The number you have entered is: " + myNum + " and its reverse is: " + reverseNumber + "\n");
            System.out.print("The number you have entered is a Palindrome Number");
        }
        else{
            System.out.print("The number you have entered is: " + myNum + " and its reverse is: " + reverseNumber + "\n");
            System.out.print("The number you have entered is not a Palindrome Number");
        }
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number you want to check: ");
            int x = sc.nextInt();
            palindromeFunction(x);
        }
    }
}
