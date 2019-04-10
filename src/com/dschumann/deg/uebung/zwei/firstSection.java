package com.dschumann.deg.uebung.zwei;

import java.util.Timer;

public class firstSection {

    public static void aufgabeEinsZwei(){
        int[] myAr = new int[10];

        for (int i = 1; i < 11; i++) {
            myAr[i-1] = i;
        }
        System.out.println("while");
        int count = 0;
        while (count < 10){
            System.out.println(myAr[count]);
            count++;
        }
        System.out.println("Do while");

        int count2 = 0;
        do {
            System.out.println(myAr[count2]);
            count2++;
        }while (count2 < 10);

        System.out.println("for");
        for (int i = 0; i < 10; i++) {
            System.out.println(myAr[i]);
        }

        System.out.println("for each");
        for (int my : myAr){
            System.out.println(my);
        }
    }

    public static void aufgabeDreiVier(){
        int[][] moreDimensions = {{11,12,13,14}, {21,22,23,34}, {31,32,33}, {41,42,43,44}};
        printSimpleComplexArray(moreDimensions);

        System.out.println("For Each Schleife");
        printComplexArray(moreDimensions);

        moreDimensions[1][1] = 7;

        int[] lonelyDimension = {31,32,33,34};
        moreDimensions[2] = lonelyDimension;
        System.out.println("New Array");
        printSimpleComplexArray(moreDimensions);


    }

    public static void aufgabeFuenf(){
        long prettyLong = Integer.MAX_VALUE;

        prettyLong = prettyLong + 100;

        int couldNotBeSoLong = (int) prettyLong;
        System.out.println(couldNotBeSoLong);
    }

    public static void aufgabeSechs(){
        short negative = -20;

        char shouldntBeNegative = (char) negative;
        short whatIsIt = (short) shouldntBeNegative;
        System.out.println(shouldntBeNegative);
        System.out.println(whatIsIt);
    }

    public static void augabeSiebenAchtNeun(){
        float gebrochen = 5.0f/7.0f;
        int notGebrochen = (int) gebrochen; // wird immer abgerundet
        System.out.println(notGebrochen);

        System.out.println(0.0/0.0); // NaN
        System.out.println(1.0/0.0); //Bis zur Unendlichkeit und noch viel weiter
        System.out.println((1.0/49)*49); // 0.999999...
        System.out.println(Math.sqrt(3) * Math.sqrt(3) == 3); // false

        System.out.println(System.currentTimeMillis());
        int ueberlauf = Integer.MAX_VALUE;
        System.out.println(ueberlauf + 1); //s. Aufgabe 5
        System.out.println("Laufzeit: " + System.currentTimeMillis()); // ist keine Laufzeit zu sehen ..
        //TODO: Um Laufzeit kümmern
    }

    private static void printComplexArray(int[][] array){
        for (int[] oneDimension : array){
            for (int noDimension: oneDimension){
                System.out.print(noDimension + "  ");
            }
            System.out.println();
        }
    }

    private static void printSimpleComplexArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
