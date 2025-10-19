package Conditional;
import java.util.Scanner;
public class TrianglePrblm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st side of triangle: ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd side of triangle: ");
        int b = sc.nextInt();
        System.out.print("Enter the 3rd side of triangle: ");
        int c = sc.nextInt();
        if((a+b)>c && (b+c)>a && (a+c)>b ) {
            System.out.println("Formation of triangle is possible");
        }
        else{
            System.out.println("formation of triangle is Impossible");
        }

    }
}
