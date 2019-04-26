package com.dschumann.deg.section.two;

public class Triangle extends Point{
    private int base;
    private int height;

    public Triangle(final int x, final int y, final int base, final int height) {
        super(x, y);
        this.base = base;
        this.height = height;
    }

    public float fläche(){
        return 0.5f * base * height;
    }
}
