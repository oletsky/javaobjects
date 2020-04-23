package javatraining.oletsky.oop;

/**
 * @author O.Oletsky
 * An example demonstrating chain of constructors
 */
public class DemoConstructorChain {
    public static void main(String[] args) {
        var ekz = new SubClass();
    }
}

class SuperClass {
    public SuperClass() {
        System.out.println("Superclass constructor called");
    }

}

class SubClass extends SuperClass {
    public SubClass() {
        System.out.println("SubClass constructor called");
    }
}
