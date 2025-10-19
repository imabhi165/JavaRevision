package JavaInput;
import java.util.Scanner;
public class FindRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter divided: ");
        int a = sc.nextInt();
        System.out.print("Enter divisor: ");
        int b = sc.nextInt();
        int q = a/b;
        int Remainder = a - (b * q);
        System.out.println("The remainder when "+a+" is divided by "+b+" : " +Remainder);
        System.out.println("The quotient of two number is: " +q);
    }
}
