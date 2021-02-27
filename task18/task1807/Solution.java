package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());

        int count = 0;
        while (fileInputStream.available() > 0) {
            int oneByte = fileInputStream.read();
            if (oneByte == 44) count += 1;
        }
        System.out.println(count);
        fileInputStream.close();
    }
}
