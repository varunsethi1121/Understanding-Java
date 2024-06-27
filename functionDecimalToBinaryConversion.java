import java.util.*;
public class functionDecimalToBinaryConversion {
    public static void decimalToBinary(int decimalNUmber){
        int power = 0;
        int binaryNumber = 0;
        int myDecimalNumber = decimalNUmber;
        while(decimalNUmber>0){
            int remainder = decimalNUmber % 2; //CLCULATING REMAINDER
            binaryNumber = binaryNumber + remainder * (int)Math.pow(10 , power);
            power++;
            decimalNUmber=decimalNUmber/2; //CALCULATING QUOTIENT
        }
        System.out.print("The binary of " + myDecimalNumber + " is: " + binaryNumber);
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the binaray number you want to convert: ");
            int decimalNumber = sc.nextInt();
            decimalToBinary(decimalNumber);
        }
    }
    
}
