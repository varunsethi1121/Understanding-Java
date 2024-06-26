import java.util.*;

// public class primeNumber {
//     public static void main(String args[]){
//         try(Scanner sc = new Scanner(System.in)){
//             System.out.print("Enter the number you want to check for: ");
//             int num = sc.nextInt();
//             int count =1;
//             if (num!=1 || num!=0){
//                 for (int i=2;i<=num-1;i++){ //HERE THE CODE WILL RUNE FOR N-1 TIKMES WITH COMPLEXITY IOF O(N)
//                     if (num%i==0){
//                         count++;
//                     }
//                 }
//             }
//             if (count==2){
//                 System.out.println("The number you have entered is Prime");
//             }
//             else{
//                 System.out.println("The number you have entered is Not Prime");
//             }
//         }
//     }
// }

public class primeNumber {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number you want to check for: ");
            int num = sc.nextInt();
            if(num == 2){
                System.out.println("The number you have entered is Prime");
            }
            else{
                boolean isPrime = true;
                for (int i=2;i<=Math.sqrt(num);i++){ //HERE THE CODE WILL RUNE FOR N^(1/2) TIKMES WITH COMPLEXITY IOF O(N^(1/2))
                    if (num%i==0){
                        isPrime = false;
                    }
                }
            if (isPrime==true){
                System.out.println("The number you have entered is Prime");
            }
            else{
                System.out.println("The number you have entered is Not Prime");
            }
            }
        }
    }
}

// public class primeNumber {
//     public static void main(String args[]){
//         try(Scanner sc = new Scanner(System.in)){
//             System.out.print("Enter the number you want to check for: ");
//             int num = sc.nextInt();
//             if (num <= 1) {
//                 System.out.println("The number you have entered is Not Prime");
//             } else {
//                 boolean isPrime = true;
//                 for (int i = 2; i <= Math.sqrt(num); i++) {
//                     if (num % i == 0) {
//                         isPrime = false;
//                         break;
//                     }
//                 }
//                 if (isPrime) {
//                     System.out.println("The number you have entered is Prime");
//                 } else {
//                     System.out.println("The number you have entered is Not Prime");
//                 }
//             }
//         }
//     }
// }
