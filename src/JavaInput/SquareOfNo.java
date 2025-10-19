package JavaInput;
import java.util.Scanner;
public class SquareOfNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number: ");
        int x = sc.nextInt();
        int sqr = x*x;
        System.out.println("Square of the Number is : " +sqr);
    }
}
