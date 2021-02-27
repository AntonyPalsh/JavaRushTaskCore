package com.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader rider = new BufferedReader(new InputStreamReader(System.in));
        InputStream input = new FileInputStream(rider.readLine());
        Scanner scanner = new Scanner(input);
        List<Integer> numbers = new ArrayList<>();

        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            if (number % 2 == 0) numbers.add(number);
        }
        Collections.sort(numbers);
        for (Integer number : numbers) {
            System.out.println(number);
        }
        input.close();
    }
}
