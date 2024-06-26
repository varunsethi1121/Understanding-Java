
import java.util.*;
public class patternBasedInvertedStar {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number of lines you want to have in your pattern: ");
            int num = sc.nextInt();
            for(int line=1;line<=num;line++){
                for(int star=1;star<=num-line+1;star++){
                    System.out.print(" * ");
                }
                System.out.println(" ");
            }
        }
    }
}
// OUTPUT
// *  *  *  *  *
// *  *  *  *
// *  *  *
// *  *
// *