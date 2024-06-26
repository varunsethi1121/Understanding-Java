import java.util.Scanner;
public class functionCallByValue {
    public static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2  =temp;
        //THESE LINE WILL WORK ON THE COPY OF X AND Y CREATED WHILE CALLING SWAP FUNCTION 
        System.out.println("Num1 is: "+num1);
        System.out.println("Num2 is: "+num2);
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter first Number: ");
            int x = sc.nextInt();
            System.out.print("Enter second Number: ");
            int y = sc.nextInt();
            swap(x, y);
            //THESE LINE WILL RETURN THE ORIGINAL VALUES OF X AND Y
            System.out.println("Num1 is: "+ x);
            System.out.println("Num2 is: "+ y);
        }
    }
}
