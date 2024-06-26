import java.util.*;
public class numericalTableLoops {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number whose table you want to print: ");
            int num1 = sc.nextInt();
            System.out.print("Enter the number till you want table to be printed: ");
            int num2 = sc.nextInt();
            for (int i=1;i<=num2;i++){
                System.out.println(num1 + " * " + i + " = " + num1*i);
            }
        }
    }
}
