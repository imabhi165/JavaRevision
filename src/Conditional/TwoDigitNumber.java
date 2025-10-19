package Conditional;
import java.util.Scanner;
public class TwoDigitNumber {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if(n>9 && n<100){
            System.out.println("This is two digit number");
        }
        else{
            System.out.println("This is not two digit number");
        }
    }
}
