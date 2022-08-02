package org.fasttrackit.homework.course7.rebuilt;

public class PasswordMaker {

    public static void main(String[] args) {

        String pw1 = "Th1sPassw0RD";

        int uppC = 0;
        int lowerC = 0;
        int lettAndDig = 0;
        int dig = 0;

        char[] ch = pw1.toCharArray();

        if (ch.length <= 12) {
            System.out.println("Password has 12 characters");
        }

        for (int i = 0; i < ch.length; i++) {
            char c = pw1.charAt(i);

            if (Character.isUpperCase(c)) {
                uppC++;
            }
            if (Character.isLowerCase(c)) {
                lowerC++;
            }

            if (Character.isDigit(c) || Character.isLetter(c)) {
                lettAndDig = 0;
            } else lettAndDig++;

            if (Character.isDigit(c)) {
                dig++;
            }
        }

        if (uppC == 0 && lowerC == 0) {

            System.out.println("Password dont have uppercase and lowercase");
        }

        if (dig < 3) {
            System.out.println("Password dont have at least 3 digits");
        }

        if (lettAndDig > 0) {
            System.out.println("Password dont have only letters and digits");
        }

    }
}
