package Conditional;
import java.util.Scanner;
public class DivisibleBy3And5 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x = sc.nextInt();
        if(x%5==0){
            if(x%3==0){
                System.out.println(""+x+" is Divisible by 5 and 3 both");
            }
            else {
                System.out.println("" +x+" is Not divisible by 5 and 3 both ");
            }
        }
        else{
            System.out.println(""+x+" is not divisible by 3 and 5");
        }
    }
}
