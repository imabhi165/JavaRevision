package JavaInput;
import java.util.Scanner;
public class AreaOfCirclewthInput {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius : ");
        int radius;
        radius = sc.nextInt();
        double pi = 3.1415;
        double Area = pi*radius*radius;
        System.out.println("The area of circle is : " +Area);
    }
}
