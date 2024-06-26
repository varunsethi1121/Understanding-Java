//Enter cost of 3 items from the user(using float datatype)-a pencil,a pen and an eraser. 
//You have to output the total cost of the items back to the user as their bill.

import java.util.*;
public class practiceProblem13 {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the price of a pen: ");
            float penPrice = sc.nextFloat(); 
            System.out.println("Enter the price of a pencil: ");
            float pencilPrice = sc.nextFloat(); 
            System.out.println("Enter the price of an eraser: ");
            float eraserPrice = sc.nextFloat();
            float totalPrice = (float) (penPrice + pencilPrice + eraserPrice);
            float finalPrice = (float) ((totalPrice*0.18) + totalPrice);
            System.out.println(finalPrice);
        }
    }
}
