package com.javarush.task.task18.task1816;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(args[0]);
        int i;
        int count = 0;
        while (fileInputStream.available() > 0) {
            i = fileInputStream.read();
            if (i >= 65 && i <= 90 || i >= 97 && i <= 122 ) count++;
        }
        fileInputStream.close();
        System.out.println(count);
    }
}
