package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            InputStream inputStream = new FileInputStream(reader.readLine());

            Scanner scanner = new Scanner(inputStream);
            StringBuilder stringBuilder = new StringBuilder();

            while (scanner.hasNextLine()) {
                stringBuilder.append(scanner.nextLine()).append("\n");
            }
            System.out.print(stringBuilder.toString());

            inputStream.close();
            reader.close();
        //} catch (Exception e) {
        //    System.out.println("Возникло исключение!");
        //}

    }
}