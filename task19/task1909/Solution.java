package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file1 = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter file2 = new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();

        while (file1.ready()) {
            int i = file1.read();
            if (i == 46) i = 33;
            file2.write(i);
        }
        file1.close();
        file2.close();
    }
}
