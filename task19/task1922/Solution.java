package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();
        ArrayList<String> list = new ArrayList<>();

        while (file.ready()) {
            int count = 0;
            String line = file.readLine();
            String[] worldsLine = line.split(" ");
            for (int i=0; i < worldsLine.length; i++) {
                if (words.contains(worldsLine[i])) count++;
            }
            if (count == 2) list.add(line);
        }
        file.close();

        for (String line : list) {
            System.out.println(line);
        }
    }
}
