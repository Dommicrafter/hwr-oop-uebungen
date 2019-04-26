package com.dschumann.deg.section.two;

public class Rectangle extends Point{
    private int width;
    private int height;

    public Rectangle(final int x, final int y, final int width, final int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public int fläche(){
        return width * height;
    }
}
