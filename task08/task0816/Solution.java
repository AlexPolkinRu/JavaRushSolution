package Javarush.task08.task0816;

//package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));

        //напишите тут ваш код
        map.put("Полочкин", dateFormat.parse("DECEMBER 11 1981"));
        map.put("Иванов", dateFormat.parse("AUGUST 2 2014"));
        map.put("Петров", dateFormat.parse("SEPTEMBER 8 2015"));
        map.put("Павлов", dateFormat.parse("JULY 3 2012"));

        map.put("Кузнецов", dateFormat.parse("JANUARY 7 2001"));
        map.put("Сергеев", dateFormat.parse("JUNE 9 2013"));
        map.put("Николаев", dateFormat.parse("NOVEMBER 6 2003"));
        map.put("Хохлов", dateFormat.parse("APRIL 5 2004"));
        map.put("Макаров", dateFormat.parse("MARCH 10 2005"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        String[] keys = new String[10];
        int counter = 0;
        for (Map.Entry<String, Date> entry : map.entrySet()) {
            String lastName = entry.getKey();
            Date date = entry.getValue();
            if (date.toString().contains("Jun") ||
                date.toString().contains("Jul") ||
                date.toString().contains("Aug")) {
                    keys[counter] = lastName;
                    counter++;
            }
        }
        for (String key : keys){
            map.remove(key);
        }
//        System.out.println(map.size());
    }

    public static void main(String[] args) throws ParseException {
        Map<String, Date> map = createMap();
        removeAllSummerPeople(map);
    }
}






























