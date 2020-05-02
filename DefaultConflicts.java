package javatraining.oletsky.oop;

public class DefaultConflicts {
    public static void main(String[] args) {
        TheInterface ekz = new ConflictClass();
        ekz.foo();
    }
}

interface TheInterface {
    default void foo() {
        System.out.println("Interface default realization");
    }
}

interface OtherInterface {
   default void foo() {
        System.out.println("Superclass realization");
    }
}

class ConflictClass
        implements  TheInterface, OtherInterface {

    @Override
    public void foo() {
        System.out.println("Own realization");
    }
}
