package Conditional;
import java.util.Scanner;
public class PercentageElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter percenatge: ");
        int n = sc.nextInt(); // n denotes percentage
        if (n > 90 ) {
            System.out.println("Excellent");
        } else if (n > 80) {
            System.out.println("Very good");
        } else if (n > 60) {
            System.out.println("Can do better");
        } else if (n > 70) {
            System.out.println("Good");
        } else if (n > 50) {
            System.out.println("Average marks");
        } else if (n > 40) {
            System.out.println("Below Average");
        } else {
            System.out.println("fail");
        }
    }
}
