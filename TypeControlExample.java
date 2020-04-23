package javatraining.oletsky.oop;

/**
 * @author O.Oletsky
 * A simple example illustrating type control in Java
 * If the type and the class of an istance are different
 * you can use methods of the type only
 */

public class TypeControlExample {
    public static void main(String[] args) {
        Object s = "qwerty";
        System.out.println(s.getClass().getName()); //String
        // System.out.println(s.length()); //Impossible
    }
}
