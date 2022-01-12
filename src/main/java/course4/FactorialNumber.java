package course4;

public class FactorialNumber {
    public static void main(String[] args) {

        int a = 1;
        int b = 5;

        for (int i = 1; i < b; i++) {
            a = a * b;
        }
        System.out.println("Factorial number = " + a);
    }

}
