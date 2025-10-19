package Conditional;
import java.util.Scanner;
public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int x = sc.nextInt();
        if(x%5==0){
            System.out.println("The number you entered is divisible by 5");
        }
        else {
            System.out.println("The number you entered is not divisible by 5");
        }
    }
}
