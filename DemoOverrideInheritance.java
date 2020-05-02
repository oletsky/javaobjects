package javatraining.oletsky.oop;

public class DemoOverrideInheritance {
    public static void main(String[] args) {
        Inheritor ekz = new Inheritor();
        ekz.foo();
    }
}

class Inherited {
    void foo() {
        System.out.println("Superclass method");
    }
}

class Inheritor extends Inherited{
    void foo() {
        System.out.println("Subclass method");
    }
}
