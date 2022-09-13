package org.fasttrackit.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ExcelReaderA {

        public static void main(String[] args) throws Exception {
            File file = new File("//");
            BufferedReader br = new BufferedReader(new FileReader(file));

            String st = br.readLine();
            while (st != null) {
                System.out.println(st);
                st = br.readLine();
            }
        }
    }


