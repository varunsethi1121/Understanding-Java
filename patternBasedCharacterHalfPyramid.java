import java.util.*;
public class patternBasedCharacterHalfPyramid {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number of lines you want to have in your pattern: ");
            int num = sc.nextInt();
            char ch = 'A';
            for(int line=1;line<=num;line++){
                for(int alpha=1;alpha<=line;alpha++){
                    System.out.print(ch);
                    ch++;
                }
                System.out.println(" ");
            }
        }
    }
}

// OUTPUT
// A 
// BC 
// DEF 
// GHIJ 
// KLMNO 