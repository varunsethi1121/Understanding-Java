public class printReverseOfANumberW {
    public static void main(String args[]){
        int num = 11201;
        while (num>0){
            int lastDigit = num%10;
            System.out.print(lastDigit);
            num = num/10;
        }
    }
}
