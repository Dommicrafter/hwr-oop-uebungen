package com.dschumann.deg.section.two;

public class thirdUebung {

    public static void AufgabeFuenf(){
        Point point = new Point(2,3);
        Line line = new Line(2,3,4,5);

        Rectangle rect = new Rectangle(2,3,5,10);
        System.out.println("Die Fläche des Rechtecks beträgt: " + rect.fläche());

        Triangle triforce = new Triangle(4,5, 5, 2);
        System.out.println("Die Fläche des Dreiecks beträgt: " + triforce.fläche());
    }

    public static void AufgabeVier(){
        Test.TestMethode(20);
    }
}
