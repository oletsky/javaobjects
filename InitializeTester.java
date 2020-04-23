package javatraining.oletsky.oop;

/**
 * @author O.Oletsky
 * Demonstration of static and non-static initializers
 */

public class InitializeTester {
    public static void main(String[] args) {
        Initialized ekz1 = new Initialized();
        System.out.println("-----");
        Initialized ekz2 = new Initialized();
        System.out.println("-----");
        Initialized ekz3 = new Initialized(1);
        System.out.println("-----");
    }
}

class Initialized {
    {
        System.out.println("Non-static initialization");
    }

    static {
        System.out.println("Static initialization");
    }

    public Initialized() {
        System.out.println("Constructor without arguments called");
    }

    public Initialized(int n) {
        System.out.println("Constructor with one argument called");
    }
}
