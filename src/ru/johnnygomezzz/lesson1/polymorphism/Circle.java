package ru.johnnygomezzz.lesson1.polymorphism;

public class Circle extends Shape{
    public Circle(int width, int height) {
        super(width, height);
    }

    @Override
    public void draw() {
        System.out.println("Круг нарисован.");
    }

    @Override
    public void setColor(String color) {
        System.out.println("Круг раскрашен в " + color + " цвет.");
    }
}
