<<<<<<< HEAD
import java.util.Scanner;

public class areaOfCircleUserInput {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) { // Using try-with-resources
            System.out.println("Enter the radius of a Circle: ");
            int radius = sc.nextInt();
            int areaOfCircle = (int) (3.14 * radius * radius);
            System.out.println(areaOfCircle);
        }
    }
}

//IF YOU WILL ENCOUNTER THIS WARNING Resource leak: 'sc' is never closedJava(536871799) USE TRY BLOCK
=======
import java.util.Scanner;

public class areaOfCircleUserInput {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) { // Using try-with-resources
            System.out.println("Enter the radius of a Circle: ");
            int radius = sc.nextInt();
            int areaOfCircle = (int) (3.14 * radius * radius);
            System.out.println(areaOfCircle);
        }
    }
}

//IF YOU WILL ENCOUNTER THIS WARNING Resource leak: 'sc' is never closedJava(536871799) 
//USE TRY BLOCK
>>>>>>> 585c31b (First Commit)
