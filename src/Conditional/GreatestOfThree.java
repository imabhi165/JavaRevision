package Conditional;
import java.util.Scanner;
public class GreatestOfThree {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter Three numbers: ");
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c){
            //a is max
            System.out.println(+a+ " is greatest");
        }
        if(b>a && b>c){
            //b is max
            System.out.println(+b+ " is greatest");
        }
        else{
            //c is max
            System.out.println(+c+" is greatest");
        }
    }
}
