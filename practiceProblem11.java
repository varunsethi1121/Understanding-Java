/* In  aprogram,input  3numbers:A,B and C.You have to output the average of these 3 numbers.
(Hint : Average of N numbers is sum of those numbers divided by N */

import java.util.*;
public class practiceProblem11{
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.println("Enter second number: ");
            int num2 = sc.nextInt();
            System.out.println("Enter third number: ");
            int num3 = sc.nextInt();
            float avg = (float)(num1+num2+num3)/3;
            System.out.println(avg);
        }
    }
}
