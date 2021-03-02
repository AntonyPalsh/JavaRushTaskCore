package com.javarush.task.task18.task1817;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.Format;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        int count = 0;
        int space = 0;
        int i;


        while (fileInputStream.available() > 0) {
            i = fileInputStream.read();
            count++;
            if (i == 32) space++;
        }
        System.out.printf("%.2f", (double) space/count * 100);
        fileInputStream.close();
    }
}
