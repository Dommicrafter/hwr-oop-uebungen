package com.dschumann.deg.section.two;

public class Test {
    int test = 10;

    public static void TestMethode(int test){ //variable test is already defined in method TestMethode(int)
        //int test;

        System.out.println(test); // test wird sonst von Methode überschrieben
    }
}
