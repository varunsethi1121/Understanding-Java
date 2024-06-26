import java.util.*;
public class sumOfFirstnNaturalNumbersW {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number: ");
            int num = sc.nextInt();
            int sum = 0;
            int count=1;
            while(count<=num){
                sum=sum+count;
                count++;
            }
            System.out.println("Sum of first " + num + " natural numbers are: " + sum);
        }
    }
}
