package Conditional;
import java.util.Scanner;
public class YoungestOfThree {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of Ram: ");
        int r = sc.nextInt(); //r is the age of Ram
        System.out.print("Enter the age of Shyam: ");
        int s = sc.nextInt(); //s is the age of Shyam
        System.out.print("Enter the age of Ajay: ");
        int a = sc.nextInt(); //a is the age of Ajay
        if(r<s && r<a){
            System.out.println("Ram is younger than Shyam and Ajay");
        }
        else if (s<r && s<a) {
            System.out.println("Shyam is younger than Ram and Ajay");
        } else if(a<r && a<s) {
            System.out.println("Ajay is younger than Ram and Shyam");

        }

    }
}
