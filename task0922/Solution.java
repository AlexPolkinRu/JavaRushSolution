package Javarush.task0922;

//package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        Date date;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            date = new SimpleDateFormat("yyyy-M-d").parse(reader.readLine());
            System.out.println(new SimpleDateFormat("MMM d, y", Locale.ENGLISH).format(date).toUpperCase());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}































