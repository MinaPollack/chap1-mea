package edu.bi.chapone.projects;

//TODO fix expected number of args problems
public class StarFigures {
    public static void main (String[] args){
        rows();
        x();
        System.out.println();
        rows();
        x();
        rows();
        System.out.println();
        column();
        rows();
        x();
    }
    public static void rows(){
        System.out.println("*****\n*****");
    }
    public static void x (String[] args){
        System.out.println(" * *\n  *\n * *");
    }
    public static void column (String[] args){
        System.out.println("   *\n   *\n   *");
    }
}