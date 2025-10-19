package JavaInput;
import java.util.Scanner;
public class CelciusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fahernheit : "); //Fahrenheit to calcius
        double F = sc.nextInt();
        double C = (F - 32)/1.8;
        System.out.println("The conversion of farenheit to celcius is : "+C);
    }
}
