package javatraining.oletsky.oop;

/**
 * @author O.Oletsky
 * A very simple example of overloaded methods
 */

public class SimpleOverLoadTester {
    public static void main(String[] args) {
        var ekz = new SimpleOverloads();
        ekz.foo(); //No arguments
        ekz.foo(1); //Argument is int
        ekz.foo("qwerty"); //Argument is String

    }

}

class SimpleOverloads {
    void foo() {
        System.out.println("No arguments");
    }

    void foo(int a) {
        System.out.println("Argument is int");
    }

    void foo(String a) {
        System.out.println("Argument is String");
    }

}
