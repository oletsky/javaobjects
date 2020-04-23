package javatraining.oletsky.oop;

/**
 * @author O.Oletsky
 * Demonstration of hiding and overriding
 */

public class HideAndOverrideTester {
    public static void main(String[] args) {
        Base base = new Sub();
        base.foo();
        System.out.println(base.a);
    }
}

class Base {
    String a = "The field of superclass";
    public void foo() {
        System.out.println("The method of superclass");
    }
}

class Sub extends Base {
    String a = "The field of subclass";

    @Override
    public void foo() {
        System.out.println("The method of subclass");
    }


}


