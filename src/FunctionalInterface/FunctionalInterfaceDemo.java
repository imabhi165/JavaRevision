package FunctionalInterface;

// @FunctionalInterface
// interface BookAction {
// void perform();
// // void read() -> we cannot use more than 1 method in functional interface.
// }

// Older method to implement interface

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

class Addition implements Calculator {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}

// Lambda Expression -> it is a way to create functional interface
// Syntax -> (parameters) -> Expression {body}
// () -> {};

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {
        Calculator additionCalculator = new Addition();
        int result = additionCalculator.calculate(10, 20);
        System.out.println("Tradition Approach: " + result);
    };
}
