package Conditional;
import java.util.Scanner;
public class DivisibilityByFiveOrThree {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit: ");
        int n = sc.nextInt();
        if(n%5 == 0 && n%3 == 0){
            System.out.println("The number is divisible by 3 and 5");
        }
        else{
            System.out.println("The number is not divisible by 3 and 5");
        }

    }
}
