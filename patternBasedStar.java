// PATTERN BASED QUESTIONS
import java.util.*;
public class patternBasedStar {
    public static void main(String args[]){
        try(Scanner sc = new Scanner (System.in)){
            System.out.println("Enter the number of line you want to have in your pattern: ");
            int n = sc.nextInt();
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(" * ");
                }
                System.out.println(" ");
            }
        }
    }
}
// OUTPUT
//  *
//  *  *
//  *  *  *
//  *  *  *  *
//  *  *  *  *  *
