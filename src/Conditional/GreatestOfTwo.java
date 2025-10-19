package Conditional;
import java.util.Scanner;
public class GreatestOfTwo {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int y = sc.nextInt();
        if(x>y){
            System.out.println(" "+x+" is greatest");
        }
        if(y>x){
            System.out.println(" "+y+" is greatest");
        }
    }
}
