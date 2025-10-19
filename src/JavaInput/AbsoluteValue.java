package JavaInput;
import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integers : ");
        int n = sc.nextInt();
        if(n<0){
            //if n is less than zero
            n = n *(-1);
        }
        System.out.println("The absolute value of given input is : "+n);
    }
}
