package ru.otus.basic.homework.homework4;

import javax.swing.*;

public class HomeWork4 {
    public static void main(String[] args) {
        User[] users = new User[]{
                new User("Александров", "Александр", "Александрович", 1993, "AAA@ideal.world"),
                new User("Борисов", "Борис", "Борисович", 1995, "BBB@ideal.world"),
                new User("Владимиров", "Владимир", "Владимирович", 1985, "VVV@ideal.world"),
                new User("Григорьев", "Григорий", "Гигорьевич", 1998, "GGG@ideal.world"),
                new User("Дмитриев", "Дмитрий", "Дмитриевич", 1975, "DDD@ideal.world"),
                new User("Евгеньев", "Евгений", "Евгеньевич", 1981, "EEE@ideal.world"),
                new User("Жмышенко", "Валерий", "Альбертович", 1960, "glad@ideal.world"),
                new User("Зубенко", "Михаил", "Петрович", 1979, "mafioznik@ideal.world"),

        };
        int nowYear = 2023; // можно было бы через сканер организовать, но не перегружаем код
        for (int i = 0; i < users.length; i++) {
            if (nowYear - users[i].getYearOfBorn() > 40) {
                users[i].info();
                System.out.println();
            }
        }
        Box box1 = new Box(300,400,200,"black",true,true);
        box1.boxInfo();

    }
}


