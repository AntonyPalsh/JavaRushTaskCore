package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream file1 = new FileInputStream(reader.readLine());
        FileOutputStream file2 = new FileOutputStream(reader.readLine());

        byte[] buffer = new byte[file1.available()];
        int count = file1.read(buffer, 0, file1.available());

        for (int i = 0; i < buffer.length / 2; i++) {
            byte tmp = buffer[i];
            buffer[i] = buffer[buffer.length - i - 1];
            buffer[buffer.length - i - 1] =  tmp;
        }

        file2.write(buffer, 0, count);

        file1.close();
        file2.close();

    }
}
