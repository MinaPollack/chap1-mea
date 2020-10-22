package edu.bi.chapone.projects;

public class JackBuilt {
    public static void main (String[] args){
        System.out.println("This is the house that Jack built.");
        putBlankLink();
        System.out.println("This is the malt,");
        house();
        System.out.println("This is the rat,");
        malt();
        System.out.println("This is the cat,");
        rat();
        System.out.println("This is the dog,");
        cat();
        System.out.println("This is the cow with the crumpled horn,");
        dog();
        System.out.println("This is the maiden all forlorn,");
        cow();
    }

    //prints two spaces
    public static void putBlankLink() {
        System.out.println();
        System.out.println();
    }

    //prints house verse followed by space()
    public static void house () {
        System.out.println("That lay in the house that Jack built.");
        putBlankLink();
    }

    //prints malt verse followed by house
    public static void malt () {
        System.out.println("That ate the malt,");
        house();
    }

    //prints rat verse followed by malt verse
    public static void rat () {
        System.out.println("That killed the rat,");
        malt();
    }

    public static void cat () {
        System.out.println("That worried the cat,");
        rat();
    }

    public static void dog () {
        System.out.println("That tossed the dog,");
        cat();
    }

    public static void cow ( ){
        System.out.println("That milked the cow with the crumpled horn,");
        dog();
    }
}
