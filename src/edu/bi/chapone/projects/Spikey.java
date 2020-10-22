package edu.bi.chapone.projects;

public class Spikey {
    public static void main (String[] args) {
        down();
        left(); right();
        left(); down(); right();
        right(); up(); left();
        right(); left();
        up();
    }

    //TODO -- use print instead of println
    // Note: println("foo") <=> print("foo\n")
    public static void down () {
        System.out.println("\\/");
    }
    public static void left () {
        System.out.println("\\\\");
    }
    public static void right () {
        System.out.println("//");
    }
    public static void up () {
        System.out.println("/\\");
    }
}