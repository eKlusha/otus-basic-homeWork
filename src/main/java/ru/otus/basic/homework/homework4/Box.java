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

    public void setColor(String newColor) {
        color = newColor;
    }

    public void closed() {
        if (statusOpen) {
            statusOpen = false;
            System.out.println("коробка закрыта");
        }
        System.out.println();
    }
        public void open() {
        if (!statusOpen) {
            statusOpen = true;
            System.out.println("коробка открыта");
        }
        System.out.println();
    }

    public void info() {
        System.out.println("Раземры коробки: " + SIZE_X + "мм, " + SIZE_Y + "мм, " + SIZE_Z + "мм.\n" +
                "Цвет коробки : " + color);
        if (statusEmpty) {
            System.out.println("коробка пуста");
        } else {
            System.out.println("в коробке лежит предмет");
        }
        if (statusOpen) {
            System.out.println("коробка открыта");
        } else {
            System.out.println("коробка закрыта");
        }
        System.out.println();
    }

    public void put() {
        if (!statusEmpty && statusOpen) {
            System.out.println("прежде чем положить предмет, выкиньте тот, который уже лежит в коробке");
        }
        if (statusEmpty && !statusOpen) {
            System.out.println("прежде чем положить предмет откройте коробку");
        }
        if (!statusEmpty && !statusOpen) {
            System.out.println("прежде чем положить предмет, откройте коробку и выкиньте тот, который уже лежит в коробке");
        }
        if (statusOpen && statusEmpty) {
            statusEmpty = false;
            System.out.println("Вы положили предмет в коробку");
        }
        System.out.println();
    }

    public void take() {
        if (statusEmpty && statusOpen) {
            System.out.println("из коробки нечего брать");
        }
        if (!statusOpen) {
            System.out.println("сначала откройте коробку");
        }
        if (statusOpen && !statusEmpty) {
            statusEmpty = true;
            System.out.println("Вы забрали предмет из коробки");
        }
        System.out.println();
    }
}