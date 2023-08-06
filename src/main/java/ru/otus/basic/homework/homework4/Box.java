package ru.otus.basic.homework.homework4;

class Box {
    private final int SIZE_X;
    private final int SIZE_Y;
    private final int SIZE_Z;
    private String color;
    private boolean statusOpen;
    private boolean statusEmpty;


    Box(int SIZE_X, int SIZE_Y, int SIZE_Z, String color, boolean statusEmpty, boolean statusOpen) {
        this.SIZE_X = SIZE_X;
        this.SIZE_Y = SIZE_Y;
        this.SIZE_Z = SIZE_Z;
        this.color = color;
        this.statusEmpty = statusEmpty;
        this.statusOpen = statusOpen;
    }

    public int getSIZE_X() {
        return SIZE_X;
    }
    public int getSIZE_Y() {
        return SIZE_Y;
    }
    public int getSIZE_Z() {
        return SIZE_Z;
    }
    public String getColor() {
        return color;
    }
    public boolean getStatusEmpty() {
        return statusEmpty;
    }
    public boolean getStatusOpen() {return statusOpen;}
    public void boxInfo() {
        System.out.println("Раземры коробки: " +SIZE_X +  "мм, " + SIZE_Y+  "мм, " +SIZE_Z +  "мм.\n" +
                "Цвет коробки : " + color);
    }
}