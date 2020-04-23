package javatraining.oletsky.oop;

/**
 * @author O.Oletsky
 * Demonstrates how the static initialization is performed
 * when a class is loaded with Class.forName()
 */

public class DemoLoadingAndStatic {
    public static void main(String[] args) {
        try {
            Class.forName("javatraining.oletsky.oop.Loaded");
            Class.forName("javatraining.oletsky.oop.Loaded"); //Ignored
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Loaded {
    static {
        System.out.println("Class loaded");
    }
}
