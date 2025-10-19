package JavaInput;
import java.util.Scanner;
public class AreaAndPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle : ");
        int l = sc.nextInt(); // l is symbolized for length
        System.out.print("Enter breadth of rectangle : ");
        int b = sc.nextInt(); // b is symbolized for breadth
        System.out.println("The Area of rectangle is " + l * b);
        System.out.println("The perimeter is " + (l + b) * 2);
        int area = l * b;
        int perimeter = 2 * (l + b);
        if(area > perimeter) {
            System.out.println("Area is greater than perimeter");
        }
        else if(perimeter > area){
            System.out.println("Perimeter is greater than area");
        }
        else{
            System.out.println("The area and perimeter are equal");
        }
    }
}


