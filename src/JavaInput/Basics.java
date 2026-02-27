import java.util.Scanner;

public class Basics {
  public static void main(String[] args) {
    /*
     * Input in java :- There are common input methods in java.
     * 1.nextInt() -> Reads an Int value.
     * 2.nextDouble() -> Reads a double value.
     * 3.next() -> Reads a single word(String).
     * 4.nextLine() -> Reads a full line(String).
     * 5.nextBoolean() -> Reads a boolean value.
     * 6.nextFloat() -> Reads a float value.
     * 7.nextLong() -> Reads a Long value.
     * 8.nextShort() -> Reads a short value.
     * 9.nextByte() -> Reads a Byte value.
     */

    try (Scanner sc = new Scanner(System.in)) {
      /*
       * // Read a Integer value.
       * System.out.println("Enter a Int value: ");
       * int x = sc.nextInt();
       * System.out.println("Entered Value is : " + x);
       * // Read a String Value.
       * System.out.println("Enter a String: ");
       * String s = sc.next();
       * System.out.println("Entered string is: " + s);
       * // Read a single line.
       * System.out.println("Enter a Line: ");
       * String l = sc.nextLine();
       * sc.nextLine();
       * System.out.println("Entered Line is: " + l);
       */
      // int input
      System.out.println("Enter your age: ");
      int age = sc.nextInt();
      sc.nextLine(); // clear newline
      // String input(full line).
      System.out.println("Enter your Name : ");
      String name = sc.nextLine();

      // char input.
      System.out.println("Enter gender(M/F): ");
      char gender = sc.next().charAt(0);
      // double input.
      System.out.println("enter your weight: ");
      double weight = sc.nextDouble();

      System.out.println("\n-----------   output  -----------");
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
      System.out.println("Gender: " + gender);
      System.out.println("Weight: " + weight);
      System.out.println("---------------------------------");
    }

  }
}
