package Javarush.task08.task0827;

//package com.javarush.task.task08.task0827;

/*
Работа с датой
*/

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 2 2013"));
    }

    public static boolean isDateOdd(String date) {
        DateFormat df = new SimpleDateFormat("MMMM d y", Locale.ENGLISH);
        Date date2 = new Date();
        Calendar calendar = new GregorianCalendar();

        try {
            date2 = df.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        calendar.setTime(date2);

        if (calendar.get(Calendar.DAY_OF_YEAR) % 2 == 1) return true;
        else return false;
    }

    private static String getDate(String date) {
        return date;
    }
}



















