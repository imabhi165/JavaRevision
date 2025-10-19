package PatternPrinting;
import java.util.Scanner;
public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int i,j;
        System.out.print("Enter the number of Rows: ");
         int m= sc.nextInt();
        System.out.print("Enter the number of columns: ");
         int n= sc.nextInt();
         for(i=1; i<=m; i++){
             for(j=1; j<=n; j++){
                 if((i==1 || i==n) || (j==1 || j==n)){
                     System.out.println("*");
                 }
                 else{
                     System.out.println(" ");
                 }
                 System.out.println();
             }
         }
    }
}

//
//        System.out.println("Enter the number of rows: ");
//
//        int n = sc.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//
//            for (int j = 1; j <= n; j++) {
//
//                if (i == 1 || i == n || j == 1 || j == n)
//
//                    System.out.print("*");
//
//                else
//
//                    System.out.print(" ");
//
//            }
//
//            System.out.println();
//
//        }



