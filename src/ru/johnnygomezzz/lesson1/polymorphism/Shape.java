package ru.johnnygomezzz.lesson1.polymorphism;

public abstract class Shape implements Drawable, Colorable {
    private int Width;
    private int Height;

    public Shape(int width, int height) {
        Width = width;
        Height = height;
    }

    public int getWidth() {
        return Width;
    }

    public void setWidth(int width) {
        Width = width;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }
}
