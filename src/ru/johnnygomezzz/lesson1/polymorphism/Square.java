package ru.johnnygomezzz.lesson1.polymorphism;

public class Square extends Shape{
    public Square(int width, int height) {
        super(width, height);
    }

    @Override
    public void draw() {
        System.out.println("Квадрат нарисован.");
    }

    @Override
    public void setColor(String color) {
        System.out.println("Квадрат раскрашен в " + color + " цвет.");
    }
}
