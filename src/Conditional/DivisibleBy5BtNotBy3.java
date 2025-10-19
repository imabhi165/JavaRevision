package Conditional;
import java.util.Scanner;
public class DivisibleBy5BtNotBy3 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: "); // homework hai ye
        int n = sc.nextInt();
        if(n%5==0 || n%3==0){
            System.out.println("divisible by 5");
        }
        else{
            System.out.println("Divisible by 3");
        }
    }
}
