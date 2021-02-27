package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()));
        StringBuilder builder =new StringBuilder();

        String str = "";
        while (!"exit".equals(str)) {
            str = reader.readLine();
            builder.append(str).append("\n");
        }
        writer.write(builder.toString());
        writer.close();
        reader.close();
    }
}
