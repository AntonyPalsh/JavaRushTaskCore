package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();
        int count = 0;

        while (file.ready()) {
            String str = file.readLine().replaceAll("\\p{Punct}", " ").replaceAll("\\s", " ");

            for (String word : str.split(" ")) {
                if (word.equals("world")) count++;
            }
        }
        file.close();
        System.out.println(count);
    }
}
