package JavaInput;
import java.util.Scanner;

public class SpAndCp {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter cost price : ");
        double CP = sc.nextInt();
        System.out.print("Enter selling price : ");
        double SP = sc.nextInt();

        if(SP>CP){
            System.out.print("PROFIT is : ");
            System.out.println(SP-CP);
        }
        else{
            System.out.print("LOSS is : ");
            System.out.println(CP-SP);
        }


    }
}
