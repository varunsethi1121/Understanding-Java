import java.util.*;
public class functionAverageOfThreeNumbers {
    public static void averageOfThreeNumbers(int num1, int num2, int num3){
        int averageOfThreeNumbers = (num1+ num2 + num3) / 3;
        System.out.print("The average of the three numbers that you have entered is: " + averageOfThreeNumbers);
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter first number: ");
            int x = sc.nextInt();
            System.out.print("Enter second number: ");
            int y = sc.nextInt();
            System.out.print("Enter third number: ");
            int z = sc.nextInt();
            averageOfThreeNumbers(x, y, z);
        }
    }
}
