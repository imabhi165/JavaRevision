package BasicsOfJava;

public class operators {
    public static void main(String[] args) {
        int a = 50, b = 10, c = 30, result;
        //result holds max of three
        //number
        result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
        System.out.println("maximum of three number = " +result);

    }
}
