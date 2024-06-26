//In a program,input the side of a square.You have to output the area of the square
import java.util.*;
public class practiceProblem12 {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the side of the square: ");
            int side = sc.nextInt();
            int area = side*side;
            System.out.println(area);
        }
    }
}
