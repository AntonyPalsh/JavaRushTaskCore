package com.javarush.task.task19.task1919;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader file = new BufferedReader(new FileReader(args[0]));
        TreeMap<String, Double> map = new TreeMap<>();

        while (file.ready()) {
            String[] line = file.readLine().split(" ");
            double value = Double.parseDouble(line[1]);
            if (map.containsKey(line[0])) value += map.get(line[0]);
            map.put(line[0], value);
        }
        file.close();

        for (Map.Entry<String, Double> entry: map.entrySet() ) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
