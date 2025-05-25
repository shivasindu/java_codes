class MathOperations {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class OverloadingExample {
    public static void main(String[] args) {
        MathOperations m = new MathOperations();
        System.out.println(m.add(3, 4));         // Output: 7
        System.out.println(m.add(2.5, 4.5));     // Output: 7.0
    }
}
