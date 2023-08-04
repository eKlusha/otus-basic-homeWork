package ru.otus.basic.homework.lessons;

public class Cat {
    public static int catsCount = 0; //статическое поле класса
    private String name; // поля метода/свойства
    private String color;
    private float weight;
    private int age;


    public Cat(String name, String color, int age, float weight) { // конструктор класса
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
        catsCount++;
    }

    public String getName() {   //стандартный геттер
        return name;
    }
    public String getColor() {
        return color;
    }
    public int getAge() {
        return age;
    }
    public float getWeight() {
        return weight;
    }

    public void setName(String name) {  // стандартный сеттер, можно добавлять условия изменения
        this.name = name;
    }
    public void serColor(String color) {
        this.color = color;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public void eat() {
        System.out.println(name + " поел");
        weight += 0.01f;

    }

    public void meow() {
        System.out.println(name + " мяукнул");
    }

    public void jump() {
        System.out.println(name + " подпрыгнул");
    }

    public void info() {
        System.out.println(name + " " + color + " " + weight + " " + age);
    }
}
