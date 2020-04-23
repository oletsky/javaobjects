package javatraining.oletsky.oop;

/**
 * @author O.Oletsky
 * A case when null is the argument of an overloaded function
 */

public class NullChainOverloadTester {
    public static void main(String[] args) {
        new NullChainOverload().foo(null); //Integer
    }
}

class NullChainOverload {
    void foo(Integer a) {
        System.out.println("Integer");
    }

    void foo(Number a) {
        System.out.println("Number");
    }
}

