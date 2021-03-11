package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/

public class Solution implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println(new Solution(4));

        Solution solution1 = new Solution(3);
        Solution solution2 = new Solution(7);

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\admin\\IdeaProjects\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task20\\task2014\\file.dat"));
        outputStream.writeObject(solution1);
        outputStream.close();

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\admin\\IdeaProjects\\JavaRushTasks\\2.JavaCore\\src\\com\\javarush\\task\\task20\\task2014\\file.dat"));
        solution2 = (Solution) inputStream.readObject();

        System.out.println(solution1.string.equals(solution2.string));
    }

    private final transient String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution() {}
    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}
