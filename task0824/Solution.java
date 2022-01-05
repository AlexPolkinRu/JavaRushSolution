package Javarush.task0824;

//package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human child1 = new Human("Вася", true, 2, new ArrayList<Human>());
        Human child2 = new Human("Катя", false, 4, new ArrayList<Human>());
        Human child3 = new Human("Боря", true, 6, new ArrayList<Human>());

        ArrayList<Human> children = new ArrayList<>();
        children.add(child1);
        children.add(child2);
        children.add(child3);
        Human father = new Human("Анатолий Дмитриевич", true, 34, children);
        Human mother = new Human("Светлана Сергеевна", false, 30, children);

        ArrayList<Human> grand1 = new ArrayList<>();
        ArrayList<Human> grand2 = new ArrayList<>();
        grand1.add(father);
        grand2.add(mother);

        Human grandfather1 = new Human("Дмитрий Сергеевич", true, 59, grand1);
        Human grandmother1 = new Human("Елена Анатольевна", false, 57, grand1);
        Human grandfather2 = new Human("Сергей Александрович", true, 62, grand2);
        Human grandmother2 = new Human("Ольга Борисовна", false, 59, grand2);

        System.out.println(grandfather1);
        System.out.println(grandmother1);
        System.out.println(grandfather2);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }

            return text;
        }
    }
}