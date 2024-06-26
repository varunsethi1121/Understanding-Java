import java.util.*;
public class patternBasedHalfPyramid {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number of lines you want to have in your pattern: ");
            int num = sc.nextInt();
            for(int line=1;line<=num;line++){
                for (int star=1;star<=line;star++){
                    System.out.print(star);
                }
                System.out.println(" ");
            }
        }
    }
}
// OUTPUT
// 1
// 12
// 123
// 1234
// 12345