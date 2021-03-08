package com.javarush.task.task19.task1923;

import java.io.*;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader file1 = new BufferedReader(new FileReader(args[0]));
        FileWriter file2 = new FileWriter(args[1]);

        while (file1.ready()) {
            String[] words = file1.readLine().split(" ");
            for (String word : words) {
                if (word.matches(".+[0-9].+")) file2.write(word + " ");
            }
        }
        file1.close();
        file2.close();
    }
}
