// CONDITIONAL STATEMENTS
import java.util.*;
public class taxCalcuatorCS {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter your anually Income in INR: ");
            long income = sc.nextLong();
            double tax;
            if (income < 500000){
                System.out.println("According to the income that you have enterd your tax would be 0% of your anual income.");
                System.out.println("Your calculatyed tax is rupees: 0 in INR.");
            }
            else if (income >= 500000 && income <1000000){
                System.out.println("According to the income that you have enterd your tax would be 20% of your anual income.");
                tax = income*0.20;
                System.out.println("Your calculatyed tax is rupees: " + tax + " in INR.");
            }
            else {
                System.out.println("According to the income that you have enterd your tax would be 30% of your anual income.");
                tax = income*0.30;
                System.out.println("Your calculatyed tax is rupees: " + tax + " in INR.");
            }
        }
    }
}
