package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream fileInput1 = new FileInputStream(reader.readLine());
        FileOutputStream fileOutput2 = new FileOutputStream(reader.readLine());
        FileOutputStream fileOutput3 = new FileOutputStream(reader.readLine());

        int half = 0;
        if (fileInput1.available()%2 == 0) half = fileInput1.available() / 2;
        else half = (fileInput1.available() + 1) / 2;

        byte[] bufferFile1a = new byte[half];
        byte[] bufferFile1b = new byte[fileInput1.available() - half];

        fileInput1.read(bufferFile1a, 0, bufferFile1a.length);
        fileInput1.read(bufferFile1b, 0, bufferFile1b.length);

        fileOutput2.write(bufferFile1a, 0, bufferFile1a.length);
        fileOutput3.write(bufferFile1b, 0, bufferFile1b.length);

        fileInput1.close();
        fileOutput2.close();
        fileOutput3.close();
    }
}
