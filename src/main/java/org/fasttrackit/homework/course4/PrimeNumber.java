package org.fasttrackit.homework.course4;

public class PrimeNumber {

    public static void main(String[] args) {

        for (int a = 2; a <= 100; a++) {

            for (int b = 2; b <= a; b++) {

                    if (b == a) {
                        System.out.println(" Result : " + a + " is a prime number.");
                    }
                    if (a % b == 0) {
                        break;
                    }
                }
            }
        }
    }
