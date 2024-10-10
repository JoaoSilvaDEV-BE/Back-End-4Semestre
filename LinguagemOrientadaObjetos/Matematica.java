public class Matematica {
    static int mult(int a, int b) {
        return a * b;
    }

    static double mult(double a, double b) {
        return a * b;
    }

    static double mult(double a, double b, double c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        System.out.println("Mult: " + Matematica.mult(5, 3));
    }
}