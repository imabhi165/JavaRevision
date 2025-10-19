package Conditional;
import java.util.Scanner;
public class Nested3or5Not15 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if(n%5==0 || n%3==0){
            if(n%15!=0){
                System.out.println("The number is Divisible by 3 or 5 but not by 15");
            }
            else{
                System.out.println("Not matching the required condition ");
            }
        }
    }

}
