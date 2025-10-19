package PatternPrinting;
import java.util.Scanner;
public class SolidRectangle {
    public static void main(String[] args) {
        int rows,columns;

        Scanner scan=new Scanner(System.in);
        //create a scanner object for input
        System.out.print("Enter the number of rows: ");
        rows=scan.nextInt();
        //get input from the user for row
        System.out.print("Enter the number of rows: ");
        columns=scan.nextInt();
       //get input from the user for column
        for (int i=1; i<=rows; i++){
            for (int j=1; j<=columns; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}

