package ru.otus.basic.homework.lessons;

public class Lesson10OOP {
    public static void main(String[] args) {
//        Cat Belphegor = new Cat();  // объект/экземпляр класса
//        Belphegor.name = "Бельфегор";
//        Belphegor.color = "Чёрный";
//        Belphegor.age = 4;                //такой инициализацие не пользоваться
//        Belphegor.weight = 3f;
//
//        Cat Bruno = new Cat();
//
//        Bruno.name = "Бруно";
//        Bruno.color = "Чёрный";
//        Bruno.age = 5;
//        Bruno.weight = 6f;
        Cat Belphegor = new Cat("Бельфегор", "Чёрный", 4, 3.1f);
        Cat Bruno = new Cat("Бруно", "Чёрный", 5, 6.2f);

        Belphegor.info();
        Belphegor.eat();
        Belphegor.info();
        Belphegor.jump();
        Belphegor.meow();
        Belphegor.getName(); // вызов геттера
        Belphegor.setName("Бельфегор"); // вызов сеттера



    }

    public static void SumAndPrint(int a, int b, int c) {   // перегрузка метода SumAndPrint
        System.out.println(a + b + c);
    }
    public static void SumAndPrint(float a, float b, float c) {
        System.out.println(a + b + c);
    }
    public static void SumAndPrint(long a, long b, long c) {
        System.out.println(a + b + c);
    }
}
