package ru.johnnygomezzz.lesson1.polymorphism;

public class Triangle extends Shape{
    public Triangle(int width, int height) {
        super(width, height);
    }

    @Override
    public void draw() {
        System.out.println("Треугольник нарисован.");
    }

    @Override
    public void setColor(String color) {
        System.out.println("Треугольник раскрашен в " + color + " цвет.");
    }
}
