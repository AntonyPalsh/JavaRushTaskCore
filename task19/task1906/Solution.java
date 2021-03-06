package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader file1 = new FileReader(reader.readLine());
        FileWriter file2 = new FileWriter(reader.readLine());
        reader.close();
        int count = 1;

        while(file1.ready()) {
            int i = file1.read();
            if (count%2 == 0) file2.write(i);
            count++;
        }

        file1.close();
        file2.close();
    }
}
