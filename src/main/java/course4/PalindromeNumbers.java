package course4;

public class PalindromeNumbers<y, x> {

    public static void main(String[] args) {

        int a = 121;
        int b = a;
        int c = 0;

        while (a > 0) {

            c = c*10;
            c = c + (a % 10);
            a = a / 10;
        }
        if (c == b) {
            System.out.println("The number is palindrome");
        } else {
            System.out.println("The number is not palindrome");
        }
    }
}