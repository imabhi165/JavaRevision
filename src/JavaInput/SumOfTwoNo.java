package JavaInput;
import java.util.Scanner;
public class SumOfTwoNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("First Number is : ");
        int x = sc.nextInt();
        System.out.print("Second number is : ");
        int y = sc.nextInt();
        int sum = x + y;
        System.out.println("The sum of "+x+" and "+y+" is : " +sum);

    }

}
