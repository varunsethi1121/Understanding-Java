import java.util.*;
public class functionProductOfTwoNumbers {
    public static void productOfTwoNumbers(int num1, int num2){
        int product = num1 * num2;
        System.out.print(product);
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter first Number: ");
            int x = sc.nextInt();
            System.out.print("Enter second Number: ");
            int y = sc.nextInt();
            productOfTwoNumbers(x, y);
        }
    }
}
