//CONDITIONAL STATEMENTS

import java.util.*;

public class evenOrOddCS {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number you want to check: ");
            int num = sc.nextInt();
            if (num == 0){
                System.out.println("The number you have entered is neither Even nor Odd");
            }
            else{
                if (num%2==0){
                    System.out.println("The number you have entered is an Even Number");
                }
                else{
                    System.out.println("The number you have entered is an Odd Number");
                }
            }
        }
    }
}
