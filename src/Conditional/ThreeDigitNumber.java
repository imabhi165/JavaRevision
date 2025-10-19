package Conditional;
import java.util.Scanner;
public class ThreeDigitNumber {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n>99 && n<1000){
            System.out.println("This is 3 digit number");
        }
        else{
            System.out.println("This is not three digit number");
        }
    }
}
