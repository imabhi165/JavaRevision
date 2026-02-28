import java.util.Scanner;

public class NmSystem2 {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the Value Here : ");
      int decimal_num = sc.nextInt();
      int ans = 0; // Binary number
      int pw = 1; // it is representing power of 10
      while (decimal_num > 0) {
        int parity = decimal_num % 2;
        ans += (parity * pw);
        pw *= 10;
        decimal_num /= 2;
      }
      System.out.println("The conversion of binary to decimal is : " + ans);
    }
  }
}
