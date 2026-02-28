import java.util.Scanner;

public class PrintCountingNumber {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter size of num to be print: ");
      int size = sc.nextInt();
      for (int i = 1; i <= size; i++) {
        System.out.println(i);
      }
    }
  }
}
