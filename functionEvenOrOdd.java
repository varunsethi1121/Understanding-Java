import java.util.*;
public class functionEvenOrOdd {
    public static boolean evenOrOdd(int num){
        if (num%2==0)
            return true;
        return false;
        

    }
    public static void main(String args[]){
        try(Scanner sc  = new Scanner(System.in)){
            System.out.print("Enter the number that you want to check for: ");
            int x = sc.nextInt();
            System.out.print(evenOrOdd(x));
        }
    }
    
}
