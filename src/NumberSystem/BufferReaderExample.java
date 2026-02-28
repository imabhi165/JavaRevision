import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferReaderExample {
  public static void main(String[] args) throws IOException {
    /*
     * what is BufferReader -> It is similar to Scanner class.
     * BufferReader only reads String,so you need to convert if it is needed.
     * int num = Integer.parseInt(str);
     * String str = br.reaLine();
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter your city name: ");
    String city = br.readLine();
    System.out.println("Enter your pin code: ");
    int pin = Integer.parseInt(br.readLine());
    System.out.println("Enter your phone Num: ");
    int Num = Integer.parseInt(br.readLine());
    System.out.println("City: " + city + ",Pincode: " + pin + ",Phone num: " + Num);
  }
}
