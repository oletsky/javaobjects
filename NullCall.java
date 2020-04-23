package javatraining.oletsky.oop;

/**
 * Can we call a method on an instance which is null?
 * Try to change this code so that it wouldn't raise NullPointerException
 */

public class NullCall {
    public static void main(String[] args) {
        NullCallClass ekz = null;
        ekz.foo();
    }
}

class NullCallClass {
    static public void foo() {
        System.out.println("It worked!");
    }
}
