//LEAP YEAR CHECK

import java.util.*;
public class leapYearCS {
public static void main(String args[]){
    try(Scanner sc = new Scanner(System.in)){
        System.out.println("Enter the year you want to check for: ");
        int year = sc.nextInt();
        if ((year%4==0) && ((year%100!=0) || (year%400==0))){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}
}
