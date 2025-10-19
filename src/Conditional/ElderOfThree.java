package Conditional;
import java.util.Scanner;
public class ElderOfThree {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age of first man: ");
        int x = sc.nextInt(); //x is the age of first man
        System.out.print("Enter the age 0f second man: ");
        int y = sc.nextInt(); //y is the age of 2nd man
        System.out.print("Enter the age of third man: ");
        int z = sc.nextInt();
        if(x<y && x<z){
            System.out.println("The first man whose age  "+x+" is younger than both");
        }
        else if(y<x && y<z){
            System.out.println("The 2nd man whose age "+y+" is younger than both ");
        }
        else if(z<x && z<y){
            System.out.println("The 3rd man whose age "+z+" is younger than both");
        }
        else if(x==y && x==z && y==z  ){
            System.out.println("They have same age");
        }

    }
}
