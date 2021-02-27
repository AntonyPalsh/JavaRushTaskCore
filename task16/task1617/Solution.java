package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();

        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        int halfSeconds = 0;
        int seconds = 0;
        public RacingClock() {
            start();
        }

        public void run() {
           try {
               seconds = numSeconds;

               while (true) {
                   if (halfSeconds%2 == 0 && numSeconds != 0) {
                       System.out.print(numSeconds + " ");
                       numSeconds--;
                   }
                   Thread.sleep(500);
                   halfSeconds++;

               }

           } catch (InterruptedException e) {
               if (seconds == 3) System.out.print("Марш!");
               else System.out.print("Прервано!");
           }
        }
    }
}
