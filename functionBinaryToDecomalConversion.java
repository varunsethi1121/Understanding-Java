import java.util.*;
public class functionBinaryToDecomalConversion {
    public static void binaryToDecimal(int binary){

        int myBinary = binary;
        int power = 0;
        int decimalNUmber = 0;

        while(binary>0){
            int lastDigit = binary % 10;
            decimalNUmber =decimalNUmber + (lastDigit * (int)Math.pow(2, power));
            power++;
            binary = binary/10;
        }
        System.out.print("The decimal of " + myBinary + " is: " + decimalNUmber);
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the binary number that you want to convert: ");
            int binary = sc.nextInt();
            binaryToDecimal(binary);
        }
    }
}
