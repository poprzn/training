package course4;

import java.util.Scanner;

public class MathsInJava {

    public static void main(String[] args) {

        int ob1 = 4;
        int ob2 = 10;
        int result1 = (ob2 / 2) * ob1;
        System.out.println("Result 1 = " + result1);


        int a = 1;
        while (a < 10) {
            System.out.println("Result 2 = " + a);
            a++;
        }

        for (int b = 1; b < 50; b++) {
            System.out.println("Result 3 = " + b);
        }

        int j = 20;
        int k = 22;
        int l = 12;
        int m = 11;

        boolean result123 = (++j >= k) && (++m <= l);
        System.out.println("Result 4 = " + result123);


        int o = 5;
        int p = 7;
        int q = 9;
        int r = 10;

        boolean result321 = (++q >= r) || (++o >= p);
        System.out.println("Result 5 = " + result321);


        int q1 = 9;
        int r1 = 10;

        String result5643 = (++q1 >= --r1) ? "true" : "false";
        System.out.println("Result 6 = " + result5643);

    }
}












