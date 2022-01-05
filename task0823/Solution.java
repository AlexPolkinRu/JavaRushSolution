package Javarush.task0823;

//package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/*
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        //напишите тут ваш код
        String tempString = "";
        string = string.trim();
        String[] words = string.split(" ");
        for (String ss : words) {
            if (ss.length() > 0) {
                tempString += ss.substring(0,1).toUpperCase() + ss.substring(1) + " ";
            }
        }
        string = tempString.trim();
        System.out.println(string);
    }
}