package com.javarush.task.task12.task1229;

/* 
Родитель класса CTO
*/

import java.security.PublicKey;

public class Solution {

    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static class S1 {
        public void workHard() {

        }
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class CTO extends S1 implements Businessman {

    }
}
