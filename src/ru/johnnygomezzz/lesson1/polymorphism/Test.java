package ru.johnnygomezzz.lesson1.polymorphism;

public class Test {
    public static void main(String[] args) {
        Shape redTriangle = new Triangle(100, 50);
        redTriangle.draw();
        redTriangle.setColor("красный");
    }
}
