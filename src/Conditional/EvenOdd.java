package Conditional;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x = sc.nextInt();
        if(x % 2 == 0){
            System.out.println("It is even number");
        }
        else{
            System.out.println("It is odd number");
        }
    }
}

