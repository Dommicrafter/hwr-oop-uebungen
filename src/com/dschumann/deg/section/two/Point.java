package com.dschumann.deg.section.two;

public class Point {
    private int x;
    private int y;

    private static int anzahl = 77;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
        anzahl++;

        System.out.println(anzahl + " Objekte wurden bereits erstellt");
    }
}
